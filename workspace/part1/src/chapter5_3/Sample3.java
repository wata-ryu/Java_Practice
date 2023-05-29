package chapter5_3;

import jp.kwebs.lib.Input;

public class Sample3 {

	public static void main(String[] args) {
		int s = Input.getInt();
		String msg = switch(s) {	//Long,double,float型は使えない!,  caseは順不同でも可！
			case 100					->		"正常終了";
			case 200, 201		->		"ページが存在しない";
			default					->		{//どのケースにも当てはまらなかった時, switch式の場合必ず値を返さなければ行けないので省略できない！！
				System.out.println("ステータス番号 : " + s);
				yield "内部エラー";		//yieldで返す値を指定
			}
		};
		System.out.println(msg);
	}

}
