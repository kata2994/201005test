package list10_05b;

public class monA extends BaseMonster{

	public void hueru() {

		int kazu = new java.util.Random().nextInt(5)+1;

		for(int i = 0; kazu > i; i++) {

			if(i == 1) {
				System.out.println("スライム" + "A" + "が現れた");
				monA s = new monA();

			}else if(i == 2) {

				monA s2 = new monA();

			}else if(i == 3) {

				monA s3 = new monA();

			}else if(i == 4) {

				monA s4 = new monA();

			}else if(i == 5) {

				monA s5 = new monA();

			}

		}



	}


}
