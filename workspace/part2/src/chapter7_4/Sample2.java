package chapter7_4;

public class Sample2 {
	//コンストラクタで初期化しないフィールドの値
	public static void main(String[] args) {
		NoConstructer nc = new NoConstructer();
		System.out.println(nc.getNumber());
		System.out.println(nc.getStr());
	}

}
