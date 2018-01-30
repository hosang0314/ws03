package ws03;

import java.util.Arrays;
import java.util.Scanner;

public class ws03 {

	public static void main(String[] args) {
		System.out.println("1~9 중 숫자 3개를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[3] ;
		
		arr[0] = sc.nextInt();
		arr[1] = sc.nextInt();
		arr[2] = sc.nextInt();
		Arrays.sort(arr);
		System.out.println("최대값:"+arr[2]);
		System.out.println("최소값:"+arr[0]);
		System.out.println("차   : "+(arr[2]-arr[0]));
		
	}

}
