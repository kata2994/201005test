package list10_05;

public class HyperHero extends Hero{

	public void hyperMove() {

		System.out.println("直帰します");

	}


	@Override
	public void run() {

		System.out.println("定時なので直帰します");

	}


}
