import java.util.Scanner;

public class EjercicioTriangulo {
	public static void main(String [] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Ingresa los angulos internos del triangulo: ");
		int ang1 = sc.nextInt();
		int ang2 = sc.nextInt();
		int ang3 = sc.nextInt();
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("Los angulos ingresados son: "+ang1+"° , "+ang2+"° , "+ ang3+"°\n");
		int suma = ang1 + ang2 + ang3;
		int dif = 0;
		if (suma == 180) {
			System.out.println("Es un triangulo valido  :D ");
		} else if (suma > 180) {
			dif = suma - 180;
			System.out.println("No es un triangulo valido \nAngulos internos mayores a 180° te pasaste por "+dif+"°");
		} else {
			dif = 180 - suma;
			System.out.println("No es un triangulo valido \nAngulos internos menores a 180° te faltan "+dif+"°");
		}
		
	}
}
