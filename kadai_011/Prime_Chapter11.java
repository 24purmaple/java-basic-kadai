package kadai.kadai_011;

public class Prime_Chapter11 {

	public static void main(String[] args) {
		
		//配列を作成
		boolean[] Num = new boolean[101];
		
		//for文で繰り返しtrueで初期化
		for( int i = 0; i < Num.length; i++) {
			Num[i] =true;
		}
		
		//Numを2から繰り返す
		for( int i = 2; i < Num.length; i++) {
			//もしNumが
			if(Num[i]) {
				
				for ( int DivNum = i * 2; DivNum < Num.length; DivNum += i) {
					Num[DivNum] = false;
				}

			}
		}
		
		//繰り返し出力
		for( int i = 2; i < Num.length; i++ ) {
			//true(素数と判断したもの)を表示
			if(Num[i]) {
				System.out.println(i);
			}
		}

	}

}
