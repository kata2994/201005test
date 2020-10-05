package list08_11;

public class Main {

	public static void main(String[] args) {
		//1. 勇者を生成
		Hero h = new Hero();
//		Hero h;
//		h = new Hero();

		//2.フィールドに初期値をセット
		h.name = "ミナト";
		h.hp = 100;

		System.out.println("勇者" + h.name + "を生み出しました！");

		Marango m1 = new Marango();
		m1.hp = 50;
		m1.suffix = 'A';

		Marango m2 = new Marango();
		m2.hp = 48;
		m2.suffix = 'B';

		h.slip();
		m1.run();
		m2.run();
		h.run();





		//3.勇者飲んメソッドを呼び出してゆく
//		h.sit(5);
//		h.slip();
//		h.sit(25);
//		h.run();

	}

}
