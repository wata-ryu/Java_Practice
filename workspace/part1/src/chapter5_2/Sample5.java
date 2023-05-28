package chapter5_2;

public class Sample5 {

	public static void main(String[] args) {
		double value = Math.random();
		if(value>=0.9) {
			System.out.println("大吉");	//0.9以上の時のみ大吉と表示
		}	else if (value>=0.7) {
			System.out.println("中吉");	//0.7以上の時のみ中吉と表示
		}	else if (value>=0.5) {
			System.out.println("小吉");	//0.5以上の時のみ小吉と表示
		}	else {
			System.out.println("吉");	//それ以外の時は吉と表示
		}
	}

}
