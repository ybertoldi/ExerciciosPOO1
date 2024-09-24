package lista6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char vec[] = new char[10];
		
		List<Character> achados = new ArrayList<>();
		List<Character> consoantes = Arrays.asList(
				'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm',
				'n', 'p', 'q', 'r', 's', 't', 'v', 'x', 'y', 'w', 'z');
		
		System.out.println("dez chars: ");
		for (int i = 0; i < vec.length; i++) {
			vec[i] =  scan.next().charAt(0);
			
			if ( consoantes.contains(Character.toLowerCase(vec[i])) ) {
				achados.add(vec[i]);
			}
		}
		
		System.out.println("\nAs consoantes sao: ");
		for (int i = 0; i < achados.size(); i++) {
			System.out.println(achados.get(i));
		}
		
		scan.close();
	}
}
