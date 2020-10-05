package 練習問題;

public class Main {

	public static void main(String[] args) {
		
		//勇者登場
		Hero h = new Hero();
		h.name = "かたくら（笑）";
		h.hp = 100;
		//僧侶登場
		Cleric c = new Cleric();
		c.cName = "のじま（ノンケ）";
		//マタンゴ登場
		Marango m = new Marango();
		
		
		//勇者の初期値セット
		c.pray(2);
		
		
		
		
	}

}
