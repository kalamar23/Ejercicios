import java.util.*;
public class Insertar {

	// Dos Arrays  A y B , transponer A en B y mezclar a y b en c
	
public void trans(){
	Stack st1 = new Stack();
	Stack st2 = new Stack();

	
	int[][] valor1 = new int [4][5]; 
	int[][] valor2 = new int [5][4];
	int[] mezcla = new int[50];

	for(byte i = 0; i < valor1.length;i++){
		for(byte j = 0;j < valor1[i].length;j++){
			valor1[i][j] = (int) (Math.random() * 98);	
		st1.add(0, new String("valor1[" + i + "][" + j + "] = " + valor1[i][j]));
		
		}
	}
	
	for(byte i = 0; i < valor2.length;i++){
		for(byte j = 0;j < valor2[i].length;j++){	
			valor2[i][j] = valor1[j][i];
			st2.add(0, new String("valor2[" + i + "][" + j + "] = " + valor2[i][j]));
		}
	}	
while((!st1.empty())){
	
	System.out.println(st1.pop());
	System.out.println(st2.pop());

	
}
}


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Insertar in = new Insertar();
		in.trans();
		
	}

}
