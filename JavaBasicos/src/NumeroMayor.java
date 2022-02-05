import java.util.Scanner;

public class NumeroMayor {
	public static void main(String[] args) {
		int aux = 0;
		Scanner sc = new Scanner (System.in);
		System.out.println("Ingresa 3 numeros ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("Los numeros son: " + num1 + " , " + num2 + " , " + num3 );
		/*
		if(num1 == num2 && num2 == num3) {
			System.out.println("Los numeros son iguales ");
		} else if(num1 > num2 && num1 > num3) {
			System.out.println("El numero mayor es: "+num1);
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("El numero mayor es: "+num2);
		} else {
			System.out.println("El numero mayor es: "+num3);
		}
		*/
		if(num1 == num2 && num2 == num3) {
			System.out.println("Los numeros son iguales ");
		} else if (true){
			if(num1 == num2) {
				aux = num1;
				if(aux > num3) {
					System.out.println("El numero mayor es: "+aux);
				} else {
					System.out.println("El numero mayor es: "+num3);
				}
			} else if (num1 == num3) {
				aux = num1;
				if(aux > num2) {
					System.out.println("El numero mayor es: "+aux);
				} else {
					System.out.println("El numero mayor es: "+num2);
				}
			} else if (num3 == num2) {
				aux = num3;
				if (aux > num1) {
					System.out.println("El numero mayor es: "+aux);
				} else {
					System.out.println("El numero mayor es: "+num1);
				}
			} 
		} else {
			if(num1 > num2 && num1 > num3) {
				System.out.println("El numero mayor es: "+num1);
			} else if (num2 > num1 && num2 > num3) {
				System.out.println("El numero mayor es: "+num2);
			} else {
				System.out.println("El numero mayor es: "+num3);
			}
		}
		
	}
	
}
