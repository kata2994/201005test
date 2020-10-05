package list09_14;

public class Main {

	public static void main(String[] args) {

		Sword s = new Sword();
		s.name = "炎の剣";
		s.damage = 10;

		Sword s2 = new Sword();
		s2.name = "痛くないロウソク";
		s2.damage = -1;

		//持ち変える武器インスタンス宣言
		Hero h = new Hero();
		h.name = "ミナト";
		h.hp = 100;
		h.sword = s;

		//コンストラクター
		Sword hin1 = new Sword("炎の剣（コンスト版）",10);









		System.out.println("現在の武器は" + h.sword.name);

		h.sword = s2;

		System.out.println("現在の武器は" + h.sword.name);

	}

}
