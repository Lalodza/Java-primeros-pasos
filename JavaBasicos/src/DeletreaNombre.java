import java.util.Scanner;

/*
Escribe un programa que pida al usuario ingresar su nombre y que entonces imprima cada una de las letras de su nombre.

Ejemplo: "Juan"
"J"
"u"
"a"
"n"

length()
charAt(i)

*/

public class DeletreaNombre {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un nombre: ");
		String nombre = sc.nextLine();
		sc.close();
		System.out.println("\n\n\n\nDeletreando tu nombre");
		for(int i = 0;i < nombre.length();i++) {
			System.out.println("Posicion "+i+". "+nombre.toUpperCase().charAt(i));
		}
		
		
		
	}
}
