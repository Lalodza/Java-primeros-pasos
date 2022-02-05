import java.util.Scanner;

/*
 * Estructura de control nos sirve para controlar el flujo de 
 * comportamientos de un programa. Para la toma de decisiones
 * 
 * 
 * 
 * switch(condicion_a_evaluar) {
 * 	case 'valor' :
 * 		codigo a ejecutar
 * 		break
 * 	case 'valor' :
 * 		codigo a ejecutar
 * 		break
 * 	default:
 * 		codigo a ejecutar
 * 
 */
public class EstructuraDeControlSwitch {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un dia de la semana y recibe un bonito mensaje :D");
		String dia = sc.nextLine();
		
		
		switch(dia.toLowerCase()) {
		case "lunes":
			System.out.println("Ya mero es viernes, toma un cafe");
			break;
		case "martes":
			System.out.println("Lunes chiquito. Esto es cansado pero ya casi");
			break;
		case "miercoles":
			System.out.println("Miercoles pero a que costo :(");
			break;
		case "jueves":
			System.out.println("Jueves de sed peligrosa");
			break;
		case "viernes":
			System.out.println("Es viernes y el cuerpo lo sabe");
			break;
		case "sabado":
		case "domingo":
			System.out.println("Basta de trabajacion");
			break;
		default:
			System.out.println("Ingreso un dia de la semana incorrecto");
			
		}
		
	}
}
