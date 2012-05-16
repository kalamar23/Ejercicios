import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

class Panel extends JFrame {


JTable tabla2 = new JTable(Ejer1.getTabla(), Ejer1.getColumna());
	JScrollPane miscroll;
public Panel (){
	super("Alumnos");
	setSize(700, 350);
	setVisible(true);
	addComponente();		
}

public void addComponente(){
	
	miscroll = new JScrollPane(tabla2);
	setContentPane(miscroll);
}

}