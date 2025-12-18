package basic.q08;

import java.util.Scanner; //クラスのインポートをするときは一番上に置く

public class InputProduct {

	public static void main(String[] args) {

		// 1.Scannerオブジェクトを作成
		Scanner scanner = new Scanner(System.in);

		// 2.商品名を入力
		System.out.println("商品名を入力してください：");

		// 3.商品を受け取る
		String productName = scanner.nextLine();

		// 4.価格を入力
		System.out.println("価格を入力してください：");

		// 5.価格を受け取る
		int price = scanner.nextInt();

		// 6.商品名を表示（そのまま）
		System.out.println(productName);

		// 7.商品名と価格を組み合わせて表示
		System.out.println("商品名は" + productName + "です。価格は" + price + "円です。");

		scanner.close();

	}

}
