package chapter2_8;

import jp.kwebs.lib.Input;

public class Sample1 {

	public static void main(String[] args) {
		double value = Input.getDouble();	//doubleの値を入力
		System.out.println("平方根=" + Math.sqrt(value));
	}

}
