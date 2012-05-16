/** En esta clase se creara un arreglo de los tipos de datos enum (clase Especies)
 * y ordenaremos estos en una lista 
 */

import java.util.*;
public class Animales {
Especies es;
	public Especies especie [] = {
			
			Especies.Ballena_de_Agua, Especies.Cojinova_de_Agua, Especies.Condor_de_Aire,
			Especies.Conejo_de_Tierra, Especies.Perro_de_Tierra, Especies.Zorro_de_Tierra		
	};
	

	private List<Especies> ls;
// constructor de la clase
public Animales(){
	ls = new ArrayList<Especies>();
for (int i = 0; i < especie.length;i++){
	ls.add(especie[i]);
	especie[i] = null;
	
}

	Collections.shuffle(ls);
//	imprimir(ls);
}	

static void imprimir (List<Especies> list) {
	System.out.println(list.size());
	for (int i = 0 ; i < list.size();i++){
		System.out.println(list.remove(i));
	}
	
}


	public static void main(String[] args) {

		// Creacion de objetos

Animales A = new Animales();
Animales B = new Animales();
Animales D = new Animales();

A.es = Especies.Ballena_de_Agua;
B.es = Especies.Zorro_de_Tierra;



System.out.println("El animal escogido es una = " + A.es);
System.out.println("El animal escogido es una = " + A.es.getHabitat());

	}

}
