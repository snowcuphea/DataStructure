package A01_Basic;

import java.util.Scanner;

public class Test01MaxNumber {

	public static void main(String[] args) {
		int num1, num2, num3;
		int maxi = 0;
		Scanner key = new Scanner(System.in);
		System.out.println("세 정수의 최대값 구하기");
		System.out.print("1번째 정수입력:");
		num1 = key.nextInt();
		System.out.print("2번째 정수입력:");
		num2 = key.nextInt();
		System.out.print("3번째 정수입력:");
		num3 = key.nextInt();
		maxi = num1;
		if (maxi < num2) maxi = num2;
		if (maxi < num3) maxi = num3;
		
		System.out.println("최대값:" + maxi);
		
		

	}

}
