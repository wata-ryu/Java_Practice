package chapter4_1;
/**
 * ユーティリティクラス
 * <p>
 * 便利なメソッドを集めたクラスです。<br>
 * これから色々なメソッドを追加していきます。
 * 
 * @version 1.0-SNAPSHOT
 * @author ryuunosuke
 *
 */
//メインメソッドが無く、メソッドだけ集めたクラスは、ライブラリクラスということもある
public class Util {
	/**
	 * 正三角形の面積を計算する
	 * 
	 * @param a 三角形の一辺の長さ
	 * @return	  三角形の面積
	 */
	public static double menseki(double a) {		//①正三角形で全ての辺の長さが同じ
		return menseki(a, a, a);
	}
	/**
	 * 高さと底辺の長さから三角形の面積を計算する
	 * 
	 * @param h	高さ
	 * @param w	底辺の長さ
	 * @return		三角形の面積
	 */
	public static double menseki(double h, double w) {	//②三角形の公式
		return h * w / 2;
	}
	/**
	 * 三辺の長さから三角形の面積を計算する
	 * 
	 * @param a	辺aの長さ
	 * @param b	辺bの長さ
	 * @param c	辺cの長さ
	 * @return		三角形の面積
	 */
	public static double menseki(double a, double b, double c) {	//③ヘロンの公式
		double s = (a + b + c) / 2;
		double ss = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		return ss;
	}
}
