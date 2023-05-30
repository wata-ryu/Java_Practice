package chapter5_3;

import jp.kwebs.lib.Browser;
import jp.kwebs.lib.Input;

public class Sample4 {

	public static void main(String[] args) {
		String seiza = Input.getString("星座(ひらがな)");
		
		String fname = switch(seiza) {	//式の値をfnameに代入
			case "おひつじざ"			->		"aries";
			case "おうしざ"				->		"taurus";
			case "ふたござ"				->		"gemini";
			case "かにざ"					->		"cancer";
			case "ししざ"					->		"leo";
			case "おとめざ"				->		"virgo";
			case "てんびんざ"			->		"libra";
			case "さそりざ"				->		"scorpion";
			case "いてざ"					->		"sagittarius";
			case "やぎざ"					->		"capricorn";
			case "みずがめざ"			->		"aquarius";
			case "うおざ"					->		"pisces";
			default							->		{
				System.out.println("入力エラーです");
				yield "index";	//占い見出しページの名前,	yieldで値を返す
			}
		};	//セミコロン忘れず！
		String url = "http://www.asahi.com/uranai/12seiza/";	//星座占いのURL
		Browser.openWindow(url + fname + ".html");	//外部クラスのためインポートが必要
	}

}
