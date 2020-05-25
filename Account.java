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

    // list common methods
    public void showInfo() {
        System.out.println("NAME: " + name + "\nACCOUNT NUMBER: " + acctNum + "\nACCOUNT BALANCE: " + balance
                + "\nRATE: " + rate + " %");
    }
}