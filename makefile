TARGET  := creationalDesginPatternsExamples.jar
JAR     := jar cef CreationalDesginPatternsExamples
RFLAGS  := -g:none
DFLAGS  := -g
PREFIX  ?= /usr/local
DESTDIR ?= lib/$(basename $(TARGET))

SRCS := $(shell find src -name '*.java')
DOBJS := $(patsubst src/%.java, bin/debug/classes/%.class, $(SRCS))
DJAR := bin/debug/jar/$(TARGET)
ROBJS := $(patsubst src/%.java, bin/release/classes/%.class, $(SRCS))
RJAR := bin/release/jar/$(TARGET)
TSRCS := $(shell find test -name '*.java')
TOBJS := $(patsubst test/%.java, bin/test/classes/%.class, $(TSRCS))

#--------------------make ---------------------------------------------
release: $(dir $(ROBJS)) $(dir $(RJAR)) $(RJAR)
$(RJAR): $(ROBJS)
	$(JAR) $@ -C bin/release/classes .
bin/release/classes/%.class: src/%.java
	javac $(RFLAGS) -cp 'src:libs/*' -d bin/release/classes $<

#-----------------------make debug----------------------------------
debug: $(dir $(DOBJS)) $(dir $(DJAR)) $(DJAR)
$(DJAR): $(DOBJS)
	$(JAR) $@ -C bin/debug/classes .
bin/debug/classes/%.class: src/%.java
	javac $(DFLAGS) -cp 'src:libs/*' -d bin/debug/classes $<


#-------------------make test--------------------
test: $(dir $(TOBJS)) $(TOBJS)
bin/test/classes/%.class: test/%.java $(DOBJS)
	javac $(DFLAGS) -cp 'src:libs/*' -d bin/test/classes $<
	java -cp 'bin/test/classes:bin/debug/classes:libs/*' $(notdir $(basename $@))

$(sort $(dir $(ROBJS) $(DOBJS) $(TOBJS) $(DJAR) $(RJAR))):
	mkdir -p $@

install: $(basename $(RJAR))
	install -d $(PREFIX)/$(DESTDIR)
	install $(RJAR) $(PREFIX)/$(DESTDIR)
	install -d $(PREFIX)/bin
	install $< $(PREFIX)/bin

$(basename $(RJAR)): release
	echo '#!/usr/bin/sh' > $@
	echo '/usr/bin/java -jar $(PREFIX)/$(DESTDIR)/$(notdir $(RJAR))' >> $@
	chmod +x $@

#------------make clean----------------------
clean:
	rm -r bin
