import java.time.Month;

/**
 * Class to test the working of Days class. Runs through all the months 1 - 12
 * and prints the number of days in each month.
 *
 * @author Bhavyai Gupta
 * @version 1.0
 * @since May 21, 2021
 */
public class DaysTester {
    /**
     * Function to test the Days class
     *
     * @param args not used
     */
    public static void main(String[] args) {
        for (int i = 0; i < 12; i++) {
            System.out.printf("Number of days in the month of %s is %d.%n", Month.of(i + 1).toString(),
                    Days.howManyDays(i + 1));
        }
    }
}
