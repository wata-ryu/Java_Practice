package chapter7_3;

public class Joining {
	private String str;
	private String delimiter;
	
	public Joining(String str, String delimiter) {
		this.str = str;
		this.delimiter = delimiter;
	}
	public Joining(String delimiter) {	//thisによるコンストラクタの簡単化
		this("", delimiter);
	}
	public Joining() {	//thisによるコンストラクタの簡単化
		this("", ",");
	}
}
