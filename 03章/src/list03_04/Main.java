package list03_04;

public class Main {

	public static void main(String[] args) {

		System.out.println("今日のメニューはいかがしますか？");
		System.out.println("Aコース　Bコース Cコース");

		String menu = new java.util.Scanner(System.in).nextLine();

		if (menu.equals("Aコース")) {
			System.out.println("本日はお疲れのようですね、出勤直後の嬢を当てがいます");
			System.out.println("ごゆっくり・・・");

		}else if(menu.equals("Bコース")) {
			System.out.println("本日は流しでよろしいですね、熟練の嬢を当てがいます");
			System.out.println("ゆめゆめ、しりこだまを抜かれます様、お願いします。");

		}else if(menu.equals("Cコース")) {
			System.out.println("いよいよそのコースを選ばれる日が来ましたか");
			System.out.println("浣腸剤をもってまいります。この爺や、必ずやご期待に添わせていただきます");

		}else {
			System.out.println("おや、本日はご利用でないご様子");
			System.out.println("またのご利用をお待ちしています");
			}

	}

}
