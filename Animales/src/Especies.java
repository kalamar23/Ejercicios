/** Uso de tipo de datos Enum y clase enum 
 * Un enum es un conjunto de variables que devuelven un valor constante. El tipo de dato enum asocia un literal
 * con un valor, permitiendo usar nombres más manejables que solo usar valores. El valor asociado no necesariamente
 * tiene que ser un numero, puede ser cualquier tipo de datos como veremos a continuacion
 */
public enum Especies { 

	Zorro_de_Tierra(Nombre.Zorro,Habitat.Tierra), 
	Cojinova_de_Agua(Nombre.Cojinova, Habitat.Agua), 
	Conejo_de_Tierra(Nombre.Conejo, Habitat.Tierra), 
	Ballena_de_Agua(Nombre.Ballena, Habitat.Agua), 
	Condor_de_Aire(Nombre.Condor , Habitat.Aire), 
	Perro_de_Tierra(Nombre.Perro , Habitat.Tierra);
	
	
// Constructor de la clase
Especies (Nombre nombre, Habitat habitat){

	// uso de this 
	
	this.habitat = habitat;
	this.nombre = nombre ;
}
private Habitat habitat;
// Getter habitat
public Habitat getHabitat() {
	return habitat;
}

private Nombre nombre;
//Getter nombre
public Nombre getNombre() {
	return nombre;
}


	
public enum Habitat {
	
	Aire, Agua, Tierra 
		
	}
	
public enum Nombre {
	
	Zorro, Cojinova, Aguila, Conejo, Ballena, Condor, Perro
	
	
}
	
	
	
}
