package CH17;

//1.�ӿ�
interface ClothFactory {
	void productCloth();
}

// 2.��������
class NIKEClothFactory implements ClothFactory {

	@Override
	public void productCloth() {
		// TODO Auto-generated method stub
		System.out.println("NIKE��������һ���·�");

	}

}

// 3.������
class ProxyFactory implements ClothFactory {
	ClothFactory cf;

	// 4.����������Ķ���ʱ��ʵ�ʴ���һ����������Ķ���
	public ProxyFactory(ClothFactory cf) {
		// TODO Auto-generated constructor stub
		this.cf = cf;
	}

	@Override
	public void productCloth() {
		// TODO Auto-generated method stub
		System.out.println("�����࿪ʼִ��,�մ����1000��Ǯ");
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
