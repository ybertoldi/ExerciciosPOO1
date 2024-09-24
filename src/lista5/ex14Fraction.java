package lista5;

public class ex14Fraction {
	// a/b
	public long a;
	public long b;
	
	public ex14Fraction(long a, long b) {
		this.a = a;
		this.b = b;
	}
	
	public void sum(ex14Fraction fraction) {
		long newDenominator = lcm(this.b, fraction.b);
		
		this.a = this.a * (newDenominator / this.b) + fraction.a * (newDenominator / fraction.b);
		this.b = newDenominator;
	}
	
	private static long gcd(long a, long b)
	{
	    while (b > 0)
	    {
	        long temp = b;
	        b = a % b; // % is remainder
	        a = temp;
	    }
	    return a;
	}
	
	private static long lcm(long a, long b)
	{
	    return a * (b / gcd(a, b));
	}
}
