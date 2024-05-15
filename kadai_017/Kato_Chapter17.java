package kadai.kadai_017;
//親クラス(抽象メソッドを持つので抽象クラスにする→abstract)
abstract public class Kato_Chapter17 {
	
	//フィールド
	public String familyName = "加藤";
	public String givenName = "";
	public String address = "東京都中野区○×";
	
	//メソッド1　共通の紹介を出力
	public void commonIntroduce() {
		System.out.println("名前は" + this.familyName + this.givenName +  "です");
		System.out.println("住所は" + this.address + "です");
	}
	
	//メソッド2(抽象)　個別の紹介を出力
	abstract void eachIntroduce();
	
	//メソッド3　紹介の実行
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
	}

}
