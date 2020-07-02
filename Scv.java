package starcraft;

public class Scv extends Worker{
	
	int HP = 50;
	int AttackLevel = 8;
	
	@Override
	int Mine(int x, int y) {
		System.out.println("x : " + x + ", y : " + y);
		return 0;
	}
}
