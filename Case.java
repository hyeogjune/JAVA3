package condition;



public class Case {

	public static void main(String[] args) {
		// 1~5���� 3���� ����� ��, ����, ����(5C3)
		
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
			
		System.out.println("����� �� :" + countCase);
		System.out.println("������ �� :" + countP);
		System.out.println("�ߺ� ���� ������ �� :" + countC);
		}

}

