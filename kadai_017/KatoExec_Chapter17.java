package kadai.kadai_017;

public class KatoExec_Chapter17 {

	public static void main(String[] args) {
		
		//子クラスのオブジェクト作成
		KatoTaro_Chapter17 Taro = new KatoTaro_Chapter17();
		KatoIchiro_Chapter17 Ichiro = new KatoIchiro_Chapter17();
		KatoHanako_Chapter17 Hanako = new KatoHanako_Chapter17();
		
		//setGivenNameメソッドの実行
		Taro.setGivenName();
		Ichiro.setGivenName();
		Hanako.setGivenName();
		
		//execIntrodiceの実行
		Taro.execIntroduce();
		Ichiro.execIntroduce();
		Hanako.execIntroduce();

	}

}
