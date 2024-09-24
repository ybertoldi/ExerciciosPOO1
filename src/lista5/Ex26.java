package lista5;

public class Ex26 {

	public static void main(String[] args) {
		double x = 0.18;
		
		for (int i = 0; i < 50; i++) {
			System.out.printf("%d - R$%.2f \n", i+1, x);
			x += 0.18;
		}

	}

}
