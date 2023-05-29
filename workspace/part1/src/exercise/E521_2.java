package exercise;

import jp.kwebs.lib.Input;

public class E521_2 {

	public static void main(String[] args) {
		int y = Input.getInt("西暦年");
		if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {	//4で割り切れ、かつ、100では割り切れない、または400で割り切れる
			System.out.println("うるう年です");
		} else {
			System.out.println("うるう年ではありません");
		}
	}

}
