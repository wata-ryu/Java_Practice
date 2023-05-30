package exercise;

import jp.kwebs.lib.Input;

public class E531_3 {

	public static void main(String[] args) {
		String code = Input.getString("商品コード");	//商品コードを入力させる
		
		int tanka = switch(code) {	//コードがあっていれば単価を返す、あっていなければ０を返す
			case	"a100", "b100", "d100"			->		100;
			case	"a110", "c100"						->		200;
			case	"b110", "c110"							->		210;
			case	"b120"										->		250;
			default												->		0;
		};
		
		if(tanka	!=	0)	{	//単価が０じゃない時は個数を入力させ、合計金額を表示
			int kosuu = Input.getInt("個数");
			int goukei = tanka * kosuu;
			System.out.println("合計金額=" + goukei );
		}else	{	//単価が０の時はエラー文を返す
			System.out.println("商品コードが間違っています");
		}
		
	}

}
