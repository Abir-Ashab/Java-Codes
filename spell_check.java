package cp;

import java.util.Arrays;
import java.util.Scanner;

public class spell_check {
	public static String sortString(String inputString) {
        char tempArray[] = inputString.toCharArray();
 
        Arrays.sort(tempArray);
 
        return new String(tempArray);
    }
	public static void main(String []args) {
		int test;
		Scanner input = new Scanner(System.in);
		String k = sortString("Timur");
		test = input.nextInt();
		while(test --> 0) {
			int b = input.nextInt();
			input.nextLine();
			String s = input.nextLine();
			s = sortString(s);
			//System.out.println(s + ' ' + k);
			System.out.println( s.equals(k) ? "Yes" : "No");
		}
	}
}
