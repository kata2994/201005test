package list16_00;


import java.util.ArrayList;

public class Main2 {

	public static void main(String[] args) {
		//ArrayListを準備
		ArrayList<String>names = new ArrayList<String>();
		
		//3人追加
		names.add("たなか");
		names.add("すずき");
		names.add("さいとう");
		
		System.out.println(names.get(1));
	}

}
