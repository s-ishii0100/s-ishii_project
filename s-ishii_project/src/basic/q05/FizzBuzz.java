package basic.q05;

public class FizzBuzz {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) { //++でiに1ずつ足される。条件:100になるまで

			if (i % 3 == 0 && i % 5 == 0) { //iが3または5で割った時に0になると判定 2つの公倍数
				System.out.println("FizzBuzz");

			} else if (i % 3 == 0) { //iが3で割った時に0になると判定 =3の倍数
				System.out.println("Fizz");

			} else if (i % 5 == 0) { //iが5で割った時に0になると判定 =5の倍数
				System.out.println("Buzz");

			} else {
				System.out.println(i);
			}
		}
	}

}
