package list17_03;

import java.io.FileWriter;

public class Main {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("date.txt");
			fw.write("hello!");
			fw.close();
			}catch(Exception e) {

				System.out.println("何らかの問題が発生しました");

			}
	}

}
