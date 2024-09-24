package lista5;

public class Ex15 {
	public static void main(String[] args) {
		int a = 37;
		int b = 38;
		int c = 1;
		
		double soma = 0;
	
		while(a >= 1) {
			soma += (a * b) / c;
			System.out.printf("( %d * %d ) / * %d", a, b, c);
			
			if (a == 1) { System.out.print(" = ");}
			else {System.out.print("  +  ");}
			
			if (c % 5 == 0) {System.out.println();}
			
			a--;
			b--;
			c++;
		}
		
		System.out.print(soma);
	}
}
