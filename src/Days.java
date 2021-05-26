/**
 * Class to provide method for getting the number of days in a month for a
 * non-leap year.
 *
 * @author Bhavyai Gupta
 * @version 1.0
 * @since May 21, 2021
 */
public final class Days {
    /**
     * Construct declared private to prevent creation of objects
     */
    private Days() {
    }

    /**
     * Return the number of the days in the month passed as the integer parameter
     *
     * @param d an integer from 1 to 12, both inclusive, representing a month of the
     *          calendar year
     * @return number of days in the month
     */
    public static int howManyDays(int d) {
        if ((d > 0) && (d < 8)) {
            if (d == 2)
                return 28;

            else if (d % 2 != 0)
                return 31;

            else
                return 30;
        }

        else if ((d >= 8) && (d <= 12)) {
            if (d % 2 == 0)
                return 31;

            else
                return 30;
        }

        else
            return -1;
    }
}
