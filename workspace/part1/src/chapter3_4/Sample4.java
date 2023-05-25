package chapter3_4;

import java.util.ArrayList;

public class Sample4 {

	public static void main(String[] args) {
		var list = new ArrayList<String>();	//文字列を入れる要素の作成
		list.add("banana");	//要素を追加
		list.add("pineapple");
		list.add("grape");
		list.add("apple");
		System.out.println(list);
		
		System.out.println(list.size());	//要素数
		System.out.println(list.get(1));		//インデックス１を取得
		System.out.println(list.contains("apple"));	//”apple”が含まれるか
		System.out.println(list.remove(2));	//インデックス２を削除
		System.out.println(list);
		
		list.clear();	//全要素を削除
		System.out.println(list);
		System.out.println(list.isEmpty());	//リストは空か
	}

}
