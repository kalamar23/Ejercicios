import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
public class numeros extends JFrame implements ActionListener {
	
	JPanel panel= new JPanel();
	JLabel label1 = new JLabel("Ingresar número ");
	JTextField texto = new JTextField(10);
	JButton boton = new JButton("Calcular Primos");
	JButton boton2 = new JButton("Calcular Factorial");
	
	public numeros (){
		
		panel.add(label1);
		panel.add(texto);
		panel.add(boton);
		panel.add(boton2);
		add(panel);
		super.setTitle("NUMEROS");
		super.setVisible(true);
		super.setSize(250, 140);
		panel.setBounds(0, 0, -1, 1);
		boton.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == boton){
			String cad = texto.getText();
			setTitle(cad);
		}
		
	}
	
	public static void main(String[] args) {
		numeros obj = new numeros ();

		
	}

}