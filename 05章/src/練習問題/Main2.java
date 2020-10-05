package 練習問題;

public class Main2 {

	public static void main(String[] args) {

		String a = "メールの宛先アドレス";
		String b = "メールのタイトル";
		String c = "メールの本文";

		email(a,b,c);

		email(a,c);


	}

	public static void email(String title, String address, String text) {

		System.out.println(title + "に、以下のメールを送信しました");
		System.out.println("件名：" + address);
		System.out.println("本文：" + text);
	}
	
	
	
	
	

	public static void email(String title, String text) {
		
		
		System.out.println("");
		
		System.out.println(title + "に、以下のメールを送信しました");
		System.out.println("件名：無題");
		System.out.println("本文：" + text);
	}





}
