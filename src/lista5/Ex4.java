package lista5;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		int popA;
		int popB;
		double taxA;
		double taxB;
		
		Scanner scan = new Scanner(System.in);
		System.out.printf("Digite, respectivamente, a populacao de A e de B. A taxa de crescimento de A (em porcentagem) e de B: ");
		
		popA = scan.nextInt();
		popB = scan.nextInt();
		taxA = scan.nextDouble() / 100;
		taxB = scan.nextDouble() / 100;

		scan.close();
		
		int counter = 0;
	
		while (popA < popB) {
			popA += popA * taxA;
			popB += popB * taxB;
			counter++;
			System.out.printf("Ano %d - pop A: %d, pop B: %d", counter, popA, popB);
		}
		
		System.out.printf("Levam %d anos para A superar ou igualar B", counter);
		
	}
}
