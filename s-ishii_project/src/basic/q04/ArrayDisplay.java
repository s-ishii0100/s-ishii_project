package basic.q04;

public class ArrayDisplay {
	public static void main(String[] args) {

		// 配列を定義（要素数5）
		String[] fruits = { "りんご", "ばなな", "みかん", "ぶどう", "すいか" };

		// 拡張for文で順番に表示
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
	}

}
