public abstract class Account implements IBaseRate {
    // list common prop's for savings and checking
    String name, sSN, acctNum;
    double initDeposit;
    double balance;
    double rate;

    static int index = 10000;

    // constructor to set base props and initialize the account
    // below is the super class?
    public Account(String name, String sSN, double initDeposit) {
        this.name = name;
        this.sSN = sSN;
        balance = initDeposit;

        // acct number
        index++;
        this.acctNum = setAcctNum();

        setRate();
    }

    public abstract void setRate();

    private String setAcctNum() {
        String lastTwoSsn = sSN.substring(sSN.length() - 2, sSN.length());
        int uniqueID = index;
        int randNum = (int) (Math.random() * Math.pow(10, 3));
        return lastTwoSsn + uniqueID + randNum;
    }

    public void compound() {
        double accruedInterest = balance * (rate / 100);
        System.out.println("Accrued interest: $" + accruedInterest);
    }

    // list common methods
    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Depositing $" + amount);
    }

    public void withdrawl(double amount) {
        balance = balance - amount;
        System.out.println("Withdrawing $" + amount);
    }

    public void transfer(String toWhere, double amount) {
        balance = balance - amount;
        System.out.println("Transferring $" + amount + " to " + toWhere);
    }

    public void printBalance() {
        System.out.println("Your balance is now $" + amount);
    }

    public void showInfo() {
        System.out.println("NAME: " + name + "\nACCOUNT NUMBER: " + acctNum + "\nACCOUNT BALANCE: " + balance
                + "\nRATE: " + rate + " %");
    }
}