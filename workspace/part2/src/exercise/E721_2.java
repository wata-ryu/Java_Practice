package exercise;
import chapter7_2.Joining;	//インポートはここに記述
public class E721_2 {

	public static void main(String[] args) {
		Joining j = new Joining();	//引数のないコンストラクタを使用
		j.add("apple");
		j.add("banana");
		j.add("peach");
		System.out.println(j.getStr());
	}

}
