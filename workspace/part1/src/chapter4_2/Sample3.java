package chapter4_2;

import java.util.List;

public class Sample3 {

	public static void main(String[] args) {
		var list = List.of(
				new Seiseki("木村", 80, 75, 80),	//Seisekiレコードを元にリストを作成
				new Seiseki("佐藤", 90, 95, 80),
				new Seiseki("田中", 70, 75, 75)
				);
		sum(list);	//引数として渡す
	}
	public static void sum(List<Seiseki> ls) {	//リスト型の引数i
		for(Seiseki s : ls) {
			System.out.println(s);
		}
	}

}
