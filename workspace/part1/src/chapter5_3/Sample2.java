package chapter5_3;

import jp.kwebs.lib.Browser;
import jp.kwebs.lib.Input;

public class Sample2 {

	public static void main(String[] args) {
		String fname;
		String seiza = Input.getString("星座(ひらがな)");
		
		switch(seiza) {
			case "おひつじざ"			->		fname	=	"aries";
			case "おうしざ"				->		fname	=	"taurus";
			case "ふたござ"				->		fname	=	"gemini";
			case "かにざ"					->		fname	=	"cancer";
			case "ししざ"					->		fname	=	"leo";
			case "おとめざ"				->		fname	=	"virgo";
			case "てんびんざ"			->		fname	=	"libra";
			case "さそりざ"				->		fname	=	"scorpion";
			case "いてざ"					->		fname	=	"sagittarius";
			case "やぎざ"					->		fname	=	"capricorn";
			case "みずがめざ"			->		fname	=	"aquarius";
			case "うおざ"					->		fname	=	"pisces";
			default							->		{
				System.out.println("入力エラーです");
				fname = "index";	//占い見出しページの名前
			}
		}
		String url = "http://www.asahi.com/uranai/12seiza/";	//星座占いのURL
		Browser.openWindow(url + fname + ".html");	//外部クラスのためインポートが必要
	}

}
