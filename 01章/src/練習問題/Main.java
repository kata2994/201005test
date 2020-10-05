package 練習問題;

public class Main {

	public static void main(String[] args) {

		int x = 5;
		int y = 10;
		int z = x + y;
		System.out.println("x+yは"+ z);



		System.out.println("ようこそ占いの館へ");
		System.out.println("あなたの名前を入力してください");
		String name =new java.util.Scanner(System.in).nextLine();
		System.out.println("あなたの年齢を入力してください");
		String ageString =new java.util.Scanner(System.in).nextLine();
		int age = Integer.parseInt(ageString);
		int fortune = new java.util.Random().nextInt(4);
		++fortune;
		System.out.println("占いの結果が出ました！");
		System.out.println(age + "歳の" + name + "さん、あなたの運気番号は" + fortune + "です");
		System.out.println("1:大吉");


	}

}
