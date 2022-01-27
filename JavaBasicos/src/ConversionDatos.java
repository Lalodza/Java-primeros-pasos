
class ConversionDatos {
	public static void main(String[] args) {
		byte numeroByte = 10;
		short numeroShort = numeroByte;
		int numeroInt = numeroShort;
		long numeroLong = numeroInt;
		System.out.println("Numero Long = " + numeroLong);
		int otroInt = (int) numeroLong; // es como el parseInt de javaScript
		short otroShort = (short) otroInt;
		System.out.println("El otro Int = " + otroInt);
		
		short num1 = 123;
		short num2 = 7343;
		byte num3 = 12;
		byte num4 = 33;
		
		short sumaShort = (short) (num1 + num2);
		int sumaByte = (num3 + num4); 
		int suma3 = (num3 + num4);
		short suma4 = (short) (num1 + num3);
	}
}
