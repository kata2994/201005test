package list05_15;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("コマンドライン引数を表示する");
		
		for(String str : args) {
			System.out.println(str);
		}
		
	}

}
