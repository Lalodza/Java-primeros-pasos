
public class Arreglos {
	public static void main(String[] args) {
		
		//1ra Manera
		int numeros[];
		numeros = new int[4];
		
		//2da Manera
		String[] nombres = new String[5];
		
		//3ra Manera
		String []nombresFrutas = new String[] {"Manzana", "Platano", "Uva", "Pera"};
		
		numeros[0] = 10;
		numeros[1] = 8;
		numeros[2] = 100;
		numeros[3] = 200;
		
		nombres[0] = "Juan";
		nombres[1] = "Pedro";
		nombres[2] = "Felipe";
		nombres[3] = "Antonio";
		
		System.out.println(numeros[0]);
		System.out.println(numeros);
		
		for(int i=0;i < numeros.length;i++) {
			System.out.println("["+i+"] "+numeros[i]);
			System.out.println("["+i+"] "+nombres[i]);
			System.out.println("["+i+"] "+nombresFrutas[i]);
			System.out.println("-----------------------");
		}
		
 	}
}
