public class BankAccount {
    // MEMBER VARIABLES
    private double checkingBalance;
    private double savingsBalance;

    private static int accounts;
    private static double totalMoney; // refers to the sum of all bank account checking and savings balances

    // CONSTRUCTOR
    // Be sure to increment the number of accounts
    public BankAccount() {
        accounts += 1;
    }

    // GETTERS
    // for checking, savings, accounts, and totalMoney

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public static int getAccounts() {
        return accounts;
    }

    public static double getTotalMoney() {
        return totalMoney;
    }

    // METHODS
    // deposit
    // - users should be able to deposit money into their checking or savings account
    public void despist(double depositAmount, boolean isToCheckingAccount) {
        if (isToCheckingAccount) {
            this.checkingBalance += depositAmount;
        }
        else {
            this.savingsBalance += depositAmount;
        }
        totalMoney += depositAmount;
        System.out.println("Checking Balance: $" + this.getCheckingBalance() );
        System.out.println("Saving Balance: $" + this.getSavingsBalance() );
    }

    // withdraw
    // - users should be able to withdraw money from their checking or savings account
    // - do not allow them to withdraw money if there are insufficient funds
    // - all deposits and withdrawals should affect totalMoney
    public void withdraw(double withdrawAmount, boolean isFromCheckingAccount) {
        if (isFromCheckingAccount) {
            if (this.checkingBalance >= withdrawAmount) {
                this.checkingBalance -= withdrawAmount;
                totalMoney -= withdrawAmount;
            }
            else {
                System.out.println("Insufficient fund ...");
            }
        }
        else {
            if (this.savingsBalance >= withdrawAmount) {
                this.savingsBalance -= withdrawAmount;
                totalMoney -= withdrawAmount;
            }
            else {
                System.out.println("Insufficient fund ...");
            }
        }
        System.out.println("Checking Balance: $" + this.getCheckingBalance() );
        System.out.println("Saving Balance: $" + this.getSavingsBalance() );
    }

    // getBalance
    // -- display total balance for checking and savings of a particular bank account
    public void dispaly() {
        double totalBalance = this.checkingBalance + this.savingsBalance;
        System.out.println("Total Balance for checking and savings: $" + totalBalance);
    }
}
