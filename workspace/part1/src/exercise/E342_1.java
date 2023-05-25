package exercise;

import java.util.ArrayList;

public class E342_1 {

	public static void main(String[] args) {
		var list = new ArrayList<Product>();
		
		list.add(new Product("MT890", "ステンレスネジ", 280, false));
		list.add(new Product("MT810", "タッピングネジ", 160, true));
		list.add(new Product("MT900", "スクリューネジ", 330, true));
		
		for(Product p : list) {
			System.out.println(p.name() +  "\t" + p.price());	  //"\t"←タブ	.nameで対象だけを取り出す
		}
	}
}
