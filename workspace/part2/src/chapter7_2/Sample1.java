package chapter7_2;

public class Sample1 {

	public static void main(String[] args) {
		Joining j = new Joining("", ",");//Joiningインスタンスを作成
		j.add("apple");	//文字列を連結する
		j.add("banana");
		j.add("peach");
		
		System.out.println(j.getCsv());//csv文字列を取り出して表示する
	}

}
