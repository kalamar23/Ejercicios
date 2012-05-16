
public class Pila {

public int[] Stack;
private int Stack_ptr;

Pila(int size){
	
	Stack = new int[size];
	Stack_ptr = -1;
}
public int pop(){
	
	if(Stack_ptr == -1)
		return 0;
				
	else
		return Stack[Stack_ptr--];
}

public int push(int poner){
	
	if(Stack_ptr >= 99)
		return 0;
	else{
		Stack[++Stack_ptr] = poner;
		return 1;
	}
	
}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Pila pi = new Pila(20);
		
		
for(byte i = 1;i < pi.Stack.length;i++){
	
		pi.push(i);
}


for(byte i = 1;i < pi.Stack.length;i++){

System.out.println(pi.pop());
}
		
	}

}
