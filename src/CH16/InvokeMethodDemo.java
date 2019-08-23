package CH16;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class InvokeMethodDemo {
	public static void main(String[] args) {
		try {
			Class c = Class.forName("CH16.InvokeMethodDemo");
			// 使用無參數建構方法建立物件
			Object targetObj = c.newInstance();
			// 設定參數型態
			Class[] param1 = { String.class };
			// 根據參數型態取回方法物件
			Method setNameMethod = c.getMethod("setName", param1);
			// 設定引數值
			Object[] argObjs1 = { "caterpillar" };
			// 給定引數呼叫指定物件之方法
			setNameMethod.invoke(targetObj, argObjs1);

			Class[] param2 = { Integer.TYPE };
			Method setScoreMethod = c.getMethod("setScore", param2);

			Object[] argObjs2 = { new Integer(90) };
			setScoreMethod.invoke(targetObj, argObjs2);
			// 顯示物件描述
			System.out.println(targetObj);

		} catch (ClassNotFoundException e) {
			System.out.println("找不到類別");
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			System.out.println("沒有這個方法");
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
