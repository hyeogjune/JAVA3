package starcraft;

public class Prove extends Worker{
	
	int HP = 40;
	int AttackLevel = 5;
	
	@Override
	int Mine(int x, int y) {
		System.out.println("x : " + x + ", y : " + y);
		return 0;
	}
}
