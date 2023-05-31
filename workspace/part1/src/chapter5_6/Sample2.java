package chapter5_6;

import java.util.List;

public class Sample2 {

	public static void main(String[] args) {
		var	numbers	=	List.of(150, 88, 91, -27, 55);
		for(int n : numbers) {
			if(n<0) {
				continue	;	//-27をスキップして続行
			}
			System.out.print(n + "\t");
		}
	}

}
