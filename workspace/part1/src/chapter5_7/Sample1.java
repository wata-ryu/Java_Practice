package chapter5_7;

import jp.kwebs.lib.Input;

public class Sample1 {

	public static void main(String[] args) {
		String sw ;	//条件の使用が{}の外にあるのでswの定義も外でする！
		
		do {
			sw = Input.getString("続けますか？(yes=Enter, no=otherkey)");
		}while(sw==null);	//swがnullなら繰り返す
		System.out.println("End");
	}

}
