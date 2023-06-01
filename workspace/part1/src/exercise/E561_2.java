package exercise;

import java.util.List;

public class E561_2 {

	public static void main(String[] args) {
		var scores = List.of(
				new Score("田中", 85),
				new Score("鈴木", 66),
				new Score("斉藤", 82),
				new Score("木村", 57),
				new Score("山下", 77));
		
		for(Score s : scores) {	//拡張for文
			if(s.score() < 60) {	//60点未満のレコードがあれば中止させる
				System.out.println("60点未満です");
				break;
			}
			System.out.println(s);
		}
	}

}
