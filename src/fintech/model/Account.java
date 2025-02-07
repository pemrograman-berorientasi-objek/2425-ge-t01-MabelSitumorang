package fintech.model;

/**
 * @author 12S23011 Mabel Christoffel A.S
 * @author 12S23027 Amos Manurung
 */
public class Account {
    private Integer id;
    private String accountname;
    private String owner;
    private double balance;

    public Account() {
        this.accountname = "";
        this.owner = "";
        this.balance = 0;
    }

    public Account(String _owner, String _accountname, double _balance) {
        this.accountname = _accountname;
        this.owner = _owner;
        this.balance = _balance;
    }
    
    public String getOwner() {
        return owner;
    }

    public String getAccountname() {
        return accountname;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
         return accountname + "|" + owner + "|" + balance;
    }

}