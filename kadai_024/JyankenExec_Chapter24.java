package kadai.kadai_024;

public class JyankenExec_Chapter24 {

	public static void main(String[] args) {
		//インスタンス作成
		Jyanken_Chapter24 jyanken = new Jyanken_Chapter24();

		String myHand = jyanken.getMyChoice();
		String comHand = jyanken.getRandom();
		jyanken.playGame(myHand, comHand);
	}

}
