package exercise;

import jp.kwebs.lib.Input;

public class E291_1 {

	public static void main(String[] args) {
		String str = Input.getString();
		
		System.out.println(str.equals("abc"));
		System.out.println(str.length());
		System.out.println(str.replace("a", "xxx"));
	}

}
