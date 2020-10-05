package list03_02;

public class Main2 {

	public static void main(String[] args) {
		System.out.println("あなたに相応しいパートナーを最新のディープランニングAI");
		System.out.println("AhO_nO_K ver.0.01 がレコメンド致します");
		System.out.println("個人情報の取り扱いにつきましては入力された時点をもちまして");
		System.out.println("自社規約に同意したと見なし、同規約上の日時より半永久的に");
		System.out.println("法的に有効となりますので、ご了承願います。");
		System.out.println("パートナーに希望する年収を万単位で入力してください。");
		
		int kane = new java.util.Scanner(System.in).nextInt();
		if (kane < 250) {
			System.out.println("身の丈に合ったチョイスですね");
			System.out.println("次の質問です。");
			System.out.println("交際3年目までの浮気を何回まで許せますか？");	
			
			int uwaki = new java.util.Scanner(System.in).nextInt();
			if (uwaki >= 2) {
				System.out.println("そうですね、お互いを許しあうことが重要です");
				System.out.println("では最後の質問です");
				System.out.println("相手に求める信念を二字熟語で答えてください。");
				}else {
					System.out.println("うーん、歩み寄りは自分からという精神が大切です");
					
				}
			
			
			
		}else {
			System.out.println("へぇー、そうですか、、、");
			System.out.println("うーん。。。プログラムを終了します（笑）");
			System.out.println("年収250万を超えるパートナーのレコメンドはシルバー会員以上からっす");
			}
	
	}

}
