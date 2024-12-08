public class BankTest {
    public static void main(String[] args){
        // Create 3 bank accounts
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        BankAccount account3 = new BankAccount();

        // Deposit Test
        // - deposit some money into each bank account's checking or savings account and display the balance each time
        // - each deposit should increase the amount of totalMoney
        account1.despist(300, false);
        account2.despist(400,true);
        account3.despist(500, true);
        account1.despist(400, true);
        account2.despist(700,false);
        account3.despist(800, false);

        // Withdrawal Test
        // - withdraw some money from each bank account's checking or savings account and display the remaining balance
        // - each withdrawal should decrease the amount of totalMoney
        account2.withdraw(1000, true);
        account1.withdraw(50,false);
        account3.withdraw(200, true);

        // Static Test (print the number of bank accounts and the totalMoney)
        System.out.println("\n*===== Total Number of accounts and total money =====*");
        System.out.println("Total Number of Accounts: " + BankAccount.getAccounts());
        System.out.println("Total Money: $" + BankAccount.getTotalMoney());
    }
}