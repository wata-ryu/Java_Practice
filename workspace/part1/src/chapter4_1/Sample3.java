package chapter4_1;

public class Sample3 {

	public static void main(String[] args) {
		double ans = calc(10, 2);	//ansに結果の値を受け取る、自動型変換が働くので、整数も可
		System.out.println(ans);	//戻り値を表示
	}
	
	public static double calc(double x1, double x2) {	//戻り値型はdouble
		return Math.sqrt(x1 + x2);	//計算結果を返す
	}

}
