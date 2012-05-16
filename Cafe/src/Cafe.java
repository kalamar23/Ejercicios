/** Programa cafetería , muestra uso de clase enum
 */

enum TamanodeCafe {

	CHICO(50), MEDIANO(100), GRANDE(200);
int cc;	

TamanodeCafe (int cc){

	this.cc = cc;
	
}

public int getCc (){
	
	return this.cc;
}
	
	
	
	
}

public class Cafe {
TamanodeCafe tc;
	
	public static void main(String[] args) {
		// Creacion de objetos
Cafe c1 = new Cafe ();
Cafe c2 = new Cafe ();
c1.tc = TamanodeCafe.CHICO;
c2.tc = TamanodeCafe.GRANDE;


System.out.println("El tamaño de cafe escogido es : " +c1.tc);
System.out.println("El tamaño de cafe escogido es : " +c2.tc);

System.out.println("La cantidad escogida en CC es : " +c1.tc.getCc());
System.out.println("La cantidad escogida en CC es : " +c2.tc.getCc());



		
	}

}
