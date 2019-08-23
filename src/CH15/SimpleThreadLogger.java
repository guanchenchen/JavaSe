package CH15;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SimpleThreadLogger {
	private static final java.lang.ThreadLocal<Logger> threadLocal = new ThreadLocal<Logger>();

	public static void log(String msg) {
		try {
			getThreadLogger().log(Level.INFO, msg);
		} catch (SecurityException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static Logger getThreadLogger() throws SecurityException, IOException {
		// TODO Auto-generated method stub
		Logger logger = threadLocal.get();
		if (logger == null) {
			logger = logger.getLogger(Thread.currentThread().getName());
			logger.addHandler(new FileHandler(Thread.currentThread().getName() + ".log"));
		}
		threadLocal.set(logger);
		return logger;
	}
}
