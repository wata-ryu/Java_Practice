package exercise;

public class E321_2 {

	public static void main(String[] args) {
		Product p = new Product("MT890", "ステンレスネジ", 280, false);//インスタンス作成
		
		System.out.println("商品コード	=	" + p.code());	//ゲッターでフィールドを表示
		System.out.println("商品名		=	" + p.name());
		System.out.println("価格			=	" + p.price());
		System.out.println("欠品			=	" + p.shortage());
	}

}
