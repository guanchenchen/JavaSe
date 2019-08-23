package CH13;

import java.util.LinkedList;

public class StringQueue {
	private LinkedList<String> linkedList;

	public StringQueue() {
		// TODO Auto-generated constructor stub
		linkedList = new LinkedList<String>();
	}

	public void put(String name) {
		linkedList.addFirst(name);
	}

	public String remove() {
		return linkedList.removeLast();
	}

	public boolean isEmpty() {
		return linkedList.isEmpty();
	}

}
