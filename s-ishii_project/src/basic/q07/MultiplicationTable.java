package basic.q07;

public class MultiplicationTable {

	public static void main(String[] args) {
		//段の数、外側 = 縦（行、段）になる。iとが逆の場合でも先に書いた方が縦。
		for (int i = 1; i <= 9; i++) {
			//かける数、内側 = 横（列）
			for (int j = 1; j <= 9; j++) {
				//i * jを表示 %3dは桁に応じた幅を確保する為に指定。(100の位）
				//%2dだと余白がなくて見えづらかった。
				//printlnにすると表示がガタガタになる。
				System.out.printf("%3d", i * j);

			}
			// 1行分出力で改行する
			System.out.println();
		}
	}

}
