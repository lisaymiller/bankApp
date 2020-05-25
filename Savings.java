public class Savings extends Account {
    // list props specific to savings account
    int safetyDepBoxID;
    int safetyDepBoxKey;

    // constructor to inintialize settings for savings props
    public Savings(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        acctNum = 1 + acctNum;
        setSafetyDepBox();
    }

    @Override
    public void setRate() {
        rate = getBaseRate() - .25;
    }

    private void setSafetyDepBox() {
        safetyDepBoxID = (int) (Math.random() * Math.pow(10, 3));
        safetyDepBoxKey = (int) (Math.random() * Math.pow(10, 4));
    }

    // list methods specific to savings account
    public void showInfo() {
        System.out.println("ACCOUNT TYPE: Checking");
        super.showInfo();
        System.out.println("DEPOSIT BOX ID: " + safetyDepBoxID + "\nDEPOSIT BOX KEY: " + safetyDepBoxKey);
        System.out.println("***************");
    }
}