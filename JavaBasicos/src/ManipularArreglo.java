/* 
Crea una clase llamara ManipularArreglo
crea un array con los siguientes números enteros:

1, 6, 45, 53, 80, 102, 145, 326, 450, 892
Crea un programa que use un ciclo que tome los números de arreglo y devuelva la suma total, la suma de los números pares y la suma de los números impares.

 */
public class ManipularArreglo {
	public static void main(String[] args) {
		int []numeros = new int[] {1, 6, 45, 53, 80, 102, 145, 326, 450, 892};
		int []suma = new int[] {0,0,0};
		
		for(int i=0;i<numeros.length;i++) {
			suma[0] += numeros[i];
			if(numeros[i] % 2 == 0) {
				suma[1] = suma[1] + numeros[i];
			} else {
				suma[2] = suma[2] + numeros[i];
			}
		}
		//5518059614
		System.out.println("La suma Total es: "+suma[0]);
		System.out.println("La suma de los Pares es: "+suma[1]);
		System.out.println("La suma de los Impares es: "+suma[2]);
	}
}
