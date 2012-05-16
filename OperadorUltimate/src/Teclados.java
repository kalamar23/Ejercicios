/** Creacion de objetos y usos de referencia
 */
class Synth {
int teclas;
int botones;

Synth(int teclas, int botones){
this.teclas = teclas;
this.botones = botones;
}

Synth (){
	teclas = 0;
	botones = 0;			
}
public Synth increTeclas(){
	
++teclas;	
	return this;	
}

public Synth increBotones(){	
	++botones;
	return this;
}

public int getTeclas() {
	return teclas;
}

public int getBotones() {
	return this.botones;
}

public void mostrar (){
	
	System.out.println("Numero de teclas :" +getTeclas() + " y " + " botones :" + getBotones());
	
	
}


}


public class Teclados {

	
	
	public static void main(String[] args) {
		// Creacion de objetos
Synth A = new Synth(0, 0);
System.out.println("Valor referencia A");
A.mostrar();
System.out.println("Referencia A incrementa el valor de teclas dos veces");
A.increTeclas().increTeclas();
A.mostrar();
// crearemos una referencia a Synth , pero sin crear objeto
Synth B;
B = A.increBotones();
System.out.println("Referencia A y B apuntan al mismo objeto");
A.mostrar();
B.mostrar();
	
	}

}
