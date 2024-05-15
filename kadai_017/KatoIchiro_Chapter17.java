package kadai.kadai_017;
//子クラス2
public class KatoIchiro_Chapter17 extends Kato_Chapter17 {
	
	//メソッド
	public void setGivenName() {
		this.givenName = "一郎";
	}
	
	//抽象メソッドに具体的な処理
	void eachIntroduce() {
		System.out.println("好きな食べ物はリンゴです");
	}

}
