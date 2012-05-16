import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.*;
import javax.swing.*;
public class Suma extends JFrame implements ActionListener {
static int numero1;
static int numero2;
	JPanel panel = new JPanel();
	JLabel label1 = new JLabel("Ingrese los numeros a sumar");

JTextField texto1 = new JTextField(10);
JTextField texto2 = new JTextField(10);
JLabel label2 = new JLabel();
JButton boton1 = new JButton("Sumar");

public Suma(){
	panel.add(label1);
	panel.add(texto1);
	panel.add(texto2);
	add(panel);
	panel.add(boton1);
	panel.add(label2);
	super.setTitle("Suma de numeros");
	super.setVisible(true);
super.setSize(250, 150);
eventos();
boton1.addActionListener(this);
}	

public void actionPerformed(ActionEvent e){
int suma;
	
	if(e.getSource() == boton1){
		String s1 = texto1.getText();
		numero1 = Integer.parseInt(s1);
		String s2 = texto2.getText();
		numero2 = Integer.parseInt(s2);
	}
	
	suma = numero1 + numero2;
label2.setText(String.valueOf(suma));
}

public void eventos(){
	
	addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent e){
			System.exit(0);
			
		}
		
	});
	
	
	
}
	public static void main(String[] args) {
		// TODO Creacion de objetos
Suma su = new Suma ();
	}

}
