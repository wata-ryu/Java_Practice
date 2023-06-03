package chapter6_1;

import java.util.Objects;

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

	public int getNumber() {	//getter
		return number;
	}

	public String getName() {
		return name;
	}

	public int getShotoku() {
		return shotoku;
	}

	public int getKoujo() {
		return koujo;
	}

	public void setNumber(int number) {	//setter
		this.number = number;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setShotoku(int shotoku) {
		this.shotoku = shotoku;
	}

	public void setKoujo(int koujo) {
		this.koujo = koujo;
	}

	@Override	//アノテーションというキーワードのひとつ(既存のメソッドを上書きする）
	public String toString() {
		return "Tax [number=" + number + ", name=" + name + ", shotoku=" + shotoku + ", koujo=" + koujo + "]";
	}

	@Override
	public int hashCode() {	//同じ納税者番号（number）を持つなら等しいとみなす
		return Objects.hash(number);
	}

	@Override
	public boolean equals(Object obj) {	//同じ納税者番号（number）を持つなら等しいとみなす
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tax other = (Tax) obj;
		return number == other.number;
	}
	

	
	
}
