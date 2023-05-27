package exercise;

import java.util.List;

public class E423 {

	public static void main(String[] args) {
		var list = getList();	// Priductレコードのリストを受け取る  変数の方はgetList()メソッドから型推論されるのでvarが使える
		for(Product x : list) {
			System.out.println(x.name() + "		" + x.price());	//名前と価格のみ表示
		}
	}
	public static List<Product> getList() {	//戻り値はList型
		var list = List.of(
				new Product("MT890", "ステンレスネジ", 280, false),	//Productレコードを元にリストを作成
				new Product("MT810", "タッピングネジ", 160, true),
				new Product("MT900", "スクリューネジ", 330, true)
				);
		return list;// Productレコードのリストを返す
	}

}
