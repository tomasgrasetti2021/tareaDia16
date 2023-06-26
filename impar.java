package tareadia16;
import java.util.Scanner;

public class impar {

	public static void main(String[] args) {
		Scanner en = new Scanner(System.in);
		
		System.out.println("Ingrese un numero: ");
		int numero = en.nextInt();
		
		
		
		if ( numero  % 2 == 0) {
			System.out.println("El numero es par");
		} else if(numero % 2 == 1) {
			System.out.println("El numero es impar");
		}
	}
}
