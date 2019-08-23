package CH15;

public class ThreadExceptionHandler implements Thread.UncaughtExceptionHandler {

	@Override
	public void uncaughtException(Thread t, Throwable e) {
		// TODO Auto-generated method stub

		System.out.println(t.getName() + ";" + e.getMessage());

	}

}
