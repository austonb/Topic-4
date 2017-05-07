package chapter10;

import java.util.Scanner;

public class Exercise107 {

	 public static void main(String[] args) {

	        Scanner input = new Scanner(System.in);
	        Account[] accounts = new Account[10];

	        for (int i = 0; i < accounts.length; i++) {
	            accounts[i] = new Account(i, 100);
	        }

	        int option = 0;
	        int id = askForID(accounts);
	        while (option != 4) {
	            Account user = getAccount(accounts, id);
	            System.out.print(
	                    "Main menu\n" +
	                            "1: check balance\n" +
	                            "2: withdraw\n" +
	                            "3: deposit\n" +
	                            "4: exit\n" +
	                            "Enter a choice: ");
	            option = input.nextInt();
	            switch (option) {
	                case 1:
	                    System.out.println("The balance is $" + user.getBalance() + ".\n");
	                    break;
	                case 2:
	                    System.out.print("Enter an amount to withdraw: ");
	                    user.withdraw(input.nextDouble());
	                    break;
	                case 3:
	                    System.out.print("Enter an amount to deposit: ");
	                    user.deposit(input.nextDouble());
	                    break;
	                case 4:
	                    System.out.println("Logged out...");
	                    System.out.println("");
	                    id = askForID(accounts);
	                    option = 0;
	                    break;
	                    default:
	                        System.out.println("Invalid input.. Enter a number 1-4");
	            }

	        }

	    }

	    public static int askForID(Account[] accounts) {

	        Scanner input = new Scanner(System.in);

	        int id = 0;
	        boolean isValidID = false;

	        while (!isValidID) {
	            System.out.print("Enter an ID: ");
	            id = input.nextInt();

	            if (!hasID(accounts, id)) {
	                System.out.println("INVALID ID: Try again.");

	            } else {
	                isValidID = true;
	            }
	        }

	        return id;
	    }

	    public static Account getAccount(Account[] accounts, int id) {

	        for (Account account : accounts) {
	            if (id == account.getId()) {
	                return account;
	            }
	        }
	        return null;
	    }
	    public static boolean hasID(Account[] accounts, int id) {

	        for (Account account : accounts) {
	            if (id == account.getId()) {
	                return true;
	            }
	        }

	        return false;
	    }


	}
