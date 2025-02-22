package exercise7_1;

import java.util.Date;

public class Main {
	public static void main(String[] args) {
		Customer customer = new Customer("Alice");
        customer.setMember(true);
        customer.setMemberType("Gold");

        Visit visit = new Visit(customer, new Date());
        visit.setServiceExpense(100.0);
        visit.setProductExpense(50.0);

        System.out.println(customer);
        System.out.println(visit);
        System.out.println("Total Expense after discount: " + visit.getTotalExpense());
	}
}

