package exercise_1;

import java.util.List;
import java.util.Objects;

public record Bread(String country, String name, int price, boolean soldout) {

	public static List<Bread> getBreadList() {

		return List.of(
				new Bread("日本", "カレーパン", 260, false),	
				new Bread("フランス", "クロワッサン", 230, false),	
				new Bread("イタリア", "フォカッチャ", 250, true),	
				new Bread("アメリカ", "ベーグル", 180, false),	
				new Bread("ドイツ", "ライムギパン", 300, false),	
				new Bread("イギリス", "スコーン", 180, false),	
				new Bread("フランス", "バケット", 380, false),	
				new Bread("イギリス", "マフィン", 220, true),	
				new Bread("アメリカ", "食パン", 250, false),	
				new Bread("フランス", "カンパーニュ", 350, false),	
				new Bread("ドイツ", "プレッツェル", 310, false),	
				new Bread("アメリカ", "ロールパン", 120, false),	
				new Bread("日本", "アンパン", 180, false)
			);
	}

	public Bread() {
		this("NoExist","NoExist",0,false);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bread other = (Bread) obj;
		return Objects.equals(name, other.name);
	}
		
}
