package list05_05;

public class Main {

	public static void main(String[] args) {
		add(100, -20);
		add(200, -50);
	}

	public static void add(int x, int y) {

		if( 0 < x && 0 < y) {

			int ans = x + y;
			System.out.println(x + "+" + y + "=" + ans);

		}else {
			System.out.println("計算しません。性の値だけいれてね");
		}


	}

}
