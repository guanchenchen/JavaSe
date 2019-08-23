package CH13;

import java.util.LinkedList;

public class StringStack {
	private LinkedList<String> linkedList;

	public StringStack() {
		linkedList = new LinkedList<String>();
	}

	public void push(String name) {
		// ��Ԫ�ؼ��봮��ǰ��
		linkedList.addFirst(name);
	}

	public String top() {
		// ȡ�ô��е�һ��Ԫ��
		return linkedList.getFirst();
	}

	public String pop() {
		// �Ƴ���һ��Ԫ��
		return linkedList.removeFirst();
	}

	public boolean isEmpty() {
		// �����Ƿ���
		return linkedList.isEmpty();
	}
}
