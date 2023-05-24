package chapter3_3;

import java.util.List;

public class Sample1 {

	public static void main(String[] args) {
		var list = List.of(10, 20, 30);
		
		for(int n : list) {
			System.out.println(n);
		}
	}

}
