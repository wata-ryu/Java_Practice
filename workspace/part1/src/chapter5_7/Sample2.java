package chapter5_7;

import jp.kwebs.lib.Input;

public class Sample2 {

	public static void main(String[] args) {
		int number = Input.getInt();
		
		switch(number) {	//古い型式のswitch文,breakで切る、今はまず使わない
			case 10:
			case 20:			System.out.println("10か20です");
									break;
			case 30:			System.out.println("30です");
									break;
			default :			System.out.println("その他です");
		}
	}
}
