package chapter3_3;

import java.util.List;	//インポート文が必要

public class Sample2 {

	public static void main(String[] args) {
		var list = List.of(8, 15, 21, 10, 7);	//リストを作成
		int total = 0;	//０を初期値
		for(int n : list) {	//拡張for文
			total += n;	//要素を加算
		}
		System.out.println("合計 = " + total);	//合計
		System.out.println(list);	//リスト全体を表示
	}

}
