package CH17;

//1.接口
interface ClothFactory {
	void productCloth();
}

// 2.被代理类
class NIKEClothFactory implements ClothFactory {

	@Override
	public void productCloth() {
		// TODO Auto-generated method stub
		System.out.println("NIKE工厂生产一批衣服");

	}

}

// 3.代理类
class ProxyFactory implements ClothFactory {
	ClothFactory cf;

	// 4.创建代理类的对象时，实际传入一个被代理类的对象
	public ProxyFactory(ClothFactory cf) {
		// TODO Auto-generated constructor stub
		this.cf = cf;
	}

	@Override
	public void productCloth() {
		// TODO Auto-generated method stub
		System.out.println("代理类开始执行,收代理费1000块钱");
		cf.productCloth();

	}

}

public class TestStaticProxy {
	public static void main(String[] args) {
		NIKEClothFactory nike = new NIKEClothFactory();
		ProxyFactory proxy = new ProxyFactory(nike);
		proxy.productCloth();
	}

}
