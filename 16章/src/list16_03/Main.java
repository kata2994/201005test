package list16_03;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		Set<String> color = new HashSet<String>();
		
		color.add("赤");
		color.add("青");
		color.add("黄");
		color.add("赤");	//これは追加されずに終わってる
		
		System.out.println("色は" + color.size() + "種類");
	}

}
