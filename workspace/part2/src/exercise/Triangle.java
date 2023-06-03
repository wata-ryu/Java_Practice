package exercise;

import java.util.Objects;

public class Triangle {
	private double a;//三角形の長さ,	private->他のプログラムからアクセスできない変数
	private double b;
	private double c;
	
	//コンストラクタ
	public Triangle(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	//三角形の面積を計算して返す
	public double menseki() {
		double s =(a + b + c)/2;
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));	//sqrt=平方根
	}
	
	
	public boolean isTriangle() {
		return b + c > a && a > Math.abs(b - c);	//abs=絶対値を返す
	}
	
	
	
	//ゲッター
	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}


	
}
