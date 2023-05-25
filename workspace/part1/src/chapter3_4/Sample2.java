package chapter3_4;

import java.util.ArrayList;

public class Sample2 {

	public static void main(String[] args) {
		var list = new ArrayList<Integer>();	//整数リストの生成
		list.add(25);	//データを登録する
		list.add(10);
		list.add(15);
		
		for(int n : list) {	//拡張for文
			System.out.println(n);
		}
	}

}
