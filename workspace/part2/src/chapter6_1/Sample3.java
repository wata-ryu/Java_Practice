package chapter6_1;

public class Sample3 {

	public static void main(String[] args) {
		Tax t1 = new Tax(100, "田中宏", 300000, 100000);	//コンストラクタの呼び出し,インスタンスの生成
		Tax t2= new Tax(100, "田中", 200000, 120000);
		
		if(t1.equals(t2)) {	//t1とt2の納税者番号が同じなら等しいと表示
			System.out.println("等しい");
		}
		System.out.println(t1.hashCode());	//t1のハッシュ値
		System.out.println(t2.hashCode());//t1のハッシュ値(同じ)
	}

}
