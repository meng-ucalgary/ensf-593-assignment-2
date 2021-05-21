/**
 * Class representing a certificate of deposit.
 *
 * @author Bhavyai Gupta
 * @version 1.0
 * @since May 21, 2021
 */
public class BankCD {
	/**
	 * The value of the initial principal amount at the start of the CD
	 */
	private double principal;

	/**
	 * The annual rate of interest to be used for compounding
	 */
	private double rate;

	/**
	 * The number of years for which the final amount of CD is to be calculated
	 */
	private double years;

	/**
	 * Constructs an object of type BankCD and initializes the principal, rate of
	 * interest, and years to maturity with supplied parameter values
	 *
	 * @param p the initial principal amount at the start of the CD
	 * @param r the annual rate of interest to be used for compounding
	 * @param y the number of years for which the CD is to be held
	 */
	public BankCD(double p, double r, double y) {
		this.principal = p;
		this.rate = r;
		this.years = y;
	}

	/**
	 * Calculates the maturity value of a CD based on yearly compounding
	 * @return the maturity value after yearly compounding
	 */
	public double calcYearly() {
		double amount = this.principal * Math.pow(1 + this.rate, this.years);

		return amount;
	}

	/**
	 * Calculates the maturity value of a CD based on daily compounding
	 * @return the maturity value after daily compounding
	 */
	public double calcDaily() {
		double amount = this.principal * Math.pow((1 + this.rate / 365), (this.years * 365));

		return amount;
	}
}
