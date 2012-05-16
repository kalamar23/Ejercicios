import javax.swing.*;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.*;

public class Ejer1 extends JFrame implements ActionListener {
private Font font = new Font("Arial", Font.PLAIN, 20);
private double suma1 = 0, suma2 = 0;
private byte counter1 = 0,counter2 = 0;
	//  Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media, la cantidad de
//	alumnos mayores de 18 años, y la cantidad de alumnos que miden más de 1.75

private static Object[][] tabla = new Object [5][3];
private static String[] columna = {"Nombre", "Edad", "Estatura"};



public static Object[][] getTabla() {
	return tabla;
}

public static String[] getColumna() {
	return columna;
}

	public void edades(){
		int total = 0;
	for(byte i = 0; i < tabla.length;i++){
		for(byte j = 0;j < tabla[i].length;j++){
			String s1 = "",s2 = "0",s3="0";
			if(j == 0){
			tabla[i][j] = (s1 = JOptionPane.showInputDialog("Ingrese nombre :"));
			}
			if(j == 1){
			tabla[i][j] = (s2 = JOptionPane.showInputDialog("Ingrese edad :"));
			}
			if(j == 2){
			tabla[i][j] = (s3 = JOptionPane.showInputDialog("Ingrese estatura :"));			
			}
			suma1 += Double.parseDouble(s2);
			suma2 += Double.parseDouble(s3);	
			if((Double.parseDouble(s2)) > 18){
				counter1++;
			}
			if(Double.parseDouble(s3) > 1.75){
				counter2++;
			}	
		}
	
	}	
	suma1 /= 5;
	suma2 /= 5;
	}
	
JPanel panel = new JPanel();	
JLabel label1 = new JLabel();
JLabel label2 = new JLabel();
JLabel label3 = new JLabel();
JLabel label4 = new JLabel();
JButton boton1 = new JButton("Ver tabla");
ImageIcon ic = new ImageIcon("images/def_icon.png");
JLabel icon = new JLabel("Alumnos", ic, JLabel.CENTER);
private LayoutManager layout;

public Ejer1(){
edades();
layout = new GridLayout(5,1);
panel.setLayout(layout);
panel.add(icon);

label1.setText("Edad promedio de alumnos : " + String.valueOf(suma1));
panel.add(label1);	
	label1.setFont(font);
label2.setText("Estatura Promedio : " + String.valueOf(suma2));	
	panel.add(label2);
	label2.setFont(font);
	label3.setText("Mayores de 18 años : " + String.valueOf(counter1));	
	panel.add(label3);
	label3.setFont(font);
	label4.setText("Cuantos miden más de 1.75 m : " + String.valueOf(counter2));	

	panel.add(label4);
	label4.setFont(font);
panel.add(boton1);
add(panel);
	super.setVisible(true);
	super.setTitle("Alumnos");
	super.setSize(900, 550);
	panel.setBounds(0, 0, -1, 1);
new Panel();
	boton1.addActionListener(this);

eventos();
}

public void actionPerformed(ActionEvent e){
	if(e.getSource() == boton1){
		
	new Panel();		
	}
}


public void eventos(){
	
	addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent e){
			System.exit(0);
		}
	}
			);
	
}
public static void main(String[] args) {
		// TODO Creacion de objetos
Ejer1 ej = new Ejer1();

}

}
