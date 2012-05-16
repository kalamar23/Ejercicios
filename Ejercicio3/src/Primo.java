import java.awt.Color;
import java.awt.Component;
import java.awt.Event;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;
import java.util.*;
import javax.swing.table.*;

class MiRender extends DefaultTableCellRenderer {

	public static int Fila_Mayor;
	public static int Columna_Mayor;
	public static int Fila_Menor;
	public static int Columna_Menor;

	public Component getTableCellRendererComponent(JTable tabla, Object value,
			boolean isSelected, boolean hasFocus, int row, int column) {

		Font fuente = new Font("Courier", Font.PLAIN, 20);

		Component c = super.getTableCellRendererComponent(tabla, value,
				isSelected, hasFocus, row, column);

		if (!tabla.isRowSelected(row)) {

			if ((row == Fila_Mayor && column == Columna_Mayor) || (row == Fila_Menor && column == Columna_Menor)) {
				c.setBackground(Color.yellow);
			c.setFont(fuente);
			} else {
				c.setBackground(tabla.getBackground());
			}

		}
		return c;
	}

}

public class Primo extends JFrame implements ActionListener {
	private static int ANCHO = 533;
	private static int ALTO = 350;
	// Mostrar los numeros primos existente hasta cierto limite introducido por
	// teclado y mostrar de forma resaltada en una tabla
	// el numero primo más grande

	Object[][] valores = new Object[5][5];
	String[] columna = { "1", "2", "3", "4", "5" };
	JTable tabla = new JTable(valores, columna);
	JPanel panel = new JPanel();
	JScrollPane miscroll;
	JButton boton1 = new JButton("Ver numeros primos");

	Primo() {
		super("Numeros primos");
	boton1.setLocation(200, 160);
	boton1.setSize(150, 40);
	panel.add(boton1);
		setSize(ANCHO, ALTO);
	    //panel.add(tabla);
	add(panel);
		setVisible(true);
	boton1.addActionListener(this);
		tabla.setDefaultRenderer(Object.class, new MiRender());
		addComponentes();
		close();
	}

	private void addComponentes() {

		miscroll = new JScrollPane(tabla);
		panel.add(miscroll);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == boton1) {
			primo2();
			panel.repaint();
		}
	}

	private void close() {
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	// metodo calculo primos

	public void primo2() {

		int limite = Integer.parseInt(JOptionPane
				.showInputDialog("Ingrese un limite : "));
		int mayor = 0;
		int menor = 99999;
		Stack st = new Stack();

		boolean primo = true;
		for (byte num = 1; num < limite; num++) {
			for (byte contador = 2; contador < num && (primo); contador++) {
				if (num % contador == 0)
					primo = false;
			}

			if (primo) {
				if (num > mayor)
					mayor = num;
				if (num < menor)
					menor = num;
				st.add(0, num);
			} else {
				primo = true;
			}
		}
		// almacena valores en el array valores
		while (!st.empty()) {

			for (byte i = 0; i < valores.length; i++) {
				for (byte j = 0; j < valores[i].length; j++) {
					if (!st.empty())
						valores[i][j] = st.pop();
					if (valores[i][j] != null) {
						if (Integer.parseInt(valores[i][j].toString()) == mayor) {
							MiRender.Fila_Mayor = i;
							MiRender.Columna_Mayor = j;

						}

						if (Integer.parseInt(valores[i][j].toString()) == menor) {
							MiRender.Fila_Menor = i;
							MiRender.Columna_Menor = j;

						}
					}

				}
			}

		}		
	}
	
	public static void main(String[] args) {
		//  
		Primo nu = new Primo();

	}

}
