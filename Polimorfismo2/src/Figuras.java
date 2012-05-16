// Demostración de algunas figuras de Java2D.
import java.awt.*;
import java.awt.geom.*;
import java.awt.image.*;
import javax.swing.*;

public class Figuras extends JFrame {

   // establecer cadena de barra de título y dimensiones de la ventana
   public Figuras() 
   {
      super( "Dibujo de figuras en 2D" );

      setSize( 425, 400 );
      setVisible( true );
   }

   // dibujar figuras con la API Java2D
   public void paint( Graphics g )
   {
      super.paint( g );  // llamar al método paint de la superclase

      Graphics2D g2d = ( Graphics2D ) g;  // convertir g a Graphics2D

      // dibujar rectángulo 2D en verde
      g2d.setPaint( Color.GREEN );                  
      g2d.setStroke( new BasicStroke( 5.0f ) ); 
      g2d.draw( new Rectangle2D.Double( 120, 50, 65, 100 ) );

   } // fin del método paint

   // ejecutar la aplicación
   public static void main( String args[] )
   {
      Figuras aplicacion = new Figuras();
      aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

} // fin de la clase Figuras 