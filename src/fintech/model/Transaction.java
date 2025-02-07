package fintech.model;

/**
 * @author 12S23011 Mabel Christoffel A.S
 * @author 12S23027 Amos Manurung
 */
public class Transaction {
    private Integer id;
    private String accountname;
    private String amount;
    private String timestamp;
    private String note;
    private Double balance;
    private String str;

    public Transaction() {
        this.id = 0;
        this.accountname = "";
        this.timestamp = "";
        this.note = "";
        this.balance = 0.0;
    }

    public Transaction(int id, String _accountname, String _amount, String _timestamp, String _note) {
        this.id = id++;
        this.accountname = _accountname;
        this.amount = _amount;
        this.timestamp = _timestamp;
        this.note = _note;

    }

    public Integer getId() {
        return id;
    }

    public String getAccountname() {
        return accountname;
    }

    public String getAmount() {
        return amount;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public String getNote() {
        return note;
    }

    public Double getBalance() {
        return this.balance;
    }

    // @Override
    public String output() {
        return "1" + "|" + accountname + "|" + amount+ "|" + timestamp + "|" + note + "|" + amount;
    }
}

