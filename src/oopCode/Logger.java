package oopCode;

// this declares the interface named Logger.
public interface Logger {

	/*
	 * the interface declares two abstract methods: Log and Error that will be
	 * passed in other methods
	 */
	public void Log(String log);

	public void Error(String error);
}
