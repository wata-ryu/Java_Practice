package chapter4_2;

import java.util.List;

public class Sample4 {

	public static void main(String[] args) {
		var list = getList();	// Seisekiレコードのリストを受け取る  変数の方はgetList()メソッドから型推論されるのでvarが使える
		for(Seiseki x : list) {
			System.out.println(x.name() + " 国語 : " + x.kokugo() + "  数学 : " + x.suugaku() + " 英語 : " + x.eigo());
		}
	}
	public static List<Seiseki> getList() {	//戻り値はList型
		var list = List.of(
				new Seiseki("木村", 80, 75, 80),	//Seisekiレコードを元にリストを作成
				new Seiseki("佐藤", 90, 95, 80),
				new Seiseki("田中", 70, 75, 75)
				);
		return list;	// Seisekiレコードのリストを返す
	}

}
