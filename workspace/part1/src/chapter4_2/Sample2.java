package chapter4_2;

public class Sample2 {

	public static void main(String[] args) {
		sum(10, 12, 8, 6, 15);
		sum(10, 12, 8, 6, 15, 100, 150, 200);
	}
	public static void sum(int... num) {	//可変長引数＝配列と同等
		for(int n : num) {
			System.out.print(n + "\t");
		}
	}

}
