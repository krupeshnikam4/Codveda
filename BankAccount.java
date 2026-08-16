
import java.io.File;
import java.io.FileWriter;
import java.util.Random;
import java.util.Scanner;

public class BankAccount {

    static Random rn = new Random();
    static Scanner sc = new Scanner(System.in);

    //initialize the variable 
    int depositAmount;
    int withdrawAmount;
    int Balance;

// randomlly take balance of customer
    static int balance = (int) (5000 + rn.nextDouble(100000));

//method for deposit section 
    static void deposit() {

        System.out.println("You choice deposit section ---");
        System.out.println();
        System.out.print("Enter deposit Amount: ");
        int depositAmount = sc.nextInt();
        balance = balance + depositAmount;
        System.out.println("Balance: " + balance + " $ /-");
        return;

    }

//this is method for withdraw the section
    static void Withdraw() {

        System.out.println("---You choice withdraw section---");
        System.out.println();
        System.out.print("Enter a Withdraw Amount: ");
        int withdrawAmount = sc.nextInt();

        if (withdrawAmount <= balance) {

            balance = balance - withdrawAmount;
            System.out.println("Balance: " + balance + " $ /-");
            return;

        } else {

            System.out.println("--Enter Sufficient Balance--");

        }
    }

    //only for display the balance 
    static void DisplayBalance() {

        System.out.println("-- You Choice the Balance Section --");
        System.out.println();
        System.out.println("Balance: " + balance);
        return;
    }

// exit from the method 
    static void exit() {
        return;
    }

// this method is use for the save balance statements
    static void loadBalance() {

        try {

            File file = new File("balance.txt");

            if (file.exists()) {
                Scanner fileScanner = new Scanner(file);
                balance = fileScanner.nextInt();
                fileScanner.close();

            } else {

                balance = (int) (5000 + rn.nextDouble(100000));
                saveBalance();

            }

        } catch (Exception e) {

            System.out.println("Error loading balance");

        }
    }

    static void saveBalance() {

        try {

            FileWriter writer = new FileWriter("balance.txt");
            writer.write(String.valueOf(balance));
            writer.close();

        } catch (Exception e) {

            System.out.println("Error saving balance");

        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        loadBalance();
        int choice;
        do {

// take some operations of bank Account
            System.out.println();
            System.out.println("--BankAccount Details--");
            System.out.println();
            System.out.println("--Account Operations--");
            System.out.println("1.Deposit");
            System.out.println("2.withdraw");
            System.out.println("3.DisplayBalance");
            System.out.println("4.Exit");
            System.out.println();

            System.out.print("Enter a choice: ");
            choice = sc.nextInt();
            System.out.println();

            switch (choice) {
                case 1:
                    deposit();
                    break;
                case 2:
                    Withdraw();
                    break;
                case 3:
                    DisplayBalance();
                    break;
                case 4:
                    exit();
                    break;

                default:
                    System.out.println("--Enter a Valid choice--");
                    System.out.println();
                    throw new AssertionError();
            }
        } while (choice != 4);

    }
}
