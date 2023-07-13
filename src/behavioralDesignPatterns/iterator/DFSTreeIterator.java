package behavioralDesignPatterns.iterator;

import java.util.ArrayList;

public class DFSTreeIterator {
    class CustomPair{
        int index;
        Node node;
        CustomPair(int index, Node node){
            this.index = index;
            this.node = node;
        }
    }
    ArrayList<CustomPair> visted;
    Node root;
    Node prev;
    Node curr;

    DFSTreeIterator(Tree t){
        root = t.getRoot();
        curr = root;
        visted = new ArrayList<CustomPair>();
        if(curr != null){
            while(curr.children != null){
                visted.add(new CustomPair(0, curr));
                curr = curr.children.get(0);
            }
        }
    }

    boolean hasNext(){
        if(visted.isEmpty()){
            return false;
        }
        return true;
    }

    Node next(){
        int len = visted.size();
        CustomPair pair = visted.get(len-1);
        int index = pair.index;
        Node node = pair.node;
        visted.remove(len-1);
        if(len > 1){
            CustomPair parent = visted.get(len-2);
            if(index + 1 < parent.node.children.size()){
                visted.add(new CustomPair(index+1, parent.node.children.get(index+1)));
            }
        }
        return node;
    }
}
