
public class ClaseExterna {

	int x = 10;
	
	class ClaseInterna {
		
		public void verClaseExterna(){
			System.out.println("El valor x de la clase externa es : " + x);
		}
		
	}
	
	public void crearInterna(){
		
		ClaseInterna in = new ClaseInterna();
		in.verClaseExterna();
		
		
	}
	
	public void main(String[] args){
		ClaseExterna ce = new ClaseExterna();
		ce.crearInterna();
		
		
	}
	
	
	
	
}
