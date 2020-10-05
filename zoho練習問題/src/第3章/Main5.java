package 第3章;
//3-4　イマイチの別解
public class Main5 {

	public static void main(String[] args) {

		for(int i = 1; i < 101; i++) {

			double s = 0;
			s =+ 0.1;

			//if 右辺
			//ループ回数iが、十の位と一の位が同じ時に、*を出力する条件。
			//ex.11,22,33,,,,
			if(i % 10 == ((i - (i % 10)) / 10) - 0) {

				System.out.print("*");

			}else if(i % 10 == ((i - (i % 10)) / 10) - 1) {

				System.out.print("*");

			}else if(i % 10 == ((i - (i % 10)) / 10) - 2) {

				System.out.print("*");

			}else if(i % 10 == ((i - (i % 10)) / 10) - 3) {

				System.out.print("*");

			}else if(i % 10 == ((i - (i % 10)) / 10) - 4) {

				System.out.print("*");

			}else if(i % 10 == ((i - (i % 10)) / 10) - 5) {

				System.out.print("*");

			}else if(i % 10 == ((i - (i % 10)) / 10) - 6) {

				System.out.print("*");

			}else if(i % 10 == ((i - (i % 10)) / 10) - 7) {

				System.out.print("*");

			}else if(i % 10 == ((i - (i % 10)) / 10) - 8) {

				System.out.print("*");

			}else if(i % 10 == ((i - (i % 10)) / 10) - 9) {

				System.out.print("*");

			}else if(i % 10 == ((i - (i % 10)) / 10) - 10) {

				System.out.print("*");

			}

			if(i % 10 == 0) {

				System.out.println("");

			}

		}

	}

}
