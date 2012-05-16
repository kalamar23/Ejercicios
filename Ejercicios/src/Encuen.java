import javax.swing.*;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.*;

public class Encuen extends JFrame implements ActionListener {
	/*
	 * Realizar un juego para adivinar un número. Para ello pedir un número N, y
	 * luego ir pidiendo números indicando “mayor” o “menor” según sea mayor o
	 * menor con respecto a N. El proceso termina cuando el usuario acierta
	 */
	static short INT = 6; // credito
	static short PRE = 1;
	static short sw = 1;
	private String TITULO = "El numero es";
	private static int numero;
	Font font = new Font("Courier", Font.PLAIN, 50);
	Font font2 = new Font("Courier", Font.PLAIN, 60);

	JPanel panel = new JPanel();
	ImageIcon icon = new ImageIcon("images/akinator.png");
	ImageIcon icon2 = new ImageIcon("images/akinator2.png");

	JLabel eti1 = new JLabel();
	JLabel eti2 = new JLabel();
	JLabel eti3 = new JLabel();
	JButton boton1 = new JButton("Jugar !");
	JButton boton2 = new JButton("Empezar !");

	public Encuen() {
		if (sw == 1) {
			eti3.setFont(font);
			eti3.setText("NumKator");
			eti3.setIcon(icon);
			panel.add(eti3);
			panel.add(boton2);
			add(panel);
			super.setTitle(TITULO);
			super.setSize(900, 400);
			boton2.addActionListener(this);
			super.setVisible(true);
		}

		if (sw == 0) {
			numero();
			eti1.setFont(font);
			panel.add(eti1);
			super.setTitle(TITULO);
			super.setSize(520, 330);
			add(panel);
			close();
			boton1.addActionListener(this);
			panel.add(boton1);
		}

	}

	public void numero() {
		numero = (int) (Math.random() * 98);
		System.out.println(numero);
		int numIngre;
		byte sort;
		sort = (byte) (Math.random() * numero);
		try {
			do {
				String s1 = JOptionPane.showInputDialog("Ingrese un numero :");
				numIngre = Integer.parseInt(s1);
				if (INT == 0) {
					gameOver();
					break;
				}
				
				if(INT == 1){
					
					short op = (short) (Math.random() * 5);
					
					if(op == 1){
						int mat;
						String s3 = JOptionPane.showInputDialog(" Calcule !     4567 x 34");
						mat = Integer.parseInt(s3);
						if(mat == 155278){
							JOptionPane.showMessageDialog(null, "Correcto ! , obtienes 3 nuevos intentos");
						INT += 3;
						}
						
						
						if(op == 3){
							int mat2;
							String s4 = JOptionPane.showInputDialog("(Calcule !    23456 * 237564 / 2) * 0 ");
							mat2 = Integer.parseInt(s3);
							if(mat2 == 0){
								JOptionPane.showMessageDialog(null, "Correcto ! , obtienes 1 intento");
							INT++;
							}	
					}
					}
				}
				
				if (numIngre > numero) {
					JOptionPane.showMessageDialog(null,
							"Demasiado , el numero es menor ");
				}

				if (numIngre == sort) {
					JOptionPane
							.showMessageDialog(null,
									"Estas de suerte , te has ganado dos intentos mas !");
					INT += 2;
				}

				if ((numero - numIngre) == 2) {
					JOptionPane.showMessageDialog(null, "muy muy cerca !");
				}
				if ((numero - numIngre) == 1) {
					JOptionPane.showMessageDialog(null, "Mal ! pisaste una bomba , menos 2 intentos !");
					INT -= 2;
				}
				
				if ((numero - numIngre) == 80) {
					JOptionPane.showMessageDialog(null, "Ni cerca, vamos que pierdes !");
				}
				if ((numero - numIngre) == 5) {

					JOptionPane
							.showMessageDialog(null,
									" Divida 10 / 2 y sumelo al numero anteriormente ingresado");
				}

				if (numIngre < 30 && numero < 30 && numero >= 26
						&& numIngre >= 26 && numIngre != numero && PRE == 1) {

					String st = JOptionPane
							.showInputDialog("Como era mundialmente conocido Steve Irwin ?");
					if (st.contains("cazador de cocodrilos")) {

						JOptionPane.showMessageDialog(null,
								"Usted ha ganado 1 intento más");
						INT++;
					} else {
						JOptionPane.showMessageDialog(null,
								"Lo siento se ha equivocado, pierde 1 intento");
						INT--;
					}
					PRE = 0;
				}
				
				if (numIngre < 90 && numero < 90 && numero >= 87
						&& numIngre >= 87 && numIngre != numero && PRE == 1) {

					String st = JOptionPane
							.showInputDialog("Como se llama el sobrino de Condorito ?");
					if (st.contains("cone")) {

						JOptionPane.showMessageDialog(null,
								"Usted ha ganado 1 intento más");
						INT++;
					} else {
						JOptionPane.showMessageDialog(null,
								"Lo siento se ha equivocado, pierde 1 intento");
						INT--;
					}
					PRE = 0;
				}

				if (numIngre < numero) {
					JOptionPane.showMessageDialog(null,
							"te falta , el numero es mayor ");
				}
				INT--;
			} while (numIngre != numero);
			if (INT != 0) {
				eti1.setText(String.valueOf(numero));
				eti1.setIcon(icon2);
				super.setVisible(true);
			}
		} catch (NumberFormatException eo) {
			JOptionPane.showMessageDialog(null,
					"Usted no ha ingresado un numero !");
			new Encuen();
		}
	}

	private LayoutManager layout;

	public void gameOver() {
		layout = new GridLayout(3, 1);
		eti1.setIcon(icon);
		eti1.setText("GAME OVER !");
		eti2.setText(String.valueOf(numero));
		eti2.setFont(font2);
		panel.add(eti2);
		super.setVisible(true);
	}

	// Acción de boton

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == boton1) {
			super.dispose();
			new Encuen();
		}

		if (e.getSource() == boton2) {
			super.dispose();
			sw = 0;
			new Encuen();
		}
	}

	public void close() {
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		// TODO Creacion de objetos
		Encuen en = new Encuen();
	}

}
