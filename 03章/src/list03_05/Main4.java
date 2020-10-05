package list03_05;

public class Main4 {

	public static void main(String[] args) {
		//wlileの種類、基本形
		System.out.println("温度を入力してください");
		int temp = new java.util.Scanner(System.in).nextInt();
		
		while(temp > 25){
			temp--;
			System.out.println("温度を1度下げました");
			}
		System.out.println("温度は" + temp + "度です");
		}

}
