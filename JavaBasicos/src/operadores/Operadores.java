package operadores;

import java.util.Scanner;

public class Operadores {
	public static void main (String[] args) {
		/*
		 * Operadores Aritmeticos
		 * +, -, /, *, %
		 */
		int a = 10;
		int b = 20;
		double c = 10.5;
		
		int suma = a + b;
		System.out.println(suma);
		
		String str1 = "El resusltado de la suma es: ";
		System.out.println(str1+suma);
		//Resta
		System.out.println("El resultado de la resta es: " + (a-b));
		
		//Division
		int division = a / b;
		System.out.println("El resultado de la division es: "+ division);
		
		//double division2 =(double) a / b;
		double division2 = c / b;
		System.out.println("El resultado de la division es: "+ division2);
		
		//Multiplicacion
		double multiplicacion = c * a;
		System.out.println("El resultado de la division es: "+ multiplicacion);
		
		//Modulo
		double modulo = a % c;
		System.out.println("El modulo de la operacion es: "+ modulo);
		
		/*
		 * Operadores de asignacion
		 *  =
		 *  
		 */
		int d = 5, e;
		e =  6;
		System.out.println(d + " - " + e);
		
		/*
		 * Operadores de declaracion compuesta
		 *  +=, -=, *=, %=
		 *  
		 *  una operacion simplificada
		 */
		
		int f=0, g=5;
		f += 5;
		System.out.println(f);
		
		/*
		 * Operadores Relacionales
		 *  <, >, <=, >=
		 *  == igualdad
		 *  != diferencia
		 *  El resultado va a ser en tipo BOOLEAN (true, false)
		 * 
		 */
		
		int h = 15, i = 25;
		String j = "Hola";
		
		System.out.println(h > i); //false
		System.out.println(i != h); //true
		//System.out.println(h != j); son tipos de datos distintos y no se pueden comparar
		
		/*
		 * Operadodres unarios
		 * 	++, --
		 * preasiganacion  ++k se le asigna un valor antes de usarse
		 * postasignacion  k++ primero lee el valor y despues le suma 1
		 * 
		 */
		
		int k=0, l=0;
		for(int var = 0;var < 10; var ++) {
			l++;
			System.out.println(l);
		}
		System.out.println(--k);
		
		/*
		 * Procedencia de Operadores
		 * 
		 */
		
		int operacion = (4 + 5) * 6 / 3;
		System.out.println(operacion);
		
		int x=0, y=0;
		int operacion2 = ++x + y--;
		System.out.println(operacion2);
		
		/*
		 * Operadores ternarios
		 */
		int edad = 19 , valor1 = 0, valor2 = 1;
		int resultado = (edad <= 18) ? valor1 : valor2;
		System.out.println(resultado);
	
		/*
		 * Operadores Logicos 
		 *  And - &&
		 *  or - ||
		 */
		
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(true || false);
		System.out.println(true && !false);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un numero: ");
		int num = sc.nextInt();
		System.out.println(num);
	}
}
