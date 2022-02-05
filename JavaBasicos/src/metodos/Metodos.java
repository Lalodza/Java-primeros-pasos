package metodos;

public class Metodos {
	/*
	 * Metodo es una funcion
	 */
	int a, b;
	
	/*
	 * Metodo void (vacio)
	 */
	
	public void sumar() {
		int resultado = a + b;
		System.out.println("El resultado de sumar "+a+" mas "+b+" es "+resultado);
	}
	
	/*
	 * MEtodo con retorno de valores
	 */
	public int sumaConRetorno() {
		//int resultado = a + b;
		//return resultado;
		return (a + b);
	}
	
	/*
	 * Metodo Argumentos
	 * suma(argumentos);
	 */
	
	public double multiplicarArg(int a, double b) {
		return a * b;
	}
	
	/*
	 * Metodo static 
	 * No requiere que se cree un objeto para utilizarlo
	 */
	
	public static void imprimirNombre(String nombre) {
		System.out.println("Mi nombre es: "+nombre);
	}
	
	
}
	

