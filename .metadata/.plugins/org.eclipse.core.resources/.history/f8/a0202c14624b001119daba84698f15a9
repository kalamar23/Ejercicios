El blog de Eddy
InicioLa cantinaTutorialesYo y mis ideas
« Java: Abre y sobreescribe un archivo de textoComo satisfacer a una mujer con 9 centímetros »
Java: Convertir de decimal a Romano

decimalRomano.java

package decimalromano;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class decimalRomano extends JFrame{

    private JTextField decimal = new JTextField(6);
    private JTextField romano   = new JTextField(8);

    public static void main(String[] args) {
        decimalRomano ventana = new decimalRomano();
    }

    public decimalRomano() {
        JButton botonConvierte = new JButton("Convierte");

        ActionListener realizaAccion = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int valor = Integer.parseInt(decimal.getText());
                    String roman = Romano.enteroARomano(valor);
                    romano.setText("" + roman);
                } catch (NumberFormatException ex) {
                    romano.setText("Error");
                }
            }};

        botonConvierte.addActionListener(realizaAccion);
        decimal.addActionListener(realizaAccion);

        JPanel contenido = new JPanel();
        contenido.setLayout(new FlowLayout());
        contenido.add(decimal);
        contenido.add(botonConvierte);
        contenido.add(romano);

        this.setContentPane(contenido);
        this.setTitle("Decimal a Romano");
        this.pack();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}