public class Checking extends Account {
    // list prop's specific to checking account
    int debitCardNum, debitCardPin;

    // constructor to initializing checking account props
    public Checking(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        acctNum = 2 + acctNum;
        setDebitCard();
    }

    @Override
    public void setRate() {
        rate = getBaseRate() * .15;
    }

    // list any specific methods to checking account
    public void setDebitCard() {
        debitCardNum = (int) (Math.random() * Math.pow(10, 12));
        debitCardPin = (int) (Math.random() * Math.pow(10, 4));
    }

    // overriding, polymorphism
    public void showInfo() {
        System.out.println("ACCOUNT TYPE: Checking");
        super.showInfo();
        System.out.println("DEBIT CARD NUMBER: " + debitCardNum + "\nDEBIT CARD PIN: " + debitCardPin);
        System.out.println("***************");
    }

}