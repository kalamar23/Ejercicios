import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;
import java.awt.Font;
class MiRender extends DefaultTableCellRenderer {
	
	private Font font = new Font("Courier", Font.PLAIN, 20);
	
	public Component getTableCellRendererComponent(JTable tabla, Object value, boolean isSelected, boolean hasFocus, int row, int column){
		
Component c = super.getTableCellRendererComponent(tabla, value, isSelected, hasFocus, row, column);

if(!tabla.isRowSelected(row)){
	
if(row == Sucesion.Fila1 && column == Sucesion.Colum1 || row == Sucesion.Fila2 && column == Sucesion.Colum2){
	
	c.setFont(font);
	c.setBackground(Color.YELLOW);
}
else{
	c.setBackground(tabla.getBackground());
}
	
	
}

return c;		
	}
}

public class Sucesion extends JFrame {
	
	// Ingresa un numero n y muestre los numeros primos en una tabla desde 1 a n, muestra mayor y menor 
	private static int Mayor = 0;
	private static int Menor = 99999;
	public static byte Fila1 = 0;
	public static byte Colum1 = 0;
	public static byte Fila2 = 0;
	public static byte Colum2 = 0;
	Object[][] valores = new Object[5][10]; 
	String[] columna = {"1" , "2", "3", "4", "5", "6", "7", "8", "9", "10"};	
	JTable tabla = new JTable (valores,columna);	
	JScrollPane miscroll;	
// constructor
	Sucesion(){
		super("Numeros primos");
		primos();
		setSize(700 , 350);
		setVisible(true);
		addComponente();
		close();
		tabla.setDefaultRenderer(Object.class, new MiRender());
	}	
	
	public void primos() {
		int numeroIngr;
		boolean primo = true;
		do{
		String s1 = JOptionPane.showInputDialog("Ingrese un numero : ");
		numeroIngr = Integer.parseInt(s1);
		}while(numeroIngr > 227);
		
		Stack st = new Stack();
		StringBuffer sb = new StringBuffer();
		for (int numero = 1; numero <= numeroIngr; numero++) {
			for (int conta = 2; conta < numero && ((primo)); conta++) {
				if (numero % conta == 0)
					primo = false;
			}

			if ((primo)) {
			if(numero > Mayor){
				Mayor = numero;
			}
			if(numero < Menor){
				Menor = numero;
			}
				st.add(0, (String.valueOf(numero)));

			} else {
				primo = true;
			}
		}

		for (int i = 0; i < valores.length && !st.empty(); i++) {
			for (int j = 0; j < valores[i].length && !st.empty(); j++) {	

				Collections.shuffle(st);
				
				if(Integer.parseInt((String) st.peek()) == Mayor){
					Fila1 = (byte) i;
					Colum1 = (byte) j;
				}
				
				if(Integer.parseInt((String) st.peek()) == Menor){
					Fila2 = (byte) i;
					Colum2 = (byte) j;
				}
				
				Collections.shuffle(st);
				
				valores[i][j] = st.pop();
			}
		}		
	}


	
	public void addComponente(){
		
		miscroll = new JScrollPane(tabla);
		setContentPane(miscroll);
	}
	
public void	close(){
	
	addWindowListener(new WindowAdapter(){
		
		public void windowClosing(WindowEvent e){
			System.exit(0);	
		}	
	});
}
	
		
	public static void main(String[] args) {
		// Creacion de objetos

Sucesion su = new Sucesion();

		
		
		
	}
}
