import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		boolean band = true;
		System.out.println("Ingresa los numeros a calcular :D");
		Scanner sc = new Scanner(System.in);
		System.out.print("numero 1: ");
		float num1 = sc.nextFloat();
		System.out.print("numero 2: ");
		float num2 = sc.nextFloat();
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
		
		while (band == true)
		{
			System.out.println("Elige una opcion: ");
			System.out.println("Opcion  (1)suma \n"+
					 		   "Opcion  (2)resta \n"+
					 		   "Opcion  (3)multiplicacion \n"+
					 		   "Opcion  (4)division \n"+
					 		   "Salir (5) ");
			int opc = sc.nextInt();
			switch(opc) {
			case 1:
				System.out.println("\n\nLos numeros a calcular son: "+num1+"  +  "+num2);
				System.out.println("El resultado de la SUMA es: "+(num1 + num2)+"\n\n");
				break;
			case 2:
				System.out.println("\n\nLos numeros a calcular son: "+num1+"  -  "+num2);
				System.out.println("El resultado de la RESTA es: "+(num1 - num2)+"\n\n");
				break;
			case 3:
				System.out.println("\n\nLos numeros a calcular son: "+num1+"  /  "+num2);
				System.out.println("El resultado de la DIVISON es: "+(num1 / num2)+"\n\n");
				break;
			case 4:
				System.out.println("\n\nLos numeros a calcular son: "+num1+"  *  "+num2);
				System.out.println("El resultado de la MULTIPLICACION es: "+(num1 * num2)+"\n\n");
				break;
			default:
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n*********************\nPrograma Finalizado  :D");
				band = false;
				sc.close();
			}
		}
	}
}
