package chapter2_9;

import jp.kwebs.lib.Input;

public class Sample1 {

	public static void main(String[] args) {
		String name = Input.getString("お名前");	//文字列を入力
		
		System.out.println("長さ" + name.length());	//長さ
		System.out.println("先頭文字=" + name.charAt(0));	//先頭の文字
	}

}
