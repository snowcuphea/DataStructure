package A02_Array;

import java.util.Scanner;

public class Test04ArrayCompare {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("A배열 길이 입력");
		int anum = key.nextInt();
		System.out.println("B배열 길이 입력");
		int bnum = key.nextInt();
		
		ArraySort comarr = new ArraySort();
		
		int[] a = new int[anum];
		int[] b = new int[bnum];
		
		System.out.println("A배열 입력");
		for(int i=0;i<anum;i++) {
			a[i] = key.nextInt();
		}
		System.out.println("B배열 입력");
		for(int j = 0; j<bnum;j++) {
			b[j] = key.nextInt();
		}
		
		for(int i=0; i<anum; i++) {
			System.out.print(a[i]+"\t");
		}
		System.out.println();
		for(int i=0; i<bnum; i++) {
			System.out.print(b[i]+"\t");
		}
		System.out.println();
		System.out.println("비교결과: "+(comarr.CompareArray(a,b)?"같다.":"다르다"));

	}

}
