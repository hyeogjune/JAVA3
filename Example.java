package starcraft;

public class Example {
	public static void main(String[] args) {
		Scv scv = new Scv();
		Dron dron = new Dron();
		
		dron.Attack(scv);
		System.out.println(scv.HP);
		System.out.println(dron.HP);
	}
}
