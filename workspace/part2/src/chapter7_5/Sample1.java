package chapter7_5;

public class Sample1 {

	public static void main(String[] args) {
		StaticJoining.init("", ",");//初期化
		
		StaticJoining.add("apple");	//スタティックメソッドを使う
		StaticJoining.add("banana");
		StaticJoining.add("peach");
		
		System.out.println(StaticJoining.getCsv());//csv文字列を取り出して表示する
	}

}
