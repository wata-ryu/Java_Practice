package chapter6_1;

public class Sample1 {

	public static void main(String[] args) {
		Tax tax = new Tax(100, "田中宏", 300000, 100000);	//コンストラクタの呼び出し,インスタンスの生成
		tax.setKoujo(120000);
		
		System.out.println("納税者番号 = " + tax.getNumber());
		System.out.println("氏　名 = " + tax.getName());
		System.out.println("所得額 = " + tax.getShotoku());
		System.out.println("控除額 = " + tax.getKoujo());
		
		System.out.println("所得税額 = " + tax.zeigaku());	//所得税額
	}

}
