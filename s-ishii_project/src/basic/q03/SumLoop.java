package basic.q03;

public class SumLoop {

	public static void main(String[] args) {

		int sum = 0; // 合計値を入れる変数

		for (int i = 1; i <= 100; i++) {
			sum += i; // sum = sum + i と同じ
		}

		System.out.println("" + sum + "");
	}
}
