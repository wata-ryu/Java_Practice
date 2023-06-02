package exercise;

public class Tax {
	private int number;	//納税者番号,	private->他のプログラムからアクセスできない変数
	private String name;	//氏名
	private int shotoku;	//所得額
	private int koujo;	//控除額
	
	//コンストラクタ
	public Tax(int number, String name, int shotoku, int koujo) {
		this.number = number;
		this.name = name;
		this.shotoku = shotoku;
		this.koujo = koujo;
	}

	public int zeigaku() {	//所得税額を計算して返す
		return (int) ((shotoku - koujo) * 0.1);		//int 型のキャスト
	}
	
}
