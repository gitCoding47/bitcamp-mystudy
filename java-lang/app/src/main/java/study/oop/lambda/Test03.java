package study.oop.lambda;

public class Test03 {

	interface Calculator {
		int plus(int a, int b);
	}

	static void test(Calculator c) {
		System.out.println(c.plus(100, 200));
	}

	public static void main(String[] args) {
		// 1) 일반 클래스
		class MyCalc implements Calculator {
			@Override
			public int plus(int a, int b) {
				return a + b;
			}
		}
		Calculator c1 = new MyCalc();
		test(c1);

		// 2) 익명 클래스

	}
}
