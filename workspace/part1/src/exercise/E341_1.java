package exercise;

import java.util.ArrayList;

public class E341_1 {

	public static void main(String[] args) {
		var list = new ArrayList<String>();
		list.add("リンゴ");
		list.add("バナナ");
		list.add("みかん");
		
		for(String f : list) {
			System.out.println(f);
		}
	}

}
