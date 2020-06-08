import java.util.LinkedList;
import java.util.List;

public class BankApp {
    public static void main(String[] args) {

        List<Account> accounts = new LinkedList<Account>();

        Checking chkAcct1 = new Checking("Lisa Miller", "123456789", 1500);

        Savings svAcct1 = new Savings("River B", "123456789", 2500);

        chkAcct1.showInfo();
        svAcct1.showInfo();

        // read a csv file and create new accounts based on that data
        String file = "original.csv";
        List<String[]> newAccountHolders = CSV.read(file);
        for (String[] accountHolder : newAccountHolders) {
            String name = accountHolder[0];
            String sSN = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);
            if (accountType.equals("Savings")) {
                accounts.add(new Savings(name, sSN, initDeposit));
            } else if (accountType.equals("Checking")) {
                accounts.add(new Checking(name, sSN, initDeposit));
            } else {
                System.out.println("ERROR READING ACCOUNT TYPE");
            }
        }

        for (Account acc : accounts) {
            System.out.println("***************");
            acc.showInfo();
        }
    }
}