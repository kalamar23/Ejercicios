
public class ReferenciaExterna {

	int x = 7;
	
	class ReferenciaInterna {

		public void verClaseExterna(){
			
			System.out.println("El valor x de la clase externa es " + x);
			System.out.println("La referencia a la clase interna : " + this);
			System.out.println("La referencia a la clase externa :" + ReferenciaExterna.this);
		}
		
		
		
	}
	
	public void crearInterna(){
		
		ReferenciaInterna ri = new ReferenciaInterna();
		ri.verClaseExterna();
	}
	
	
	public static void main(String[] args){
		
		ReferenciaExterna.ReferenciaInterna re1 = new ReferenciaExterna().new ReferenciaInterna();
	
		re1.verClaseExterna();
		
	}
	
	
}
