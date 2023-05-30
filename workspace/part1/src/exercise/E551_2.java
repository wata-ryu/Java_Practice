package exercise;

import jp.kwebs.lib.Input;

public class E551_2 {

	public static void main(String[] args) {
		int n, total = 0;	//入力してもらう数字nと合計totalを初期値０として定義
		
		while((n = Input.getInt()) !=0) {	//空が入力されるまで整数を入力させる
			total += n;	//その度足していく
			System.out.println("合計= " + total);
		}
	}

}
