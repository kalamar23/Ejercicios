import java.io.*;


public class Ejer6 extends Print {

	// reader
	static String read() throws IOException {
		BufferedReader S = new BufferedReader(new InputStreamReader(System.in));
	
		return S.readLine();		
	}
	
// Generar una matriz de 4 filas y 5 columnas con n£meros aleatorios entre 1 y 100, y hacer su matriz transpuesta.
	static void matrices (){
		int [][] normal = new int [4][5];
		int [][] transpuesta = new int [5][4];

		int intervalo = 101;
		for(int outer_index = 0;outer_index < normal.length;outer_index++){
			for(int inner_index = 0; inner_index < normal[outer_index].length;inner_index++){
				normal[outer_index][inner_index] = (int) (Math.random() * intervalo); 		
			
				System.out.println("normal [" + outer_index+ "][" + inner_index +"]" + " = " + normal[outer_index][inner_index] );
			
			}
		}
		
		for(int outer_index = 0;outer_index < transpuesta.length;outer_index++){
			for(int inner_index = 0; inner_index < transpuesta[outer_index].length;inner_index++){
				transpuesta[outer_index][inner_index] = normal[inner_index][outer_index];		
			
				System.out.println("transpuesta [" + outer_index+ "][" + inner_index +"]" + " = " + transpuesta[outer_index][inner_index] );
			
			}
		}
		
		
	}
	
// Cargar en una matriz las notas de los alumnos de un colegio en funcion del numero de cursos (filas) y 
//	del n£mero de alumnos por curso (columnas).
	static void colegio() throws IOException {
		int curso,alumno;
		System.out.println("Ingrese el numero de cursos : ");
	curso = Integer.parseInt(read());
	System.out.println("Ingrese el numero de alumnos : ");
	alumno = Integer.parseInt(read());
double [][] notas = new double [curso][alumno];	
int i1, i2;
for(int i = 0; i < notas.length;i++){
	System.out.println("Ingrese un curso : ");
i1 = Integer.parseInt(read());
	for(int j = 0; j < notas[i].length;j++){
		System.out.println("Ingrese un alumno: ");
i2 = Integer.parseInt(read());
System.out.println("Ingrese una nota : ");
notas [i1][i2] = Double.parseDouble(read());

	}
	
}
char op;
System.out.println("Desea ver las notas ? s o n :");
op = (char) System.in.read();
if(op == 's'){
	
	for(int i = 0; i < notas.length;i++){
		for(int j = 0; j < notas[i].length;j++){
			System.out.println(notas[i][j]);
		}
	}
	
	
}
else {
	System.out.println("El programa ha culminado !");
}



	}

	
	public static void main(String[] args) throws IOException {
		// TODO Creacion de objetos matrices();	colegio();
	}

}
