package 練習問題;

public class PisonMatango extends Matango{

	int poisonNokori = 5;


	public PisonMatango(char suffix) {

		super(suffix);

	}

	@Override
	public void attack(Hero h) {

		this.poisonNokori -= 1;
		super.attack(h);

		if(0 < poisonNokori) {

			System.out.println("さらに毒の胞子をばらまいた！");
			int dme = h.hp / 5;
			h.hp -= dme;
			//h.hp = h.hp - (h.hp / 5);
			System.out.println(dme + "ポイントのダメージ！");

		}

	}



}
