package internal2;

public class numbers {

	public static void main(String[] args) {
		int n = 3;
		int prod=1;
		for (int i=1;i<=n;i++) {
			prod*=i;
		}
		System.out.println("factorial of n is"+" "+prod);
	}
}
