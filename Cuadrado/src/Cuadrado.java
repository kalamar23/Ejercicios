import java.awt.*;
import java.awt.image.*;
import java.awt.geom.*;
import javax.swing.*;

public class Cuadrado extends JFrame {
	
	//constructor
public Cuadrado(){
	
	setSize(400 , 400);
	setVisible(true);
}
	public void paint(Graphics g){
		
		Graphics2D g2d = (Graphics2D) g;
		g2d.setStroke(new BasicStroke(3.0f));
		g2d.setPaint(Color.RED);
		//g2d.draw(new Rectangle2D.Double(60, 40,300,300));
		g2d.draw(new Ellipse2D.Double(80, 40, 200, 200));
	}
	
	public static void main(String[] args){
		
		
		Cuadrado cu = new Cuadrado();
		cu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
	
	
	
	
	
	
}