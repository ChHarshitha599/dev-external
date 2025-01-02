package internal2;
import java.util.*;
public class numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int prod=1;
		for (int i=1;i<=n;i++) {
			prod*=i;
		}
		System.out.println("factorial of n is"+prod);
	}
}
