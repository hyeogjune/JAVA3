package starcraft;

public class Dron extends Worker{
	
	Dron(){
		super.HP = 40; //���� Ŭ������� ���� SUPER. �� ���� Ŭ������ ���� �ٲ��ذ�
		super.AttackLevel = 5;
	}
	
	/*�̷��� ���� ������ ��
	int HP = 40;
	int AttackLevel = 5;
	*/
	
	@Override
	int Mine(int x, int y) {
		System.out.println("x : " + x + ", y : " + y);
		return 0;
	}
	

	
}
