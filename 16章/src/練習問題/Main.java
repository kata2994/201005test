package 練習問題;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main {
	//16_02
	public static void main(String[] args) {

		Hero saito = new Hero("斎藤");
		Hero suzuki = new Hero("鈴木");
//		saito.setName("斎藤");
//		suzuki.setName("鈴木");

		List<Hero> hN = new ArrayList<>();

		hN.add(saito);
		hN.add(suzuki);


		for(Hero h : hN) {

			System.out.println(h.getName());

		}

	//16_03

		Map<Hero,Integer> hm = new HashMap<>();

//		hm.put(saito.getName(), saito.getName() + "が倒した敵の数=3");
//		hm.put(suzuki.getName(), suzuki.getName() + "が倒した敵の数=7");
//
//		System.out.println("16-3");
//		System.out.println(hm.get(saito.getName()));
//		System.out.println(hm.get(suzuki.getName()));

		hm.put(saito, 3);
		hm.put(suzuki,7);

		for(Hero key : hm.keySet()) {




		}









	}

}
