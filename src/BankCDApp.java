import java.text.NumberFormat;

/**
 * Class representing command-line interface to compute yearly and daily
 * compounded certificate of deposit.
 *
 * @author Bhavyai Gupta
 * @version 1.0
 * @since May 21, 2021
 */
public class BankCDApp {
	/**
	 * The BankCD object to instantiate BankCD class and methods
	 */
	private BankCD bank;

	/**
	 * An object of KeyboardReader to facilitate reading user input
	 */
	private KeyboardReader reader;

	/**
	 * Constructs an object of class BankCDApp and assigns default value to the
	 * reader instance variable
	 */
	public BankCDApp() {
		reader = new KeyboardReader();
	}

	/**
	 * Facilitates input from the user to create and initialize the BankCD object
	 * and prints the computed maturity amount based on the said user inputs
	 */
	public void run() {
		reader.display("");
		reader.display("Compare daily and annual compounding for a Bank CD.");
		reader.display("---------------------------------------------------");
		reader.display("");

		reader.prompt("Enter the principal in decimals (eg enter 1000.55): ");
		double principal = reader.getKeyboardDouble();

		reader.prompt("Enter the annual rate of interest in decimals (eg enter 5.5 for 5.5%): ");
		double rate = reader.getKeyboardDouble();
		rate = rate / 100.0;

		reader.prompt("Enter the number of years to maturity in decimals (eg enter 5.25 for 5 years 3 months): ");
		double years = reader.getKeyboardDouble();

		this.bank = new BankCD(principal, rate, years);

		NumberFormat currency = NumberFormat.getCurrencyInstance();
		NumberFormat percent = NumberFormat.getPercentInstance();
		percent.setMaximumFractionDigits(2);

		reader.display("");
		reader.display("");

		reader.display("For,");
		reader.display("-> Initial pricipal = " + currency.format(principal) + ",");
		reader.display("-> Rate of Interest = " + percent.format(rate) + ", and");
		reader.display("-> Years to Maturity = " + years);
		reader.display("");

		reader.display("The maturity value compounded yearly is " + currency.format(this.bank.calcYearly()) + ".");
		reader.display("The maturity value compounded daily is  " + currency.format(this.bank.calcDaily()) + ".");
	}

	/**
	 * Function to call the instance method run()
	 *
	 * @param args not used
	 */
	public static void main(String[] args) {
		BankCDApp app = new BankCDApp();
		app.run();
	}
}
