package chapter3_1;

public class Sample2 {

	public static void main(String[] args) {
		int [] number = {5, 12, 8, 21, 9};
		for(int n : number) { //拡張for文
			System.out.println(n + " ");
		}
		
		int total = 0; //合計を入れる変数、0を初期値
		for(int n2 : number) { //要素を取り出して
			total += n2; //totalに加算する
		}
		System.out.println("合計=" + total);
		System.out.println("平均=" + total/number.length);
	}
	
}
