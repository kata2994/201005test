package list03_08;

public class Main2 {

	public static void main(String[] args) {
		// 3_8練習問題
		/*
		 * 3-1
		 * ①　if (weight == 60){....}
		 * 		swich (weight){....}
		 *
		 * ②　if (age1 * age2 < 60){....}
		 *
		 *
		 * ③　if (age % 2 == 1){....}
		 *
		 * ④　if (str.equals("湊")){....}
		 *
		 * 3-2
		 * 答え　A　B　C　D　E　
		 *
		 * 3-3
		 * ①
		 * int isHungry = 0;
		 * String food = 寿司;
		 * ②
		 * public class Main {
		 * public static void main(String[] args) {
		 * 		System.out.print("こんにちわ");
		 * 		}
		 * }
		 *③
		 * public class Main {
		 * public static void main(String[] args) {
		 * 		int randam = new java.util.Random().nextInt(2);
		 * 			switch (random){
		 * 				case 0:
		 * 				System.out.print("お腹いっぱいです");
		 * 				break;
		 * 				default:
		 * 				System.out.print("腹ペコです");
		 * 				break;
		 * 		}
		 *	}
		 *				System.out.print("ごちそうさまでした");
		 * }
		 *3-4
		 *	boolean tenki = true;　　⇒　　boolean tenki = false;
		 *
		 *
		 */
				System.out.print("1:検索2：登録3:削除4:変更＞");

				int selected = new java.util.Scanner(System.in).nextInt();

				switch(selected) {
					case 1:
						System.out.println("検索します");
						break;
					case 2:
						System.out.println("登録します");
						break;
					case 3:
						System.out.println("削除します");
						break;
					case 4:
						System.out.println("変更します");
						break;
					default:
						System.out.println("なにもしないよ・・・");
				}

		//3-6
				System.out.println("数あてゲーム");

				int ans = new java.util.Random().nextInt(10);

				for (int i =0; i < 5; i++) {
					System.out.println("0-9の数字を入力してください");

					//int ans = new java.util.Random().nextInt(10);

					int num = new java.util.Scanner(System.in).nextInt();

					if (num == ans) {
						System.out.println("陽性！！おめでとう");
						break;
					}else {
						System.out.println("陰性！！独身貴族継続");
					}

				}

				System.out.println("ゲームを終了します");


	}

}
