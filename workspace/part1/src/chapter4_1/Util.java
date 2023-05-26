package chapter4_1;
//メインメソッドが無く、メソッドだけ集めたクラスは、ライブラリクラスということもある
public class Util {
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
