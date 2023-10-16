package co.ordnave.bank;

public class App {

    public static void main(String[] args) {

        Account account = new Account(ag: "0001", cc: "1234", name:"user")

        boolean succeed = account.withdraw(value: 200.0);

        if (!succeed) {
            System.out.println("insufficient funds ");
        } else {
            System.out.println("Withdraw complete!");
        }

        account.deposit(value: 100);
        account.deposit(value: 50);
        account.deposit(value: 100);

        if (!account.withdraw(value: 200)) {
            System.out.println("insufficient funds");
        }

        if (!account.withdraw(value: 200)) {
            System.out.println("insufficient funds");
        }



    }
}
