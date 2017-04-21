import java.lang.IllegalStateException;

/**
 * This is the Bank Account class that our Bank client will use.
 * 
 * Methods are:
 *  - Constructor(s)
 *  - deposit
 *  - withdraw
 *  - merge
 *  - getCurrentAmount
 * 
 * @author Nathan Clement 
 * @version 14 April 2017
 */
public class BankAccount
{
    private static int COMPOUND_INTEREST_COUNTER = 0;
    private static int NUM_MERGERS = 0;
    
    // This variable is *shared* arcross all instances of this class.
    private static int GLOBAL_ID = 0;
    
    // This will be the unique ID
    private int id;
    // The client's name
    private String name;
    // The Type of bank account
    private AccountType accountType;
    // Balance
    private double balance;
    // Interest rate
    private double interestRate;

    public BankAccount(String n, double startingBalance, 
                    double rate, AccountType type) {
        // Set your id to be the next value
        id = GLOBAL_ID;
        // Update the ID counter
        GLOBAL_ID++;
        
        n = name;
        balance = startingBalance;
        interestRate = rate;
        accountType = type;
    }

    public BankAccount(String n, double startingBalance, 
                double rate) {
        this(n, startingBalance, rate, AccountType.TRADITIONAL);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
    
    public void printId() {
        System.out.printf("My id is %d (global is %d)\n", id, GLOBAL_ID);
    }

    /**
     * Withdraw a given amount from the account:
     * withdrawals: you can only withdraw money that you have. 
     * This method will return true or false, depending on if the 
     * withdrawal is successful. In addition, there are the following 
     * fees:
     * An EXECUTIVE account is charged 2% on each withdrawal
     * A TRADITIONAL account is charged $2 on every withdrawal
     * A STUDENT account is not charged any transaction fees
     */
    public boolean withdraw(double amount) {
        if (accountType == AccountType.EXECUTIVE) {
            // Add the fee of 2%
            amount += amount * 0.02;
        } else if (accountType == AccountType.TRADITIONAL) {
            // Add the fee of $2
            amount += 2;
        }

        // Make sure you have enough $$
        if (amount > balance) {
            throw new IllegalStateException("Insufficient funds: tried to withdraw " + amount + " but only had " + balance);
        }

        // Subtract the balance and return true.
        balance -= amount;
        return true;
    }
    
    public double getCurrentAmount() {
        return balance;
    }
    
    /**
     * Function that returns the future amount in an account with the
     * initial (principle) amount P, and the following arguments:
     *   r = the annual interest rate (decimal)
     *   n = the number of times that interest is compounded per year
     *   t = the number of years the money is invested or borrowed for
     */
    public static double compoundInterest(double P, double r, int n, int t) {
        COMPOUND_INTEREST_COUNTER++;
        return P * Math.pow(1 + r / n, n * t);
    }
    
    /**
     * Two accounts (a “primary” and a “secondary”) can be “merged” 
     * in the following fashion:
     *  Accounts can only be merged if they are both of the same type. 
     *          Otherwise this function will do nothing.
     *  The name of the primary account (and unique ID) does not 
     *      change (must keep the owner)
     *  The interest rate of both accounts will be the lowest of 
     *      the primary and secondary accounts after the merger
     *  The balance of the “secondary” account must be zero after 
     *      the end of the merge
     */
    public boolean merge(BankAccount other) {
        if (this.accountType != other.accountType) {
            return false;
        }
        this.interestRate = Math.min(this.interestRate, other.interestRate);
        other.interestRate = Math.min(this.interestRate, other.interestRate);
        
        // Report another successful merger!!
        NUM_MERGERS++;
        
        return true;
    }
}
