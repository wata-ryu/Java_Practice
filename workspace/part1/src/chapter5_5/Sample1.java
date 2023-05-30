package chapter5_5;

import jp.kwebs.lib.Input;

public class Sample1 {

	public static void main(String[] args) {
		String str;	//strを定義
		
		while((str = Input.getString()) != null) {	//文字列を入力させ、それが空でない限り続く繰り返し文
			System.out.println(str + "を入力した");
		}
	}

}
