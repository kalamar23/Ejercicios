
public class CargoDesa {
	// Variables 
String nombre; double peso; String origen; String destino;

// Constructores 

CargoDesa(String nombre, double peso){
	
	this.setNombre(nombre);
	this.setPeso(peso);
}

CargoDesa(String origen, String destino){
	
	this.setDestino(destino);
	this.setOrigen(origen);
}

public String getNombre() {
	return nombre;
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}


public double getPeso() {
	return peso;
}

public void setPeso(double peso) {
	this.peso = peso;
}

public String getOrigen() {
	return origen;
}


public void setOrigen(String origen) {
	this.origen = origen;
}

public String getDestino() {
	return destino;
}

public void setDestino(String destino) {
	this.destino = destino;
}
	
public void imprimir(){
	if (nombre != null) {
	System.out.println("Nombre de carga : " +getNombre() + " " + "peso :" +getPeso() + " Kilos");
	}
	else if (origen != null){
	System.out.println("Origen de carga : " +getOrigen() + " " + "Destino de Carga :" +getDestino());
	}
}	
}
