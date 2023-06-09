package chapter7_5;

public class StaticJoining {
	private static String csv;	//フィールド
	private static String delimiter;
	
	public static void init(String _csv, String _delimiter) {	//初期化
		csv = _csv;
		delimiter = _delimiter;
	}
	
	public static String add(String s) {	//連結する
		csv += csv.isEmpty() ? s : delimiter + s;
		return csv;
	}

	public static String getCsv() {	//csvのゲッター
		return csv;
	}
	
}
