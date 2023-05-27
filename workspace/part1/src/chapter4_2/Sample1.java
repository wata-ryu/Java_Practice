package chapter4_2;

public class Sample1 {

	public static void main(String[] args) {
		int[] numbers = {10, 12, 8, 6, 15};
		sum(numbers);	//配列
	}
	public static void sum(int[] num) {	//引数はint[]型
		for(int n : num) {
			System.out.print(n + "\t");
		}
	}

}
