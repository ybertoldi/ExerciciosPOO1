package lista5;

public class Ex14 {
	
	public static void main(String[] args) {
		int n = 20;
		
		int a = 1;
		int b = 1;
		
		for (int i = 0; i < n; i++) {
			System.out.printf("%d/%d ", a, b);
			a++;
			b += 2;
			
			if (i != n -1) {System.out.print(",");}
		}
	}
}
