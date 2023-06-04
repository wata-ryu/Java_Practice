package chapter7_2;

public class Joining {
	private String csv;	//csv型式の文字列
	private String delimiter;	//区切り文字(,など)
	

	//コンストラクタ
	public Joining(String csv, String delimiter) {
		this.csv = csv;
		this.delimiter = delimiter;
	}
	
	public Joining(String delimiter) {
		this.csv = "";	//空文字を規定値とする
		this.delimiter = delimiter;
	}
	
	public Joining() {
		this.csv = "";	//空文字を規定値とする
		this.delimiter = ",";//コンマを規定値とする
	}
	
	
	public void add(String s) {//sを連結する
		if(csv.isEmpty()) {//csvが空文字""の時、isEmpty()はtrueを返す
			csv += s;
		}else {
			csv += delimiter + s;
		}
	}
	
	//ゲッター
	public String getCsv() {//csv文字列を返す
		return csv;
	}

}
