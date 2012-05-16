/** Uso de this , para evitar ambiguedad
 */

class Ventana {

private	int largo;
private	int ancho;
	
Ventana (int largo, int ancho){
		
		this.largo = largo;
		this.ancho = ancho;
	}

// ambos metodos retornan al mismo objeto, se puede incrementar el valor
public Ventana increLargo(){
	
	++largo;
	return this;
}

public Ventana increAncho(){
	++ancho;
	return this;
}

public int getAncho(){
	return ancho;
}

public int getLargo(){
return this.largo;	
}
public void mostrar(){

	System.out.println("Ancho :" +getAncho() + " y " + "Largo : "  +getLargo() );

	
}
}
public class UsoThis {

	public static void main(String[] args) {
// creación de objetos

Ventana A = new Ventana(0,0);
System.out.println("Valor referencia A ");
A.mostrar();
A.increAncho().increAncho();
System.out.println("Referencia A incrementa valor Ancho en dos veces : ");
A.mostrar();
// se referencia a objeto Ventana pero no se crea objeto
Ventana B;
// se incrementa el largo en 1 vez
B = A.increLargo();
System.out.println("Referencia A y B apuntan al mismo objeto ");
A.mostrar();
B.mostrar();
		
	}

}
