package exercise;

import jp.kwebs.lib.Input;

public class E411_2 {

	public static void main(String[] args) {
		double weight = Input.getDouble("体重");	//①身長、体重を入力させる
		double height = Input.getDouble("身長");
		
		double x = bmi(weight, height);	//⑤xに結果の値を受け取る
		
		System.out.printf("BMI指数=%.1f%n", x);	//⑥結果表示        %書式文字列, .1小数点1列まで表示, f浮動小数点数型宣言, %n改行
	}
	public static double bmi(double weight, double height) {	//②戻り値型double
	double x = weight / Math.pow(height / 100, 2);	//③bmiの計算,   Math.powはべき乗
	return x;	//④mainクラスに返す
	}

}
