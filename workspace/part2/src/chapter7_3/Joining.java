package chapter7_3;

public class Joining {
	private String str;
	private String delimiter;
	
	public Joining(String str, String delimiter) {
		this.str = str;
		this.delimiter = delimiter;
	}
	public Joining(String delimiter) {
		this("", delimiter);
	}
	public Joining() {
		this("", ",");
	}
}
