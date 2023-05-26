package chapter4_1;

public class Sample4 {
	//同じ名前のメソッドを作ることをオーバーロードという			引数の数が異なる時、引数の型が異なる時、引数の並び順が異なる時に使える
	public static void main(String[] args) {
		System.out.println(menseki(6));	//①
		System.out.println(menseki(3, 4)); //②
		System.out.println(menseki(7, 5, 4));	//③
	}
	public static double menseki(double a) {		//①正三角形で全ての辺の長さが同じ
		return menseki(a, a, a);
	}
	public static double menseki(double h, double w) {	//②三角形の公式
		return h * w / 2;
	}
	public static double menseki(double a, double b, double c) {	//③ヘロンの公式
		double s = (a + b + c) / 2;
		double ss = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		return ss;
	}
}
