package chapter2_10;

public class Sample2 {

	public static void main(String[] args) {
		//テキストの雛形
		String msg = """
				こんにちは%sさん！
				あなたの成績は%d点でした。
				これからも頑張ってください！
				""";
		
		System.out.println(msg.formatted("田中宏", 90));	//データを埋め込む
	}

}
