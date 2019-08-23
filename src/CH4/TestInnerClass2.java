package CH4;

public class TestInnerClass2 {

	public void method() {
		// 少之又少
		class InnerClass {

		}
	}

	public Comparable getComparable1() {
		return new Comparable() {

			@Override
			public int compareTo(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}

		};
	}

	// 推荐这个使用
	public Comparable getComparable() {

		class MyComparable implements Comparable {

			@Override
			public int compareTo(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}

		}
		return new MyComparable();

	}

}
