import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Allowing reading from standard in through a BufferedReader.
 *
 * As explained in Section 4.3 of Java, Java, Java 3e
 *
 * @author Bhavyai Gupta
 * @version 1.0
 * @since May 21, 2021
 */
public class KeyboardReader {
	/**
	 * BufferedReader to provide input functionality from command line.
	 */
	private BufferedReader reader;

	/**
	 * Constructs an object of class KeyboardReader and initializes the
	 * BufferedReader with standard input stream wrapped in InputStreamReader.
	 */
	public KeyboardReader() {
		reader = new BufferedReader(new InputStreamReader(System.in));
	}

	/**
	 * Reads the input from the user as a string.
	 *
	 * @return a String read from the input
	 */
	public String getKeyboardInput() {
		return readKeyboard();
	}

	/**
	 * Calls the function readKeyboard to read input from the user and parses an
	 * int from input.
	 *
	 * @return the integer value represented by the input string
	 */
	public int getKeyboardInteger() {
		return Integer.parseInt(readKeyboard());
	}

	/**
	 * Calls the function readKeyboard to read input from the user and parses a
	 * double from input.
	 *
	 * @return the double value represented by the input string
	 */
	public double getKeyboardDouble() {
		return Double.parseDouble(readKeyboard());
	}

	/**
	 * Prints the String parameter as is.
	 *
	 * @param s the String to be printed on the standard output stream
	 */
	public void prompt(String s) {
		System.out.print(s);
	}

	/**
	 * Prints the String parameter, followed by the new line.
	 *
	 * @param s the String to be printed on standard output stream
	 */
	public void display(String s) {
		System.out.println(s);
	}

	/**
	 * Reads the input from the user as a string.
	 *
	 * @return the String read from the input
	 */
	private String readKeyboard() {
		String line = "";

		try {
			line = reader.readLine();
		}

		catch (IOException e) {
			e.printStackTrace();
		}
		return line;
	}
}
