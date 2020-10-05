package list03_03;

public class Main2 {

	public static void main(String[] args) {
		System.out.println("年齢を入力してください");
		int age = new java.util.Scanner(System.in).nextInt();
		
		System.out.println("誕生月を入力してください");
		int month = new java.util.Scanner(System.in).nextInt();
		
		if (age >= 18 && month == 5) {
			System.out.println("18歳以上で5月生まれですね");
			}else {
				System.out.println("18歳未満か、" + "または5月以外の生まれですね");
				
			}
		
		
	}

}
