import java.util.Scanner;

public class decision {
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Ingrese año: ");
	int año = scanner.nextInt();
	
	if (año % 4 == 0  && año % 100 == 0) {
		System.out.println("El año es biciesto");
		
	} else {
		System.out.println("El año no es biciesto");
	}
	


	
}
}
	

