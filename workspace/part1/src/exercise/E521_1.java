package exercise;

import jp.kwebs.lib.Input;

public class E521_1 {

	public static void main(String[] args) {
		int hito = Input.getInt("人数");	//人数を入力させる
		int kakaku = hito * 1000;	//１人1000円の定義
		if (hito >= 5) {	//５人以上の場合
			kakaku *= 0.7;		//３割引
		}
		System.out.printf("%,d円", kakaku);	//3桁ごとにコンマを挿入し、整数型のd記述
	}

}
