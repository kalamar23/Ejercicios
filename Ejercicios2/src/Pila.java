
public class Pila {

private int stack[];
private int stack_ptr; // indica si pila está vacia 
	
Pila(int size){
	
	stack = new int [size];
	stack_ptr = -1;
}
	
	public int pop(){
		
		if(stack_ptr == -1) 
			return 0 ;
		else
		return stack[stack_ptr--];
		
	}
	
	public int push(int poner){
		
		if(stack_ptr >= 99)
			return 0;
		else{
		stack[++stack_ptr] = poner;
		return 1;
		}
	}
public int length(){
		
	return stack.length;	
	}
	
	public static void main(String[] args){
		
		
		Pila stack = new Pila(10);

		for(byte i = 1; i <= stack.length();i++){
			

			stack.push(i);
			System.out.println("Valor agregado = " + i);		
		}
		
		for(byte i = 1; i <= stack.length();i++){
			
			int stack_pop = stack.pop();
			
			System.out.println("Valor devuelto = " + stack_pop);
		}
		
		
		
	}
	
	
}
