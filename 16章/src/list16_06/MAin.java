package list16_06;

import java.util.HashMap;
import java.util.Map;


public class MAin {

	public static void main(String[] args) {

		Map<String,Integer> pers = new HashMap<String,Integer>();

		pers.put("京都府",255);
		pers.put("東京都", 1261);
		pers.put("熊本県", 181);
		int tokyo = pers.get("東京都");

		System.out.println("東京の人口は" + tokyo);

		pers.remove("京都府");
		pers.put("熊本県", 182);
		int kumamoto = pers.get("熊本県");

		System.out.println("熊本県の人口は" + kumamoto);
		
		for(String key : pers.keySet()) {
			
			int value = pers.get(key);
			
			System.out.println(key + "の人口は" + value);
			
		}
		
		
	}

}
