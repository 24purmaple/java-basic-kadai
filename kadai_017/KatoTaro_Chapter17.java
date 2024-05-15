package kadai.kadai_017;
//子クラス1　継承させる
public class KatoTaro_Chapter17 extends Kato_Chapter17 {
	
	//メソッド
	public void setGivenName() {
		this.givenName = "太郎";
	}

	//抽象メソッドに具体的な処理
	void eachIntroduce() {
		System.out.println("Javaが得意です");
	}
	
}
