package exercise7_1;

import java.util.Date;

public class Visit {
	    private Customer customer;
	    private Date date;
	    private double serviceExpense;
	    private double productExpense;

	    public Visit(Customer customer, Date date) {
	        this.customer = customer;
	        this.date = date;
	    }

	    public String getName() {
	        return customer.getName();
	    }

	    public double getServiceExpense() {
	        return serviceExpense;
	    }

	    public void setServiceExpense(double ex) {
	        this.serviceExpense = ex;
	    }

	    public double getProductExpense() {
	        return productExpense;
	    }

	    public void setProductExpense(double ex) {
	        this.productExpense = ex;
	    }

	    public double getTotalExpense() {
	        String memberType = customer.getMemberType();
	        double serviceDiscount = DiscountRate.getServiceDiscountRate(memberType);
	        double productDiscount = DiscountRate.getProductDiscountRate(memberType);

	        double discountedService = serviceExpense * (1 - serviceDiscount);
	        double discountedProduct = productExpense * (1 - productDiscount);

	        return discountedService + discountedProduct;
	    }

	    @Override
	    public String toString() {
	        return "Visit[customer=" + customer + ", date=" + date + ", serviceExpense=" + serviceExpense + ", productExpense=" + productExpense + "]";
	    }
}



