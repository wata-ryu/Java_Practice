package chapter2_10;

public class Sample1 {

	public static void main(String[] args) {
		double v1 = 123.56789;
		double v2 = 987.654321;
		System.out.printf("%.2f	%.2f%n", v1, v2);
		
		int gaku = 123456789;
		System.out.printf("%, d%n", gaku);
		
		long gaku2 = 1234567890123L;
		System.out.printf("%, d%n", gaku2);
		
		int gaku3 = 123456789;
		System.out.printf("%, 13d%n", gaku3);
		
		String str = "Hello";
		System.out.printf("%13s%n", str);
		System.out.printf("%-13s%n", str);
	}

}
