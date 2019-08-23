package CH13;

import java.util.Comparator;

public class CustomComparator<T> implements Comparator<T> {

	@Override
	public int compare(T o1, T o2) {
		// TODO Auto-generated method stub

		if (((T) o1).equals(o2)) {
			return 0;
		}
		return ((Comparable<T>) o1).compareTo((T) o2) * -1;
	}

}
