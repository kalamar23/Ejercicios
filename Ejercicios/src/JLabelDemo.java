import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 
public class JLabelDemo extends JApplet {
    /* Declaration */
    private Container Panel;
 
    private LayoutManager Layout;
 
    private JLabel Label1;
    private JLabel Label2;
    private JLabel Label3;
    private JLabel Label4;
    private JLabel Label5;
    private JLabel Label6;
    private JLabel Label7;
 
    public JLabelDemo() {
        /* Instantiation */
        Layout = new GridLayout(7, 1);
        Label1 = new JLabel("A Simple Label");
        Label2 = new JLabel("A Label with LEFT alignment", JLabel.LEFT);
        Label3 = new JLabel("A Label with CENTER alignment", JLabel.CENTER);
        Label4 = new JLabel("A Label with RIGHT alignment", JLabel.RIGHT);
        Label5 = new JLabel("A Label with LEADING alignment", JLabel.LEADING);
        Label6 = new JLabel("A Label with TRAILING alignment", JLabel.TRAILING);
        Label7 = new JLabel();
        Panel = getContentPane();
 
        /* Location */
        Panel.setLayout(Layout);
        Panel.add(Label1);
        Panel.add(Label2);
        Panel.add(Label3);
        Panel.add(Label4);
        Panel.add(Label5);
        Panel.add(Label6);
        Panel.add(Label7);
 
        /* Decoration */
        Panel.setBackground(Color.yellow);
        Label7.setHorizontalAlignment(JLabel.CENTER);
        Label7.setForeground(Color.blue);
        Label7.setText("Text added with setText");
    }
 
}