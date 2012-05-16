import javax.swing.*;
import javax.swing.table.*;
import java.awt.event.*;

public class Tablas extends JFrame {
  public static int ANCHURA=700;
  public static int ALTURA=300;
  public static String TITULO="JTable by ViruzBlog";
  
    /*El array(MATRIZ) datos contendrá los valores iniciales de la tabla y el array nombrecolumnas los
    encabezados de las columnas. La tabla se insertará en el ScrollPane miscroll: */
  Object[][] datos={
     {"Francisco","Perez","Fernandez",new Integer(25),"Programador",new Boolean(true)},
     {"Alicia","Sanchez","Oliver",new Integer(30),"Administrativo",new Boolean(false)},
     {"Fernando","Castro","Plaza",new Integer(17),"Estudiante",new Boolean(true)},
     {"Fermin","Saez","Fermoso",new Integer(24),"Albañil",new Boolean(false)},
     {"Veronica","Martin","Hernandez",new Integer(27),"Estudiante",new Boolean(false)},
     {"Lucia","Garcia","Fernandez",new Integer(23),"Ama de casa",new Boolean(false)},
     {"Miguel","Pazos","Heredia",new Integer(45),"Abogado",new Boolean(true)}
  };
  
  String[] nombrecolumnas={"Nombre","Primer apellido","Segundo apellido",
                           "Edad","Profesion","Socio"};
  //se instancia la clase y se le asignan los datos
  JTable mitabla=new JTable(datos,nombrecolumnas);
  //Crear un contenedor como un JPanel, JScrollPane, o un JTabbedPane Para 
  //Añadir Componentes en Un JFrame
  JScrollPane miscroll;
  
   public Tablas() {
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
    TableColumn columnaSocio=mitabla.getColumnModel().getColumn(5);
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