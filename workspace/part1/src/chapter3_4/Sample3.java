package chapter3_4;

import java.util.ArrayList;

import chapter3_2.Population;

public class Sample3 {

	public static void main(String[] args) {
		var list = new ArrayList<Population>();	//可変リスト作成
		
		list.add(new Population("北海道", 5250, -6.8));	//レコードを追加
		list.add(new Population("東京都", 13921, 7.1));
		list.add(new Population("大阪府", 8809, -0.4));
		list.add(new Population("福岡県", 5104, -0.7));
		list.add(new Population("沖縄県", 1453, 3.9));
		
		for(Population p : list) {
			System.out.println(p);
		}
	}

}
