package exercise;

import jp.kwebs.lib.Input;

public class E521_3 {

	public static void main(String[] args) {
		int tuki = Input.getInt("月");
	
		if (tuki < 1 && tuki > 12) {
			System.out.println("月の値が不正です");
		} else if (tuki == 12 || tuki < 3) {
			System.out.println("冬");
		} else if(tuki > 6) {
			System.out.println("春");
		} else if(tuki > 9) {
			System.out.println("夏");
		} else {
			System.out.println("秋");
		}
	}
}
