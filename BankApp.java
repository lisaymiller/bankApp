public class BankApp {
    public static void main(String[] args) {

        Checking chkAcct1 = new Checking("Lisa Miller", "123456789", 1500);

        Savings svAcct1 = new Savings("River B", "123456789", 2500);

        chkAcct1.showInfo();
        svAcct1.showInfo();

        // read a csv file and create new accounts based on that data
    }
}