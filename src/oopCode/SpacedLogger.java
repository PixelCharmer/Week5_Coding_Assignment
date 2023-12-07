package oopCode;

//implements the Logger interface
public class SpacedLogger implements Logger {

	/*
	 * overrides the Log method declared in the Logger interface replaces every
	 * character in the string with a space the trim() method is used to remove the
	 * leading and trailing white spaces
	 */
	@Override
	public void Log(String log) {
		String newLog = log.replace("", " ").trim();
		System.out.println(newLog);
	}

	/*
	 * overrides the Error method declared in the Logger interface same process of
	 * adding spaces and removing whitespace indicated above but its prefixed with
	 * "ERROR: "
	 */
	@Override
	public void Error(String error) {
		String newError = error.replace("", " ").trim();
		System.out.println("ERROR: " + newError);
	}

}
