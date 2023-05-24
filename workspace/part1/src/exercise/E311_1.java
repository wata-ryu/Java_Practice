package exercise;

public class E311_1 {

	public static void main(String[] args) {
		double [] data = {0.3, 1.05, 2.2};
		int total= 0;
		for(double n : data) {
			total += n;
		}
		System.out.println("合計=" + total);
		System.out.println("平均=" + total/data.length);
	}

}
