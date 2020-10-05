package 練習問題;

public class Kadai {

	public static void main(String[] args) {

		System.out.println("検索したい会員の氏名を入力");
		String name = new java.util.Scanner(System.in).nextLine();

		System.out.println("検索したい会員の収支状況を入力");
		String balance = new java.util.Scanner(System.in).nextLine();

		System.out.println("検索したい会員の最新の入館時のフィジカルを入力");
		double nF = new java.util.Scanner(System.in).nextInt();

		System.out.println("検索したい会員の前回入館時のフィジカルを入力");
		double fF = new java.util.Scanner(System.in).nextInt();

		System.out.println("検索したい会員の入館時間を入力");
		int entryH = new java.util.Scanner(System.in).nextInt();

		System.out.println("検索したい会員の入館フンを入力");
		int entryM = new java.util.Scanner(System.in).nextInt();

		System.out.println("検索したい会員の退館時間を入力");
		int exitH = new java.util.Scanner(System.in).nextInt();
		int exitM = new java.util.Scanner(System.in).nextInt();
		char plan = 'S';


	}

}
