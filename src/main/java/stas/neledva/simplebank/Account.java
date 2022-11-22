package stas.neledva.simplebank;

/**
 * @author Stas Neledva
 */
public class Account {

    private static long accountNumbers = 0;
    private long number;
    private long balance;

    /**
     * to store information about bank account numbers.
     * Increment accountNumbers, while you created a new object
     */
    protected Account() {
        accountNumbers++;
        number = accountNumbers;
        balance = 0;
    }

    /**
     * The method should return false, if cash is less than 0, otherwise increase balance and return true
     *
     * @param cash count of money
     * @return boolean if increaseBalance was successful
     */
    protected boolean increaseBalance(long cash) {
        if (cash > 0) {
            balance += cash;
            return true;
        }
        return false;
    }

    /**
     * The method should return false if cash less than 0, otherwise if cash more than 0 and balance more than cash.
     * Balance reduce cash and return true
     *
     * @param cash count of money
     * @return boolean if reduceBalance was successful
     */
    protected boolean reduceBalance(long cash) {
        if (cash > 0 && balance > cash) {
            balance -= cash;
            return true;
        }
        return false;
    }

    /**
     * The method will call for show accountNumber
     *
     * @return accountNumber
     */
    protected long getAccountNumber() {
        return number;
    }

    /**
     * The method will call for show balance for user
     *
     * @return balance
     */
    protected long getAccountBalance() {
        return balance;
    }
}
