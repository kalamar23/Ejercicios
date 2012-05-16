import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.math.*;

class MiRender extends DefaultTableCellRenderer {
static int fila1 = 0;
static int columna1 = 0;
static int fila2 = 0;
static int columna2 = 0;
	private Font font = new Font("Courier", Font.PLAIN, 20);
	public Component getTableCellRendererComponent(JTable tabla,
                                          Object value,
                                          boolean isSelected,
                                          boolean hasFocus,
                                          int row,
                                          int column) {
Component c = 
super.getTableCellRendererComponent(tabla, value,
                                   isSelected, hasFocus,
                                   row, column);

if (!tabla.isRowSelected(row))
{
    if((row == fila1 && column == columna1) || (row == fila2 && column == columna2)){
    	c.setBackground(Color.yellow);
    c.setFont(font);}
    else {
        c.setBackground(tabla.getBackground());
    }
    
    
    }
return c;
}
}

class Mayor3 extends JFrame {

// Obtener el numero mayor y menor de un array de enteros aleatorios de dos digitos

public static int ANCHO = 700;
public static int ALTO = 300;
public static String TITULO = "Mayor o menor de vector";
public static int mayor = 0;
public static int menor = 99999;
public static int tran = 0;
Object [][] valores = new Object [5][5];
String[] columna = {"1", "2", "3", "4", "5"};
public void random(Object[][] valores){
int ran = 98, ran2 = (int) (Math.random() * 30);
for(int i = 0;i < valores.length;i++){
    for(int j = 0; j < valores[i].length;j++){
	tran = ran2 + ((int) (Math.random() * ((ran - ran2) + 1)));
    	valores[i][j] = tran;
if(tran > mayor){
	mayor = tran;

}
if(tran < menor){
	menor = tran;

}
   
	}
}

for(int i = 0; i < valores.length;i++){
 for(int j = 0;j < valores[i].length;j++){
		
		if(valores[i][j] == Integer.valueOf(menor)){
			
		mi.fila1 = i;
		mi.columna1 = j;
			
		}
		
		if(valores[i][j] == Integer.valueOf(mayor)){
			
			mi.fila2 = i;
			mi.columna2 = j;
				
			}		
	}
}
}
	
JTable tabla = new JTable(valores,columna);	
JScrollPane miscroll;
MiRender mi = new MiRender();
// constructor
public Mayor3(){
	super(TITULO);
	setSize(ANCHO,ALTO);
	addComponentes();
	setVisible(true);
	random(valores);
	eventos();
tabla.setDefaultRenderer(Object.class, new MiRender());
}

public void addComponentes(){
	miscroll = new JScrollPane(tabla);
	setContentPane(miscroll);
	
}
public void eventos(){
	  addWindowListener(new WindowAdapter(){
	        public void windowClosing (WindowEvent e) {
	        System.exit(0);
	               }
	           });
}
}

public class Mayor {
public static void main(String[] args) {
		// TODO Creacion de objetos
Mayor3 ma = new Mayor3();
ma.setLocationRelativeTo(null);
ma.setResizable(false);

	}

}
