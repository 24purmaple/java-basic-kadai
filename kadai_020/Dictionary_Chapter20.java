package kadai.kadai_020;

import java.util.HashMap;

public class Dictionary_Chapter20 {
	
	//参照するメソッド
	public void refer(String[] word) {
		
		//宣言
		HashMap<String,String> dictionary = new HashMap<>();
		
		String result = "";
	
		//要素の追加
        dictionary.put("apple", "りんご");
        dictionary.put("peach", "桃");
        dictionary.put("banana", "バナナ");
        dictionary.put("lemon", "レモン");
        dictionary.put("pear", "梨");
        dictionary.put("kiwi", "キウイ");
        dictionary.put("strawberry", "いちご");
        dictionary.put("grape", "ぶどう");
        dictionary.put("muscat", "マスカット");
        dictionary.put("cherry", "さくらんぼ");
        
      //調べる英単語が辞書に追加されているか判定
    	//繰り返し
    	for(int i = 0; i < word.length; i++) {
    		result = dictionary.get(word[i]);
    		
    		if(result == null) {
    			result =word[i] + "は辞書に存在しません";
    		} else {
    			result = word[i] + "の意味は" + result;
    		}
    		System.out.println(result);
    	}
    	
	}
}
