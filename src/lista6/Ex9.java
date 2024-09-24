package lista6;

import java.util.Arrays;
import java.util.Scanner;

public class Ex9 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Escreva um texto:");
		String texto = scan.nextLine();
		char txt[] = texto.toCharArray();
		
		System.out.println("em forma de array, temos:\n" + Arrays.toString(txt));
		scan.close();
	}
	
	
}
