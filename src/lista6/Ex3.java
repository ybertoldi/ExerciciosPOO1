package lista6;

import java.util.Scanner;

public class Ex3 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int vec[] = new int[4];
		Double med = 0.0;
		
		System.out.println("Escreva as 4 notas: ");
		
		for (int i = 0; i < vec.length; i++) {
			vec[i] = scan.nextInt();
			med += vec[i];
		}
		
		System.out.println("as notas foram: ");
		for (int i = 0; i < vec.length; i++) {
			System.out.println(vec[i]);
		}
		
		System.out.println("A media eh: " + med/4);
	}
	
}
