package structuralDesignPatterns.Facade;

public class OrganismFacade implements Facade {
	
	Animal a;
	Plant p;
	
	public OrganismFacade(Animal a , Plant p){
		this.a = a;
		this.p = p;
	}

	@Override
	public void task(String s) {

		if(s.equals("Animal")){
			a.feed();
		}else{
			p.photosynthesis();
		}
		
	}
}
