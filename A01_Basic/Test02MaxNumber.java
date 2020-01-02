package A01_Basic;

import java.util.Scanner;

public class Test02MaxNumber {
	public static int Maxi(int a, int b, int c) {
		int maxi = a;
		if (maxi < b) maxi = b;
		if (maxi < c) maxi = c;
		
		return maxi;
	}

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);	
		
		System.out.println(Maxi(54,78,789));

	}

}
