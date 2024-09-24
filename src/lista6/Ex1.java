package lista6;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int vec[] = new int[5];
		
		for (int i = 0; i < vec.length; i++) {
			vec[i] = scan.nextInt();
		}
		
		for (int i = 0; i < vec.length; i++) {
			System.out.println(vec[i]);
		}
	}
}
