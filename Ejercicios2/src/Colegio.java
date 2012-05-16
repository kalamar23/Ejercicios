import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.NumberFormat;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;

class MiRender extends DefaultTableCellRenderer{
	
	
	public Component getTableCellRendererComponent(JTable tabla, Object value, boolean isSelected, boolean hasFocus, int row, int colum  ){
		
		
		
	}
	
	
}




public class Colegio extends JFrame implements ActionListener {



private static int ALTO = 700;
private static int ANCHO = 450;
public static byte count1 = 0;
public static byte count2 = 0;
static Object[][] tri1 = new Object [2][6];
static Object[][] tri2 = new Object [2][6];
static Object[][] tri3 = new Object [2][6];
static String[] columna = {"Nombre" , "nota1", "nota2", "nota3", "nota4", "nota5"};
static boolean sw1 = false;
static boolean sw2 = false;
static boolean sw3 = false;
// Componentes 
JTable tabla;	 
JScrollPane miscroll;
JPanel panel = new JPanel();
JLabel etiqueta = new JLabel();
JLabel etiqueta2 = new JLabel();
JLabel pro1 = new JLabel();
JLabel pro2 = new JLabel();
JLabel pro3 = new JLabel();
JTextField nombre = new JTextField();
JButton boton1 = new JButton("Promedio de grupo");
JButton boton2 = new JButton("Promedio de alumnno");
ImageIcon icon = new ImageIcon("images2/fondo.jpg");

Colegio(){
	setSize(ALTO,ANCHO);
	count1++;
	System.out.println("numero objeto : " + count1);
	ingreso();	
close();

}

private void addComponente(){
	
	miscroll = new JScrollPane(tabla);
	setContentPane(miscroll);
	
}

private void close(){
	
	addWindowListener(new WindowAdapter(){
		
		public void windowClosing(WindowEvent e){
			
			System.exit(0);			
		}		
	});
}

byte semestre;
private void ingreso(){
NumberFormat nf = NumberFormat.getNumberInstance();
nf.setMaximumFractionDigits(2);	

String s1, s2;
boolean activo = true;
try{
do{
semestre = Byte.parseByte(JOptionPane.showInputDialog("Ingrese el semestre a ingresar :"));
}while(semestre == 0 || semestre > 3);
if(semestre == 1){
	
	for(byte i = 0; i < tri1.length;i++){
	 for(byte j = 0; j < tri1[i].length;j++){
		 
		 if(j == 0){
	do{
			 s1 = JOptionPane.showInputDialog("Ingrese un nombre : "); 
	for(byte m = 0; m < s1.length();m++){
		if(Character.isLetter(s1.charAt(m)))
		activo = false;	
	}	
	}while(activo); 
	tri1[i][j] = s1;
		 }
		 else {
		 
			 
			 do {
					s2 = JOptionPane.showInputDialog("Ingrese una nota :");
					for(byte l = 0; l < s2.length();l++){
						
						if(Character.isDigit(s2.charAt(l)))
							activo = false;
						
					}
					}while(activo); 
			 
			 tri1[i][j] = nf.format(Double.parseDouble(s2));
		 }			 
	 activo = true;
	 }
	 activo = true;
	}
setTitle("1er semestre");
tabla = new JTable(tri1 , columna);	
addComponente();
setVisible(true);	
sw1 = true;
}

if(semestre == 2){
	
	for(byte i = 0; i < tri2.length;i++){
		 for(byte j = 0; j < tri2[i].length;j++){
			 
			 if(j == 0){
		do{
				 s1 = JOptionPane.showInputDialog("Ingrese un nombre : "); 
		for(byte m = 0; m < s1.length();m++){
			if(Character.isLetter(s1.charAt(m)))
			activo = false;	
		}	
		}while(activo); 
			 tri2[i][j] = s1;
			 }
			 else {
			 
				 
				 do {
						s2 = JOptionPane.showInputDialog("Ingrese una nota :");
						for(byte l = 0; l < s2.length();l++){
							
							if(Character.isDigit(s2.charAt(l)))
								activo = false;
							
						}
						}while(activo); 
				 tri2[i][j] = nf.format(Double.parseDouble(s2));
			 }			 
		 activo = true;
		 }
		 activo = true;
		}

	tabla = new JTable(tri2 , columna);	
	setTitle("2do semestre");
	addComponente();
	setVisible(true);
	sw2 = true;
}

if(semestre == 3){
	
	for(byte i = 0; i < tri3.length;i++){
		 for(byte j = 0; j < tri3[i].length;j++){
			 
			 if(j == 0){
		do{
				 s1 = JOptionPane.showInputDialog("Ingrese un nombre : "); 
		for(byte m = 0; m < s1.length();m++){
			if(Character.isLetter(s1.charAt(m)))
			activo = false;	
		}	
		}while(activo); 
			 tri3[i][j] = s1;
			 }
			 else {
			 
				 
				 do {
						s2 = JOptionPane.showInputDialog("Ingrese una nota :");
						for(byte l = 0; l < s2.length();l++){
							
							if(Character.isDigit(s2.charAt(l)))
								activo = false;
							
						}
						}while(activo); 
				 tri3[i][j] = nf.format(Double.parseDouble(s2));
			 }			 
		 activo = true;
		 }
		 activo = true;
		}

	tabla = new JTable(tri3 , columna);	
	setTitle("3er semestre");
	addComponente();
	setVisible(true);
	sw3 = true;
}

byte op = (byte) JOptionPane.showOptionDialog(null, "Desea realizar otra operación", "Continuar", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"SI" , "NO"}, "Si");

if(op == 0 && count1 < 3){
	new Colegio();
}

else {
	Colegio co2 = new Colegio(tri1, tri2, tri3);

co2.setResizable(false);
co2.setLocationRelativeTo(getFocusOwner());
}
}
catch(NumberFormatException eo){
	
	JOptionPane.showMessageDialog(null, "Usted debe ingresar un numero");
	ingreso();
}
}

private void proceso(){
	repaint();
	NumberFormat nf = NumberFormat.getNumberInstance();
	nf.setMaximumFractionDigits(2);	
	
	double prome1 = 0,prome2 = 0,prome3 = 0;
	
	for(byte i = 0; i < tri1.length;i++){
		
		for(byte j = 1; j < tri1[i].length;j++){
if(sw1)
prome1 += Double.parseDouble(tri1[i][j].toString());
if(sw2)	
prome2 += Double.parseDouble(tri2[i][j].toString());
if(sw3)	
prome3 += Double.parseDouble(tri3[i][j].toString());	
		}
	}
	

if(sw1){
	prome1 /= 10;
	pro1.setText(nf.format(prome1));
}
else
	pro1.setText("NO");

if(sw2){
	prome2 /= 10;
	pro2.setText(nf.format(prome2));
}
else
	pro2.setText("NO");

if(sw3){
	prome3 /= 10;
	pro3.setText(nf.format(prome3));
}
else
	pro3.setText("NO");
	super.setVisible(true);	

}

private void especi(){
	double prot1 = 0, prot2 = 0, prot3 = 0;
	NumberFormat nf = NumberFormat.getNumberInstance();
	nf.setMaximumFractionDigits(2);
	byte count = 0;
	for(byte i = 0;i < tri1.length;i++){
		for(byte j = 0;j < tri1[i].length;j++){
		
if(sw1){
	if(tri1[i][j].equals(nombre.getText())){
		for(byte m = 1;m < tri1[i].length;m++){
		prot1 += Double.parseDouble(tri1[i][m].toString());
		}
		prot1 /= 5;		
		pro1.setText(nf.format(prot1));
	}
}

else{
	pro1.setText("NO");
}

if(sw2){
	if(tri2[i][j].equals(nombre.getText())){
		for(byte m = 1;m < tri2[i].length;m++){
		prot2 += Double.parseDouble(tri2[i][m].toString());
		}
		prot2 /= 5;		
		pro2.setText(nf.format(prot2));
	}
}

else{
	pro2.setText("NO");

}
	
if(sw3){
if(tri3[i][j].equals(nombre.getText())){
		for(byte m = 1;m < tri3[i].length;m++){
		prot3 += Double.parseDouble(tri3[i][m].toString());
		}
		prot3 /= 5;		
		pro3.setText(nf.format(prot3));
	}
}
else{
	pro3.setText("NO");

}
		}
	}
	
}


Colegio(Object[][] tri1,Object[][] tri2, Object[][] tri3){
	
Font font = new Font("Courier", Font.PLAIN, 25);
etiqueta2.setForeground(Color.WHITE);
etiqueta2.setText("Escoja una opcion");
etiqueta2.setSize(300, 40);
etiqueta2.setLocation(165, 20);
etiqueta2.setFont(font);
etiqueta.setIcon(icon);
etiqueta.add(etiqueta2);
pro1.setSize(300, 200);
pro1.setFont(font);
pro1.setLocation(69, 190);

pro2.setSize(300, 200);
pro2.setFont(font);
pro2.setLocation(270, 190);

pro3.setSize(300, 200);
pro3.setFont(font);
pro3.setLocation(470, 190);
nombre.setSize(150, 40);
nombre.setLocation(200, 60);
etiqueta.add(nombre);
etiqueta.add(pro1);
etiqueta.add(pro2);
etiqueta.add(pro3);
boton1.setSize(190, 40);
boton1.setLocation(40, 120);
etiqueta.add(boton1);
boton2.setSize(190, 40);
boton2.setLocation(350, 120);
etiqueta.add(boton2);
panel.add(etiqueta);
add(panel);	
super.setSize(600 , 400);
super.setTitle("Menu de opciones");
super.setVisible(true);	
count2++;
System.out.println("numero objeto : " + count2);
boton1.addActionListener(this);
boton2.addActionListener(this);

close();
}


public void actionPerformed(ActionEvent e){
	
	if(e.getSource() == boton1){
		proceso();
	}
	
	if(e.getSource() == boton2){
		especi();
	}
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Colegio co = new Colegio();
co.setResizable(false);
co.setLocationRelativeTo(null);
	}

}
