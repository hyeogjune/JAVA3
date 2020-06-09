package condition;



public class Case {

	public static void main(String[] args) {
		// 1~5까지 3가지 경우의 수, 순열, 조합(5C3)
		
		int countCase = 0;
		int countP = 0;
		int countC = 0;
		
		for (int a = 1; a<=5 ; a++) {
			for (int b = 1; b<=5; b++) {
				for (int c = 1; c<=5; c++) {
					System.out.println(a + " , " + b + " , "+ c);
					countCase++;
					
					if((a!=b)&&(b!=c)&&(c!=a)) {
						countP++;
					}
					
					if((a<b) && (b<c) && (a<c)) {
						countC++;
					}
				}
			}
		}
			
		System.out.println("경우의 수 :" + countCase);
		System.out.println("순열의 수 :" + countP);
		System.out.println("중복 제거 조합의 수 :" + countC);
		}

}

