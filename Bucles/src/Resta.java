import javax.swing.JOptionPane;
class Resta
{
    public static void main (String args [])
    {
        String a1, b1;
        Double num1, num2, res;
        a1=JOptionPane.showInputDialog("introduce el #1");
        b1=JOptionPane.showInputDialog("introduce el #2");
        num1=Double.parseDouble(a1);
        num2=Double.parseDouble(b1);
        res=num1-num2;
        JOptionPane.showMessageDialog(null,"La resta de\t"+num1+"-"+num2+"="+
        res);
    }
}