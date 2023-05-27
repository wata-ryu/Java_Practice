package exercise;

import java.util.List;

public class E422_1 {

	public static void main(String[] args) {
		var list = List.of(15, 123, 26, 99, 31);
		int total = sumList(list);
		
		System.out.println("合計 = " + total);
	}
	public static int sumList(List<Integer> list) {	//<>の中はラッパークラス型を使用　→　intでは間違い
		int total = 0;
		for(int x : list) {
			total += x;
		}
		return total;
	}

}
