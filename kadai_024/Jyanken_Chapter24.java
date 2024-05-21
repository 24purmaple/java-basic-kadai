package kadai.kadai_024;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter24 {
	
	//メソッド1
	public String getMyChoice() {
		
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		//scannerクラスのオブジェクト
		Scanner scanner = new Scanner(System.in);
		//正しいじゃんけんの手(true)になるまで判定
		while(true) {
			String myHand = scanner.nextLine();
			if(myHand.equals("r") || myHand.equals("s") || myHand.equals("p")) {
				scanner.close();
				return myHand;
			} else {
				String errorLog ="r、s、pのいずれかを入力してください";
				System.out.println(errorLog);
			}
		}
		
	}
	
	//メソッド2
	public String getRandom() {
		//配列にじゃんけんの手をセットする
		String[] Hand = {"r","s","p"};
		//乱数で選ぶ
		String comHand = Hand[(int)Math.floor(Math.random() *3)];
		return comHand;
	}
	
	//メソッド3
	public void playGame(String myHand, String comHand) {
	
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("r", "グー");
		map.put("s", "チョキ");
		map.put("p", "パー");
		System.out.println("自分の手は" + map.get(myHand) + ", 対戦相手の手は" + map.get(comHand));
		if (myHand.equals("r") && comHand.equals("r")
				|| myHand.equals("s") && comHand.equals("s")
				|| myHand.equals("p") && comHand.equals("p")) {
			System.out.println("あいこです");
		}
	
		else if (myHand.equals("r") && comHand.equals("s")
				|| myHand.equals("s") && comHand.equals("p")
				|| myHand.equals("p") && comHand.equals("r")) { 
			System.out.println("自分の勝ちです");
		}
	
		else if (myHand.equals("r") && comHand.equals("p")
				|| myHand.equals("s") && comHand.equals("r")
				|| myHand.equals("p") && comHand.equals("s")) { 
			System.out.println("自分の負けです");
		}
	
	}

}
