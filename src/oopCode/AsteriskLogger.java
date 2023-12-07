package oopCode;

// implements the Logger interface
public class AsteriskLogger implements Logger {

	/*
	 * overrides 'Log' method declared in the Logger interface using the string
	 * parameter and prints out the string with three asterisks on each side
	 */
	@Override
	public void Log(String log) {
		System.out.println("***" + log + "***");
	}

	/*
	 * overrides 'Error' method declared in the Logger interface using the string
	 * parameter and prints out the string that starts with 'Error:' and has a box
	 * of asterisks around it
	 */
	@Override
	public void Error(String error) {

		/*
		 * the number of asterisks in the line is determined by the length of the error
		 * message (error.length()) plus 13
		 */
		int numberOfAsterisk = error.length() + 13;

		String stringLine = "*".repeat(numberOfAsterisk);
		System.out.println(stringLine);
		System.out.println("***Error: " + error + "***");
		System.out.println(stringLine);
	}

}
