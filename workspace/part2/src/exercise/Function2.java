package exercise;

import chapter7_6.Joining;

public class Function2 {
	private int a;
	private int b;
	
	public Function2(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public Function2(int a) {
		this(10, a);
	}
	public Function2() {
		this(10, 5);
	}
	
	public void result() {
		System.out.println(a + "x +  " + b);
	}
	
	public static void main (String[] args) {	//スタティックメソッド
		Function2 f2 = new Function2(12, 3);	 //インスタンスの作成
		f2.result();
	}
}
