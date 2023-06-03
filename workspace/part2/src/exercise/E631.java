package exercise;

public class E631 {

	public static void main(String[] args) {
		Triangle triangle = new Triangle(2.5, 3.0, 5.1);	//コンストラクタの呼び出し,インスタンスの生成
		
		System.out.printf("面積=%.2f%n", triangle.menseki());	//三角形の面積表示, (printf書式付出力,%書式付宣言,.2小数点２桁まで表示,f浮動小数点数宣言,%n改行)
		System.out.printf("(a,b,c)=(%.1f, %.1f, %.1f)", triangle.getA(), triangle.getB(), triangle.getC());	//書式付出力の形式でゲッターを出力
	}

}
