package exercise;

import jp.kwebs.lib.Input;

public class E511_2 {

	public static void main(String[] args) {
		String x = Input.getString();	//入力させる
		String y = x.equals("OK") ? "おめでとう" : "残念";	//入力された文字がOKならおめでとう、それ以外なら残念を表示,　式、結果ををyに代入
		System.out.println(y);	//表示
	}

}
