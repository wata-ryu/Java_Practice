package chapter6_1;

public class Sample1 {

	public static void main(String[] args) {
		Tax tax = new Tax(100, "田中宏", 300000, 100000);	//コンストラクタの呼び出し,インスタンスの生成
		System.out.println(tax.zeigaku());	//所得税額
	}

}
