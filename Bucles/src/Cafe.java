enum TamanoDeCafe {
	
	CHICO(20), Mediano(40), GRANDE(60);
int cc;
	
	
TamanoDeCafe(int cc){
	
	this.cc = cc;
	
}

public int getCC(){
	
	return this.cc;
}	
}


public class Cafe {
TamanoDeCafe tc;
	public static void main(String[] args) {
		// TODO Creacion de objetos
Cafe cf1 = new Cafe();
Cafe cf2 = new Cafe();
cf1.tc = TamanoDeCafe.CHICO;
cf2.tc = TamanoDeCafe.Mediano;
 
System.out.println("Tamaño de cafe escogido es " + cf1.tc);
System.out.println("Tamaño de cafe escogido es " + cf2.tc);

System.out.println("La cantidad escogida en CC es : " + cf1.tc.getCC());
System.out.println("La cantidad escogida en CC es : " + cf2.tc.getCC());


	}

}
