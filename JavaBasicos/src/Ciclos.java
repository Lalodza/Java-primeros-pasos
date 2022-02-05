
public class Ciclos {
	public static void main(String[] args) {
		/*
		int control = 0;
		
		while(control < 10) {
			System.out.println("Control = "+control);
			control++;
		}
		*/
		/*
		int control = 3;
		
		do {
			System.out.println("Control = "+control);
			control++;
		}while(control < 3);
		*/
		for(int i=0; i < 10;i++) {
			if(i % 2 == 0) {
				continue;
				//System.out.println("Control = "+i);
			}
			System.out.println("Control = "+i);
		}
	}
}
