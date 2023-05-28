package chapter5_2;

public class Sample4 {

	public static void main(String[] args) {
		double value = Math.random();
		if(value>=0.9) {
			System.out.println("大吉");	//0.9以上の時のみ大吉と表示
		} else {
			System.out.println("吉");	//それ以外は吉
		}
	}

}
