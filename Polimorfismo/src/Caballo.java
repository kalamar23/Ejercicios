
public class Caballo extends Animal {

	public void comer(){
		
		System.out.println("Caballo comiendo...");
	}
	
public void relinchar(){
	
	System.out.println("Caballo relinchando...");
}
	
	
	
	
	
	public static void main(String[] args ){
		
	//	Animal a = new Animal();
	//	Caballo b = new Caballo();
	
		
		// Polimorfismo 
		
		Animal a = new Caballo();
		Caballo b = new Caballo();

		a.comer();
		b.comer();
	
		
		
	}
	
	
}
