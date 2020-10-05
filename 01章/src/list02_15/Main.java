package list02_15;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("本日ご来店ありがとうございます。夜の蝶にご指名はありますか？");
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.println("ご指名の夜の蝶、ご希望の年齢は？");
		int age = new java.util.Scanner(System.in).nextInt();
		System.out.println("ようこそ、" + age + "歳の" + name + "さん");
		
	}

}
