package A02_Array;

import java.util.Scanner;

public class Test05PrimeNumber {

	public static void main(String[] args) {
		int j = 0;
		int count = 0;
		
		Scanner key = new Scanner(System.in);
		System.out.println("¸î±îÁöÀÇ ¼ö?");
		int num = key.nextInt();
		
		
		for(int i = 2; i<num; i++) {
			for(j=2; j<=i;j++) {
				count++;
				if(i%j == 0) {
					break;
				}
				
			}
			
			if(i == j)
				System.out.print(i+ "\t");
		}

		System.out.println("³ª´°¼À ¼öÇà È½¼ö:" + count);
	}

}
