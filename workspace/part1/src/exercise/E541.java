package exercise;

import jp.kwebs.lib.Input;

public class E541 {

	public static void main(String[] args) {
		int total = 0;//	合計数を０で定義
		for(int i = 0; i<5; i++ ) {	//整数を入力させ,その度足していく工程を５回繰り返す
			int x = Input.getInt("整数");
			total += x;
		}
		System.out.println("合計=" + total);	//５回に達したら合計数を出力
		
	}

}
