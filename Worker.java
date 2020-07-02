package starcraft;
import java.util.*;

public class Worker {
	int HP = 0;
	int MP = 0;
	int AttackLevel = 0;
	int DepenceLevel = 0;
	int Mine(int x, int y) {
		return 0;
	}
	public static void main(String[] args) {
		
	}
	
	boolean Attack(Dron dron){
		boolean result = false;
		dron.HP -= this.AttackLevel;
		return result;
	}
	
	boolean Attack(Scv scv){
		boolean result = false;
		scv.HP -= this.AttackLevel;
		return result;
	}
	
	boolean Attack(Prove prove){
		boolean result = false;
		prove.HP -= this.AttackLevel;
		return result;
	}
}
