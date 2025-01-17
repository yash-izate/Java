package OOPs.Method;

class BankAccount {

    
    
    private double accountBalance;

    public BankAccount(String accountNumber, String accountHolderName) {
        this.accountBalance = 0;
    }

    // Method to deposit money into the account
    public void depositMoney(double money) {
        if (money <= 0) {
            System.out.println("Invalid Deposit!");
        } else {
            accountBalance += money;
            System.out.println("Successfully Deposited: " + money);
        }
    }

    // Method to withdraw money from the account
    public double withdrawMoney(double money) {
        if (money <= 0) {
            System.out.println("Invalid Withdrawal!");
            return 0;
        } else if (accountBalance >= money) {
            accountBalance -= money;
            System.out.println("Successfully Withdrawn: " + money);
            return money;
        } else {
            System.out.println("Insufficient balance! Withdrawn: " + accountBalance);
            double withdrawnAmount = accountBalance;
            accountBalance = 0;
            return withdrawnAmount;
        }
    }

    // Method to show account balance
    public double showBalance() {
        System.out.println("Current Balance: " + accountBalance);
        return accountBalance;
    }
}

public class BankCustomer {

    public static void main(String[] args) {
        BankAccount account = new BankAccount("23071368", "Yash Izate");
        account.depositMoney(1000);
        account.withdrawMoney(250);
        System.out.println(account.showBalance());
    }
}
