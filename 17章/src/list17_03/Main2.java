package list17_03;

import java.io.FileWriter;
import java.io.IOException;

public class Main2 {

	public static void main(String[] args) {
		//FileWriter fw = null;
		FileWriter fw = null;
		//new FileWriter("data.text");
		//1-1
		try {
			fw = new FileWriter("data.text");
			fw.write("hello!");

		}catch(IOException e) {

			System.out.println("1-1 IOExceptionエラー");

		}finally {
			if(fw != null) {
				try {
					fw.close();

				}catch(IOException e){

					;

				}
			}
		}
	}

}
