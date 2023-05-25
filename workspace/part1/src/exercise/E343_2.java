package exercise;

import java.util.ArrayList;

public class E343_2 {

	public static void main(String[] args) {
		var list = new ArrayList<String>();
		list.add("rabbit");
		list.add("cat");
		list.add("dog");
		
		//bearを要素として追加
		list.add("bear");
		//インデックス１を取得
		System.out.println(list.get(1));
		//catが含まれているか
		System.out.println(list.contains("cat"));
		//先頭の要素削除、削除して要素表示
		System.out.println(list.remove(0));
		//リストの要素数表示
		System.out.println(list.size());
		System.out.println(list);
	}

}
