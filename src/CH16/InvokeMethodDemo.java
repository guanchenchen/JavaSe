package CH16;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class InvokeMethodDemo {
	public static void main(String[] args) {
		try {
			Class c = Class.forName("CH16.InvokeMethodDemo");
			// ʹ�ßo�������������������
			Object targetObj = c.newInstance();
			// �O�������͑B
			Class[] param1 = { String.class };
			// ���������͑Bȡ�ط������
			Method setNameMethod = c.getMethod("setName", param1);
			// �O������ֵ
			Object[] argObjs1 = { "caterpillar" };
			// �o����������ָ�����֮����
			setNameMethod.invoke(targetObj, argObjs1);

			Class[] param2 = { Integer.TYPE };
			Method setScoreMethod = c.getMethod("setScore", param2);

			Object[] argObjs2 = { new Integer(90) };
			setScoreMethod.invoke(targetObj, argObjs2);
			// �@ʾ�������
			System.out.println(targetObj);

		} catch (ClassNotFoundException e) {
			System.out.println("�Ҳ���e");
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			System.out.println("�]���@������");
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		}
	}
}
