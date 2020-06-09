package condition;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("n > ");	
		int n = sc.nextInt();
		System.out.print("r > ");
		int r = sc.nextInt();
		
		System.out.println(n +", " + r);
		
		//경우의 수
		int num_case = 1;
		for(int i = 1; i<=r; i++) {
			num_case *= n; // 5,3이면 5*5*5
		}
		System.out.println(num_case);
		
		
		//팩토리얼(재귀함수) 중요
		//3! = 1*2*3
		int facN = 1;
		int facR = 1;
		int facNminR = 1;
		
		for (int i = 1; i<=n; i++) {
			facN = facN * i; 
		} 
		System.out.println(facN); //만약 n이 3이면 , 1*1 + 1*2 * 1*3 == 3!
		
		for (int i = 1; i<=r; i++) {
			facR = facR * i;
		}
		
		for (int i = 1; i<=(n-r); i++) {
			facNminR = facNminR * i;
		}
		
		
		//순열공식
		int P = facN/facNminR;
		
		//조합공식
		int C = P/facR;
		
		
	}
	
	

}
