package CH4;

public class TestInnerClass2 {

	public void method() {
		// ��֮����
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

	// �Ƽ����ʹ��
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
