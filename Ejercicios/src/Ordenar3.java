import javax.swing.JOptionPane;


public class Ordenar3 {

	/*
	 * Leer dos series de 5 enteros, que estarán ordenados crecientemente.
	 * Copiar (fusionar) las dos tablas en una tercera, de forma que sigan
	 * ordenados
	 */
	
	public void ordenar(){
		
		int[] valores1 = new int [5];
		int[] valores2 = new int [5];
		int[] mezcla = new int [10];
for(byte i = 0;i < valores1.length;i++){
	
	valores1[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero (crecientemente) : "));
	valores2[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero (crecientemente) : "));	
}
		


for(byte i = 0;i < valores1.length;i++){
	System.out.println();
	System.out.print("valores1 [" + i + "] = " + valores1[i] + " ");
	System.out.print("valores2 [" + i + "] = " + valores2[i]);

}
	
byte i = 0;
byte j = 0;
byte k = 0; // total

while(i < 5 && j < 5){ 
	
	if(valores1[i] < valores2[j]){
		
		mezcla[k] = valores1[i];
		i++;
		k++;
	}
	
	else{
		
		mezcla[k] = valores2[j];
		j++;
		k++;
	}
}	

if(i == 5) // resto de valores1 y resto de valores2
	while(j < 5){
		
		mezcla[k] =  valores2[j];
		j++;
		k++;
	}
else
	while(i < 5){
		mezcla[k] = valores1[i];
		i++;
		k++;
	
	}

for(byte m = 0; m < mezcla.length;m++){
	
	System.out.println("mezcla [" + m + "] = " + mezcla[m]);
	
	
	
}


}


	/* Leer por teclado una serie de 10 números enteros. La aplicación debe indicarnos si los números están
	 ordenados de forma creciente, decreciente, o si están desordenados*/
	
	public void ordenar2(){
		int[] valores = new int [10];
	
		for(byte i = 0;i < valores.length;i++){
			
			valores[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero : "));
			
		}
// determinar si está ordenado de forma creciente 
	boolean creciente = true;
	boolean decreciente = true;

	for(byte i = 1; i < valores.length;i++){
			
			for(byte j = 0;j < valores.length - i;j++){
				
if(valores[j] > valores[j  + 1]){
	
	creciente = false; 
}

if(valores[j] < valores[j + 1]){
	
	decreciente = false;
}

			}
			
		}

	if(creciente){
		JOptionPane.showMessageDialog(null, "Los numeros ingresados están ordenados de forma creciente ");
	}		
	
	if(decreciente){
		JOptionPane.showMessageDialog(null, "Los numeros ingresados están ordenados de forma decreciente ");
	}	
		
	if(!(decreciente || creciente)){
		JOptionPane.showMessageDialog(null, "Los numeros ingresados están desordenados ");
	}		
	}
		
	
	//  Crear y cargar una tabla de tamaño 10x10, mostrar la suma de cada fila y de cada columna

	public void ordenar3(){
		
int [][] valores = {{1, 2, 3}, 
		           {3 , 2 , 1}, 
		           {5, 4, 2}};

int suma_colu = 0, suma_fila = 0;		



		for(byte i = 0;i < valores.length;i++){
			
			for(byte j = 0; j < valores.length;j++){
				
				suma_colu += valores[i][j];
			}
			
			
		}
		
	for(byte j = 0;j < valores.length;j++){
			
			for(byte i = 0; i < valores.length;i++){
				
				suma_fila += valores[i][j];
		System.out.println("valores [" + i +"][" + j + "] = " + valores[i][j]);
			
			}
		}
		
	JOptionPane.showMessageDialog(null, "Suma de columnas : " + suma_colu);
	JOptionPane.showMessageDialog(null, "Suma de filas : " + suma_fila);	
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {

		
Ordenar3 T = new Ordenar3();

T.ordenar3();

		
	}

}




/*//comenzamos a fusionar a y b en c
byte i=0;   // utilizaremos i como índice de a;
byte j =0;   // utilizaremos j como índice de b;
byte k=0;   // utilizaremos k como índice de c
while(i<5 && j<5)
{
 if (valores1[i] < valores2[j])    // nos interesa el elemento de a
 {
     c[k] = valores1[i];
     i++; // incrementamos i para tomar el siguiente elemento de a
 }
 else
 {
     c[k] = valores2[j];
     j++;  // incrementamos j para tomar el siguiente elemento de b
 }
 k++;  // como hemos copiado a c[k], incrementamos k, para
       // en la siguiente vuelta, utilizar el siguiente hueco de la tabla
}
//cuando salimos de while es por que alguna de las tablas (a o b) ha llegado al final
if(i==5)   // hemos copiado toda la tabla a en c, queda por copiar un resto de b
 while (j<5)
 {
     c[k] = valores2[j];
     j++;
     k++;
 }
else    // hay que copiar el resto de a en c
 while (i<5) {
     c[k] = valores1[i];
     i++;
     k++;
 }
System.out.println("Mostramos la tabla c:");
for (k=0;k<10;k++)
 System.out.print(c[k] + "   ");
System.out.println("");
	}*/