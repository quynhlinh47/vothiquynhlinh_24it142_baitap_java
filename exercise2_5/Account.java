package exercise2_5;

public class Account {
	private int id;
	private Customer customer;
	private double balance = 0.0;
	
	public Account(int id, Customer customer, double balance) {
		this.id = id;
		this.customer = customer;
		this.balance = balance;
	}
	public Account(int id, Customer customer) {
		this.id = id;
		this.customer = customer;
	}
	public int getId() {
		return id;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String toString() {
		return customer.toString()+" balance=$"+String.format("%.2f", balance);
	}
	public String getCustomerName() {
		return customer.getName();
	}
	
	public void deposit(double amount) {
		if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + String.format("%.2f", amount) + " into the account.");
        } else {
            System.out.println("Deposit amount must be positive.");
        }
	}
	
	public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrew $" + String.format("%.2f", amount) + " from the account.");
            } else {
                System.out.println("Withdrawal amount exceeds the current balance!");
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }
}
