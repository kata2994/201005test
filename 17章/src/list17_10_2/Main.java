package list17_10_2;

import java.io.FileWriter;
import java.io.IOException;


public class Main {

	public static void main(String[] args) {
		try{
			sub();
		}catch(Exception e) {
			System.out.println("例外");
		}
	}


	public static void sub() throws IOException{
		subsub();

	}


	public static void subsub() throws IOException{
		FileWriter fw = new FileWriter("data.txt");
//		int x = 10;
//		int y = 10 / 0;

	}

}
