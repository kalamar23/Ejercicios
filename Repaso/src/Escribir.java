/* Escribir un archivo de texto en disco
 * 
 * 
 * 
 */
import java.io.*;
import javax.swing.*;
import net.mindview.util.Print;
public class Escribir  extends JFrame {

	
	
	public void write() throws IOException {
	
		
		char op;
		String sArchivo = "/home/kala/Escritorio/escri/texto.log";
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	JProgressBar bar = new JProgressBar();
		File fichero = new File(sArchivo);
Print p = new Print();
		try{
			
			if(fichero.createNewFile()) {
			
				p.print("Creando archivo ...");
			}
			else {
				p.print("El archivo ya existe");

				
				p.print("Desea borrar el archivo (s/n) : ");
				op = (char) System.in.read();
				
				if(op == 's' || op == 'S'){
	if(fichero.delete())
		p.print("El archivo ha sido borrado !");
				}
				else {
					p.print("a Escribir ! ");
				}
				}			
				
		}catch(IOException ioe){
			
			ioe.printStackTrace();
		}
	p.print("Escriba lo que desea guardar en el block de notas, escriba :w para guardar : ");
	BufferedWriter bw = new BufferedWriter(new FileWriter(sArchivo));
for(String texto = "";!texto.equals(":w");texto = bf.readLine()){

	bw.write(texto);
	
}
bw.close();
	}
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
Escribir es = new Escribir();
es.write();

	}

}
