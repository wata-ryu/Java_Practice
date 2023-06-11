package chapter7_6;
//スタティックメンバの混在
public class Joining {
	private String str;
	private String delimiter;
	
	public Joining(String str, String delimiter) {
		this.str = str;
		this.delimiter = delimiter;
	}
	public String add(String s) {	//連結する
		str += str.isEmpty() ? s : delimiter + s;
		return str;
	}
	public String getStr() {
		return str;
	}
	
	public static void main (String[] args) {	//スタティックメソッド
		Joining j = new Joining("", ",");	//インスタンスの作成
		
		j.add("apple");	//インスタンスメソッドの実行
		j.add("banana");
		j.add("peach");
		System.out.println(j.getStr());
	}
	
}
