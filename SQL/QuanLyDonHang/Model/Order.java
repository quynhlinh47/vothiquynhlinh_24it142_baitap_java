package Model;

import java.util.*;

public class Order {
	 public int id;
	 public int customerId;
	 public String orderDate;
	 public List<OrderItem> items = new ArrayList<>();
	
	public Order(int id, int customerId, String orderDate) {
		this.id = id;
		this.customerId = customerId;
		this.orderDate = orderDate;
	}
	public Order() {
		// TODO Auto-generated constructor stub
	}
	public void addOrderItem(OrderItem item) {
		this.items.add(item);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public List<OrderItem> getOrderTtem() {
		return items;
	}
	public void setOrderTtem(List<OrderItem> orderTtem) {
		this.items = orderTtem;
	}
	
}
