package co.ordnave.bank;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Account account = new Account(ag: "0001", cc: "1234", name:"user");

        while(true) {
            System.out.println("D= Deposit, W= Withdraw, E=Exit");
            String op = scanner.nextLine();

            if (op.equals("D")) {
                System.out.println("How many you'll deposit ?");
                double value = scanner.nextDouble();
                account.deposit(value);
            } else if (op.equals("W")) {
                System.out.println("How many you want to Withdraw ?");
                double value = scanner.nextDouble();
                if (!account.withdraw(value)) {
                    System.out.println("Insuficient balance! Your balance is $" + value);
                }
            } else if (op.equals("E")) {
                break;
            } else {
                System.out.println("Command invalid");
            }
            scanner = new Scanner(System.in);
        }
    }
}
