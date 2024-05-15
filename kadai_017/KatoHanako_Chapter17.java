package kadai.kadai_017;

public class KatoHanako_Chapter17 extends Kato_Chapter17 {

	//メソッド
	public void setGivenName() {
		this.givenName = "花子";
	}
	
	//抽象メソッドに具体的な処理
	void eachIntroduce() {
		System.out.println("趣味は読書です");
	}
}
