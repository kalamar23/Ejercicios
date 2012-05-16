import javax.swing.*;
import java.awt.event.*;;
class Refri extends JFrame {
private double Enfr;
private int Venti;
	
Refri(double Enfr, int Venti){
	
	this.Enfr = Enfr;
	this.Venti = Venti;
	
}

Refri(){
	Enfr = 15.0;
	Venti = 20;		
}


public Refri increFrio(){
	
	Enfr += 3;
	return this;
}

public Refri decreFrio(){
	
	Enfr -= 3;
	return this;
}





public Refri increVenti(){
	
	Venti += 3;
	return this;
}

public Refri decreVenti(){
	
	Venti -= 3;
	return this;
}


public void Mostrar(){
	
	System.out.println("Temp enfriador : " + Enfr + " y " + " Velocidad de ventilacion : " + Venti);
	
	
}

	
}


public class Clima {
	public static void main(String[] args) {
		// TODO Creacion  de objetos

Refri A = new Refri (15.0 , 30);		
		
		System.out.println("Muestra valor de referencia A : ");
		A.Mostrar();
		System.out.println("Demasiada calor ! - Disminuye temp de Enfriador 2 veces - Referencia A");
		A.decreFrio().decreFrio();
		A.Mostrar();
Refri B;
B = A.decreVenti();
System.out.println("Referencia A y B apuntan al mismo objeto ");
A.Mostrar();
B.Mostrar();
		
	}

}
