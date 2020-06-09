package condition;

public class While_Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//_ _ _ _ _ _ 1~45
		
		int num1 = (int) (Math.random() * 45) + 1;
		int num2 = (int) (Math.random() * 45) + 1;
		int num3 = (int) (Math.random() * 45) + 1;
		int num4 = (int) (Math.random() * 45) + 1;
		int num5 = (int) (Math.random() * 45) + 1;
		
		while(true) {
			System.out.println(num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5);
			if((num1 != num2)) {
				break;
			}
			num2 = (int) (Math.random()*45) + 1;
			
		}
		
	}

}
