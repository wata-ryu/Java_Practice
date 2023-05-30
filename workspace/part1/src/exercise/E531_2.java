package exercise;

import jp.kwebs.lib.Input;

public class E531_2 {

	public static void main(String[] args) {
		int tuki = Input.getInt("月");
		
		String kisetu = switch(tuki) {
			case 12, 1, 2		->	 "冬";
			case 3, 4, 5		->	 "春";
			case 6, 7, 8			->	 "夏";
			default				->	 "秋";
		};	//コンマを忘れずに！
		System.out.println("kisetu");
	}

}
