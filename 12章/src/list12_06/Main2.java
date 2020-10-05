package list12_06;

public class Main2 {

	public static void main(String[] args) {

		Character[] c = new Character[5];

		c[0] = new Hero(); c[0].name = "おすぎ";
		c[1] = new Hero(); c[1].name = "ピーコ";
		c[2] = new Thief(); c[2].name = "マツコ";
		c[3] = new Wizard(); c[3].name = "ミッツ";
		c[4] = new Wizard(); c[4].name = "ピーター";

		//冒険開始
		//まず宿屋にとまる
		for(Character ch : c) {

			ch.hp += 50;

		}
		
		Monster[] monster = new Monster[2];
		
		
		
		
		

	}

}
