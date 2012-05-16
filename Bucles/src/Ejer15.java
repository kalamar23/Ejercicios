import javax.swing.*;
import javax.swing.table.*;
public class Ejer15 extends JFrame {

public static int ALTURA = 700;
public static int ANCHO = 300;
public static String TITULO  = "Vector por claudio";
	

Object [][] valores = new Object [5][5];
// random numeros de dos digitos 
public void random(Object[][] valores){
	int ran = 98;
for(int i = 0; i < valores.length;i++){
	for(int j=0; j < valores[i].length;j++){
		valores[i][j] = (int) (Math.random() * ran);
	}
}
}
String[] columna =  {"1", "2", "3", "4", "5"};

JTable tabla = new JTable(valores , columna);
JButton boton1 = new JButton("Boton1");

JScrollPane miscroll;

// constructor
public Ejer15(){
	super(TITULO);
	setSize(ALTURA,ANCHO);
	setVisible(true);
	addComponentes();
	random(valores);
}

public void addComponentes(){
	
miscroll = new JScrollPane (tabla);	
setContentPane(miscroll);	
}
	public static void main(String[] args) {
		// Creacion de objetos

	Ejer15 ej = new Ejer15();	
		ej.setLocationRelativeTo(null);
		ej.setResizable(false);
		
		
	}

}
