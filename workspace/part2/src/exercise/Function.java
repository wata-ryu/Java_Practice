package exercise;

public class Function {
	private int a;
	private int b;
	
	public Function(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public Function(int a) {
		this(10, a);
	}
	public Function() {
		this(10, 5);
	}
	
	public void result() {
		System.out.println(a + "x +  " + b);
	}
}
