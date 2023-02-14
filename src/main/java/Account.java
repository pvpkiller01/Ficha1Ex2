/**
 * Class to save account parameters
 */
public class Account {
    private int id;
    private double balance;

    /**
     * Constructor of the class account
     * @param id id of the account
     * @param balance current balance of the account
     */
    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    /**
     * @return getter for the id
     */
    public int getId() {

        return id;
    }

    /**
     * @return getter for the balance
     */
    public double getBalance() {
        return balance;
    }


}
