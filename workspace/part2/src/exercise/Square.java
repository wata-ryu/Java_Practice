package exercise;

public class Square {
	private int bottom;	//底辺,	private->他のプログラムからアクセスできない変数
	private int height;	//高さ
	
	//コンストラクタ
	public Square(int bottom, int height) {
		this.bottom = bottom;
		this.height = height;
	}
	
	public int area() {	//四角形の面積を計算して返す
		return (int) (bottom * height);		//int 型のキャスト
	}
}
