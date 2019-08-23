package CH17;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//1.动态代理的使用
interface Subject {
	void action();
}

// 2.被代理类
class RealSubject implements Subject {
	@Override
	public void action() {
		// TODO Auto-generated method stub
		System.out.println("我是被代理类，记得要执行哦，么么么哒");
	}
}

class MyInvocationHandler implements InvocationHandler {
	Object obj;// 实现了接口的被代理类的对象的声明 1，给被代理类的对象实例化，2，返回一个代理类的对象

	public Object blind(Object obj) {
		this.obj = obj;
		return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), this);
	}

	@Override
	// 当通过代理类对象发起对被重写的方法的调用时，都会转换为对如下的invoke方法的调用
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		// method方法的返回值时returnVal
		Object returnVal = method.invoke(obj, args);
		return returnVal;
	}
}

public class TestDynamicProxy {
	public static void main(String[] args) {
		// 1.被代理类对象
		RealSubject real = new RealSubject();
		// 2.创建一个实现了InvocationHandler接口的类的对象
		MyInvocationHandler handler = new MyInvocationHandler();
		// 3.调用blind()方法，动态的返回一个同样实现了real所在类的接口subject的代理类的对象
		Object obj = handler.blind(real);
		Subject sub = (Subject) obj;// 此时sub就是代理类的对象
		sub.action();// 转到InvocationHandler接口的实现类的invoke()方法的调用
		NIKEClothFactory nike = new NIKEClothFactory();
		ClothFactory proxyCloth = (ClothFactory) handler.blind(nike);// proxyCloth为代理类的对象
		proxyCloth.productCloth();

	}

}
