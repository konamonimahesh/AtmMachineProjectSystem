package atmProject;

import java.util.Scanner;

class Atm{
	float Balance;
	int Pin=5678;
	
	public void checkPin() {
		System.out.println("Enter the pin: ");
		Scanner s= new Scanner(System.in);
		int enteredPin = s.nextInt();
		if(enteredPin == Pin) {
			menu();
		}else {
			System.out.println("Enter the valid pin");
			menu();
		}
		
	}
	public void menu() {
		System.out.println("Enter the Choice");
		System.out.println("1.Check A/C balance");
		System.out.println("2.Withdraw Money");
		System.out.println("3.Deposit Money");
		System.out.println("4.Exit");
		
		
		Scanner s= new Scanner(System.in);
		int opt = s.nextInt();
		if(opt == 1) {
			checkBalance();
		}else if(opt==2){
			withdrawMoney();
			
		}else if(opt==3) {
			depositMoney();
		}
		else if(opt==4) {
		return;
		}
		else {
			System.out.println("Enter the valid Pin");
		}
	}
	
	public void checkBalance() {
		System.out.println(Balance);
		menu();
		
	}
	public void withdrawMoney() {
		System.out.println("Enter Amount to WithDraw: ");
		Scanner s= new Scanner(System.in);
		float amount =s.nextInt();
		if(amount>Balance) {
			System.out.println("Insufficient balance: ");
			
		}
		else {
			Balance = Balance- amount;
			System.out.println("Money withdrawal Succesful ");
			
			
		}
		menu();
	}
	
	public void depositMoney() {
		System.out.println("Enter the Amount");
		Scanner s = new Scanner(System.in);
		float amount = s.nextFloat();
		Balance = Balance+amount;
		System.out.println("Money Deposited Successful");
		
		menu();
	}
	
}


public class AtmMachine {
	public static void main(String[] args) {
		 Atm atm = new Atm();
		 atm.checkPin();
	}
 

}
