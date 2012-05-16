import java.io.*;
 
public class EsPrimo {
    boolean resultado = true;
    boolean EsPrimoRecursivo(int n, int divisor, boolean resul){
        
        divisor = divisor-1;
        if(divisor>1){
            
            if(n%(divisor) != 0){
                EsPrimoRecursivo(n, divisor, resul); 
            
        }else{
                resultado = false;          //Terminación anticipada.
              }
     }
        return resultado;
    }
    
    boolean EsPrimo(int num){
        int aux;
        aux = num;
        boolean resultado = true;
        return EsPrimoRecursivo(num, aux, resultado);
    }
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader linea = new BufferedReader(new InputStreamReader(System.in));
        int numero;
        EsPrimo m = new EsPrimo();
        System.out.print("Numero: ");
        numero = Integer.parseInt(linea.readLine());
        System.out.print("Primo: " + m.EsPrimo(numero));
    }
 
}