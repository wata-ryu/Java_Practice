package exercise;

import java.util.List;

public class E561_1 {

	public static void main(String[] args) {
		var names = List.of("apple", "Blackberry", "Lime", "Mango", "Watermelon");
		
		for(String n : names) {
			if(n.length()<6) {	//6文字以上だけ出力（6文字以下をスキップ）
				continue;
			}
			System.out.println(n);
		}
	}

}
