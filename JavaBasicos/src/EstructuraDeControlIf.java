import java.util.Scanner;

public class EstructuraDeControlIf {
	/*
	 * Estructura de control de flujo
	 * Nos sirve para la toma de decisiones
	 * 
	 * Estructura de control de flujo nos sirve para
	 * cambiar el flujo de nuestro programa evaluando
	 * una condicion y a partir de la evaluacion se
	 * raliza una accion u otra
	 * 
	 */
	
	public static void main(String[] args) {
		/*
		 * 	if(condicion) {
		 * 		codigo 
		 * 	} else {
		 * 		codigo 
		 * 	}
		 * 
		 */
		
		System.out.println("Mensaje");
		Scanner sc = new Scanner (System.in);
		System.out.print("Ingresa tu edad: ");
		int edad = sc.nextInt();
		
		if(edad >= 18) {
			System.out.println("Eres mayor de edad");
		} else {
			System.out.println("Eres menor de edad");
		}
	}
	
	
	
}
