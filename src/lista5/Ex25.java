package lista5;

public class Ex25 {

	public static void main(String[] args) {
		double x = 1.99;
		for (int i = 0; i < 50; i++) {
			System.out.printf("%d - R$%f \n", i+1, x);
			x += 1.99;
		}
	}

}
