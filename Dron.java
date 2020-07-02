package starcraft;

public class Dron extends Worker{
	
	Dron(){
		super.HP = 40; //위에 클래스라는 뜻임 SUPER. 즉 상위 클래스의 값을 바꿔준것
		super.AttackLevel = 5;
	}
	
	/*이러면 값을 재정의 함
	int HP = 40;
	int AttackLevel = 5;
	*/
	
	@Override
	int Mine(int x, int y) {
		System.out.println("x : " + x + ", y : " + y);
		return 0;
	}
	

	
}
