import javax.swing.*;
import javax.swing.table.*;
import java.awt.event.*;

class Tablas2 extends JFrame {
  public static int ANCHURA=700;
  public static int ALTURA=300;
  public static String TITULO="JTable by ViruzBlog";
  
    /*El array(MATRIZ) datos contendrá los valores iniciales de la tabla y el array nombrecolumnas los
    encabezados de las columnas. La tabla se insertará en el ScrollPane miscroll: */
  Object[][] datos={
     {"Francisco","Perez","Fernandez"},
     {"Alicia","Sanchez","Oliver"},
     {"Fernando","Castro","Plaza"},
     {"Fermin","Saez","Fermoso"},
     {"Veronica","Martin","Hernandez"},
     {"Lucia","Garcia","Fernandez"},
     {"Miguel","Pazos","Heredia"}
  };
  
  String[] nombrecolumnas={"1","2","3"};
  //se instancia la clase y se le asignan los datos
  JTable mitabla=new JTable(datos,nombrecolumnas);
  //Crear un contenedor como un JPanel, JScrollPane, o un JTabbedPane Para 
  //Añadir Componentes en Un JFrame
  JScrollPane miscroll;
  
   public Tablas2 () {
    super(TITULO);
    setSize(ANCHURA,ALTURA);
    move(50,50);
    addComponentes();
    addEventos();
    setVisible(true);

  }
   public void addComponentes(){
    JComboBox comboBox= new JComboBox();
    comboBox.addItem(new Boolean(true));
    comboBox.addItem(new Boolean(false));
   //getColumnModel() regresa a TableColumn todas las columnas de la tabla
   //getColumn(5) indica en que Columna va aparecer el JCombo Box
    TableColumn columnaSocio=mitabla.getColumnModel().getColumn(0);
    //agrega ala Tabla las Opciones de comboBox
    columnaSocio.setCellEditor(new DefaultCellEditor(comboBox));
    
     miscroll=new JScrollPane(mitabla);
    //setContentPane para convertirlo en el panel de contenido del frame. 
    setContentPane(miscroll);
   
   }
   public void addEventos(){
    addWindowListener(new WindowAdapter(){
        public void windowClosing (WindowEvent e) {
        System.exit(0);
               }
           });
      } 
}

public class Vectores {
	   public static void main(String[] args) {
	   Tablas2 t =new Tablas2();
	   t.setLocationRelativeTo(null);
	   t.setResizable(false);
	  }
	}



