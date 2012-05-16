import java.util.*;
public class Yari extends Autos {

	    
	public void datos(){

		
		System.out.println("Tipo de vehiculo :" + "Sedan");
System.out.println("Fabricado en : " + "Japón");	
	

	}
	
public void unknow(){
	
	
	System.out.println("Metodo desconocido");
}
	
	
	
	public static void main(String[] args){
		
		
Yari a = new Yari();
Autos b = new Yari();

		a.datos();
	b.datos();

	
	
	}
	
	
}
