
public class Cuadrado extends Figura2D {

	int lado;


public int calcularPerimetro(){
	return lado + lado;
		
}


public void cambiarTamaño(){
	
	lado += 3;
}


public int calcularArea(){
	
	return lado * lado;
}

public void dibujar(){
	
	getNombre();
	
}

}
