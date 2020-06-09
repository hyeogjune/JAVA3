package condition;

public class Fibo {
	public static void main(String[] args) {
		//  0    1    1   2   3 5 8 13
		//f(0) f(1) f(2) f(3)
		System.out.println(fibo(7));
	}
	
	
	
	public static int fibo(int n) {
		if(n <= 1) {
			return n;
		}
		else {
			return fibo(n-1) + fibo(n-2);
		}
		
	}
	
}
