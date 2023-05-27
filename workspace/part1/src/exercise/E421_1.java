package exercise;

public class E421_1 {

	public static void main(String[] args) {
		int total = sum(10, 20, 30, 40, 50);	//int型で変数totalを定義
		
		System.out.println("合計 = " + total);
	}
	public static int sum(int... num) {	//int型のsumクラスを可変長引数で宣言
		int total = 0;	//合計値を0の初期値とする
		for(int n : num) {	//拡張for文、合計値の計算式
			total += n;
		}
		return total;	//mainメソッドに合計値を返す
	}

}
