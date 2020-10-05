package list15_06;

public class Main {

	public static void main(String[] args) {

		if(isValidPlayerName("MINAYO001")) {
			
			System.out.println("プレイヤー名として合格");
			
		}else {
			
			System.out.println("プレイヤー名として不合格");
			
		}
		
		

	}
	
	
	public static boolean isValidPlayerName(String name) {
		
		return name.matches("[A-Z][A-Z0-9]{7}");
		
		
	}
	

}
