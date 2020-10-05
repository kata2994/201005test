package list03_08;

public class Main {

	public static void main(String[] args) {
		
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(i + "x" + j + "=" + i * j);
				
//				if(i * j < 10) {
//				System.out.print(" " + i * j);
//				}else {
//				System.out.print(i * j );
//				}
				
				
				int space = i * j;
				if (space < 10) {
					System.out.print("  ");
				}else {
					System.out.print(" ");
					
				}
						
						
						
				
			}
			System.out.println("");
		}
	}

}
