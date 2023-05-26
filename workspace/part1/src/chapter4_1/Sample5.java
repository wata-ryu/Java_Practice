package chapter4_1;

public class Sample5 {
	//同じ名前のメソッドを作ることをオーバーロードという			引数の数が異なる時、引数の型が異なる時、引数の並び順が異なる時に使える
	public static void main(String[] args) {
		double ans1 = menseki(5.5);//①円の半径
		double ans2 = menseki(12, 2.5);//②四角形の辺の長さ
		
		System.out.printf("円の面積 = %.2f%n", ans1);	//①
		System.out.printf("四角形の面積 = %.2f%n", ans2);	//②
	}
	public static double menseki(double hankei) {	//①円の面積
		double s = Math.pow(hankei, 2) * Math.PI;
		return s;
	}
	public static double menseki(double height, double weight) {		//②四角形の面積
		double s = height * weight;
		return s;
	}

}
