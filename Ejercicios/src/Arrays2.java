import javax.swing.*;
public class Arrays2 {

StringBuffer sb = new StringBuffer();
// Necesitamos mostrar un contador con 5 dígitos (X-X-X-X-X), que muestre los números del 0-0-0-0-0
// al 9-9-9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.	

	
	public void counter() {

		for (byte va1 = 0; va1 < 10; va1++) {
			for (byte va2 = 0; va2 < 10; va2++) {

				for (byte va3 = 0; va3 < 10; va3++) {

					for (byte va4 = 0; va4 < 10; va4++) {
						for (byte va5 = 0; va5 < 10; va5++) {
System.out.println();


if(va1 == 3){
	System.out.print("E" + "-");
}
else{
	System.out.print(va1 + "-");	
}
if(va2 == 3){
	System.out.print("E" + "-");
}
else{
	System.out.print(va2 + "-");	
}
if(va3 == 3){
	System.out.print("E" + "-");
}
else{
	System.out.print(va3 + "-");	
}
if(va4 == 3){
	System.out.print("E" + "-");
}
else{
	System.out.print(va4 + "-");	
}
if(va5 == 3){
	System.out.print("E");
}
else{
System.out.print(va5);	
}

						}
					}

				}

			}

		}

		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Creacion de objetos

		Arrays2 arra = new Arrays2();
		
		arra.counter();
		
		
		
	}

}
