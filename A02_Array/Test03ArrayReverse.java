package A02_Array;

import java.util.Scanner;

public class Test03ArrayReverse {

	public static void main(String[] args) {
		
		MakeRandomArray marr = new MakeRandomArray();
		ArraySort sortarr = new ArraySort();
		Scanner key = new Scanner(System.in);
		System.out.println("배열크기입력");
		int num = key.nextInt();
		int[] arr = marr.MakeArray(num);
		int[] rearr = sortarr.ReverseArray(arr);
		
		for(int i=0; i<num;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("========");
		for(int i=0; i<num;i++) {
			System.out.println(rearr[i]);
		}
		

	}

}
