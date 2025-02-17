package exercise2_5;

public class TestMain {
public static void main(String[] args) {
	Customer c1 = new Customer(123, "Nguyen Van A", 'm');
	System.out.println(c1);
	Customer c2 = new Customer (456, "Tran Van X", 'f');
	System.out.println(c2);
	
	Account a1 = new Account(123, c1, 5.8);
	System.out.println(a1);
	Account a2 = new Account(456, c2);
	System.out.println(a2);
	
	a2.setBalance(7.89);
	System.out.println(a2);
	
	System.out.println("Customer's name a1: "+a1.getCustomerName());
	a1.deposit(98);
	a2.deposit(85.6);
	a1.withdraw(70);
	a2.withdraw(50.2);
}
}
