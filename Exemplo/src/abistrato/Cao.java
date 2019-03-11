package abistrato;

public class Cao extends Animal {

	public void fazBarulho() {
		
		System.out.println("Au au!");
	}

	public static void main(String[] args) {
		Cao cao = new Cao();
		cao.fazBarulho();
		cao.getEspecie();
		cao.getAlimento();
		
		
		
	}
	 

}
