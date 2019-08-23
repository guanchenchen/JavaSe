package CH17;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//1.��̬�����ʹ��
interface Subject {
	void action();
}

// 2.��������
class RealSubject implements Subject {
	@Override
	public void action() {
		// TODO Auto-generated method stub
		System.out.println("���Ǳ������࣬�ǵ�Ҫִ��Ŷ��ôôô��");
	}
}

class MyInvocationHandler implements InvocationHandler {
	Object obj;// ʵ���˽ӿڵı�������Ķ�������� 1������������Ķ���ʵ������2������һ��������Ķ���

	public Object blind(Object obj) {
		this.obj = obj;
		return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), this);
	}

	@Override
	// ��ͨ�������������Ա���д�ķ����ĵ���ʱ������ת��Ϊ�����µ�invoke�����ĵ���
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		// method�����ķ���ֵʱreturnVal
		Object returnVal = method.invoke(obj, args);
		return returnVal;
	}
}

public class TestDynamicProxy {
	public static void main(String[] args) {
		// 1.�����������
		RealSubject real = new RealSubject();
		// 2.����һ��ʵ����InvocationHandler�ӿڵ���Ķ���
		MyInvocationHandler handler = new MyInvocationHandler();
		// 3.����blind()��������̬�ķ���һ��ͬ��ʵ����real������Ľӿ�subject�Ĵ�����Ķ���
		Object obj = handler.blind(real);
		Subject sub = (Subject) obj;// ��ʱsub���Ǵ�����Ķ���
		sub.action();// ת��InvocationHandler�ӿڵ�ʵ�����invoke()�����ĵ���
		NIKEClothFactory nike = new NIKEClothFactory();
		ClothFactory proxyCloth = (ClothFactory) handler.blind(nike);// proxyClothΪ������Ķ���
		proxyCloth.productCloth();

	}

}
