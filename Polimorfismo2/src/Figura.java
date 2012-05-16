// superclase de la jerarquia 
public abstract class Figura {

	protected String nombre;
	protected int color;
	protected int grosorborde;
/**
 * 	Devuelve nombre de la figura
 * @return
 */
public String getNombre(){
	
	return this.nombre;
}

public void setNombre(String nombre){
	
	this.nombre = nombre;

}

public int getColor(){
	
	return this.color;
}

public void setColor(int color){
	
	this.color = color;
	
}

public int getGrosorBorde(){
	
	return this.grosorborde;
}

public void setGrosorBorde(int grosorborde){
	
	this.grosorborde = grosorborde;

}

public abstract void dibujar();

}
