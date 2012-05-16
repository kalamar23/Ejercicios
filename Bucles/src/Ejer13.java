import javax.swing.*;
import javax.swing.table.*;
import java.awt.event.*;

class Valores extends JFrame {
// Crear un array de enteros de dos dimensiones con valores aleatorios de dos digitos

public static int ANCHURA=700;
public static int ALTURA=350;
public static String TITULO="Valores";
	  	
	// Array con 50 valores 
	Object [][] valores = new Object [5][10];
String[] colum ={ "1", "2", "3","4","5","6","7","8","9","10",};
private void random(Object [][] valores){
int ram = 98;	
	for(int i = 0;i < valores.length;i++){
		for(int j = 0;j < valores[i].length;j++){
			
			valores[i][j] = (int) (Math.random() * ram);
		}
	}
}

	JTable tabla = new JTable(valores , colum);
	JScrollPane miscroll;
	public Valores(){
		
	    super(TITULO);
	    setSize(ANCHURA,ALTURA);
    	addComponentes();
	    setVisible(true);
        random(valores);
	  }
	   public void addComponentes(){
	    
	     miscroll=new JScrollPane(tabla);
	    //setContentPane para convertirlo en el panel de contenido del frame. 
	    setContentPane(miscroll);
	   
	   }
	  
}

public class Ejer13 {
public static void main(String[] args) {
		// Creacion de objetos
	 Valores t =new Valores ();
	   t.setLocationRelativeTo(null);
	   t.setResizable(false);

	}

}
