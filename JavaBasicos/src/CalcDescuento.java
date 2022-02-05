import java.util.Scanner;

public class CalcDescuento {
	public static void main(String[] args) {
		float newValor = 0;
		Scanner sc = new Scanner (System.in);
		System.out.println("Ingresa el total de la compra: ");
		float valorCompra = sc.nextFloat();
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
		
		if(valorCompra >= 1_000 && valorCompra < 5_000) {
			newValor = valorCompra - ((10 * valorCompra)/100);
			System.out.println("Descuento de 10%\nEl TOTAL es de: "+newValor);
		} else if(valorCompra >= 5_000 && valorCompra <= 9_999) {
			newValor = valorCompra - ((20 * valorCompra)/100);
			System.out.println("Descuento de 20%\nEl TOTAL es de: "+newValor);
		} else if (valorCompra >= 10_000) {
			newValor = valorCompra - ((30 * valorCompra)/100);
			System.out.println("Descuento de 30%\nEl TOTAL es de: "+newValor);
		} else {
			System.out.println("El TOTAL es de: "+valorCompra);
		}
		
		
	}
	
}
