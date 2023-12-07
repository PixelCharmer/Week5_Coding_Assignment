package oopCode;

public class App {

	// This is the entry point of the program, where the execution begins
	public static void main(String[] args) {

		/*
		 * instances of classes implementing the Logger interface these instances are
		 * declared using the Logger interface
		 */
		Logger asteriskLogger = new AsteriskLogger();
		Logger spacedLogger = new SpacedLogger();

		/*
		 * calls the methods on the asteriskLogger instance the output will display log
		 * and error messages surrounded by asterisks
		 */
		asteriskLogger.Log("Shenanigans");
		asteriskLogger.Error("Bamboozle");

		/*
		 * Prints an empty line to the console, providing visual separation in the
		 * output
		 */
		System.out.println();

		/*
		 * calls the methods on the spacedLogger instance the output will display log
		 * and error messages with spaces between each character
		 */
		spacedLogger.Log("Shenanigans");
		spacedLogger.Error("Bamboozle");
	}

}