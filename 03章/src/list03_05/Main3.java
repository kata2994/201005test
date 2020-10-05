package list03_05;

public class Main3 {

	public static void main(String[] args) {
		// whileの種類、do-while
		System.out.println("温度を入力してください");
		int temp = new java.util.Scanner(System.in).nextInt();
		
		do {
			temp--;
			System.out.println("温度を１度下げました");
		}while(temp > 25);
		System.out.println("温度は２５度です");
			
		
	}

}
