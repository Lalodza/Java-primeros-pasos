import java.util.Scanner;

public class ScannerYBuffer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un numero: ");
		int num1 = sc.nextInt();
		System.out.print("Introduce otro numero: ");
		int num2 = sc.nextInt();
		sc.nextLine();  //limpiamos el buffer
		//System.out.println("\n\nNumero 1 = "+num1+"\nNumero 2 = "+num2);
		System.out.println("Introduce tu nombre: ");
		String nombre = sc.nextLine();
		sc.close();
		
		System.out.println("\n\nTu nombre es: "+nombre.toUpperCase()
				+ ".\nTus numeros son:  "+num1+" y "+num2);
	}
}
