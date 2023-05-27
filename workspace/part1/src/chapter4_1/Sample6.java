package chapter4_1;

public class Sample6 {

	public static void main(String[] args) {
		//Utilからmensekiクラスを呼び出して計算している
		double x = Util.menseki(5);//クラスメソッドという
		System.out.printf("三角形の面積 = %.2f%n", x);
	}

}
