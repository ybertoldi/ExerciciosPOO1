package Teste;

import java.util.Scanner;

public class Repeticao {
	
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int num = -1;
		
		do {
			System.out.print("Digite um numero: ");
			num = ent.nextInt();
			System.out.println();
		} while (num < 0);
		
		
		for ( int i = 1; i <= 10; i++) {
			System.out.printf("%d X %d = %d\n", i, num, i * num);
		}
		
		ent.close();
	}
	
}
