package list16_04;

import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

		//Set<String> colors = new HashSet<String>();
		//Set<String> colors = new LinkedHashSet<String>(); 
		Set<String> colors = new TreeSet<String>();
		
		
		colors.add("赤");
		colors.add("青");
		colors.add("黄");

		for(String s : colors ) {

			System.out.print( s + "⇒");

		}
	
	}

}
