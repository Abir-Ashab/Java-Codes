package cp;

import java.util.Scanner;

public class odd_set {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while(t-->0) {
			int n = sc.nextInt();
			int odds = 0;
			int evens = 0;
			
			for(int i = 0; i < 2*n; i++) {
				if((sc.nextInt()&1) == 0) evens++;
				else odds++;
		}
		System.out.println(evens == odds ? "Yes" : "No");
		}
	}
}	