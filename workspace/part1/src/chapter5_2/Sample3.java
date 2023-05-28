package chapter5_2;

import jp.kwebs.lib.Input;

public class Sample3 {

	public static void main(String[] args) {
		String  word = Input.getString();
		if(word.equals("cat")) {
			System.out.println("大当たり");	//入力された文字がcatだったら大当たりと表示
		} else {
			System.out.println("はずれ");	//それ以外ははずれ
		}
	}

}
