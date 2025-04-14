package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Statement;

import Model.Order;
import Model.OrderItem;

public class OrderDAO {
	private Connection conn;
	
	public OrderDAO(Connection conn) {
		this.conn = conn;
	}
	
	public void addOrder(Order order) throws SQLException{
		String sql = "INSERT INTO orders(customer_id, order_date) VALUES(?, ?)";
		    PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
		    stmt.setInt(1, order.customerId);
	        stmt.setString(2, order.orderDate);
	        stmt.executeUpdate();
	        ResultSet rs = stmt.getGeneratedKeys();
	        if (rs.next()) {
	            order.id = rs.getInt(1); //Lấy giá trị ID mới được sinh ra
	        }
	        for (OrderItem item : order.items) {
	            addOrderItem(order.id, item);
	        }
	    }

	    private void addOrderItem(int orderId, OrderItem item) throws SQLException {
	        String sql = "INSERT INTO order_items (order_id, product_id, quantity, price) VALUES (?, ?, ?, ?)";
	        PreparedStatement stmt = conn.prepareStatement(sql);
	        stmt.setInt(1, orderId);
	        stmt.setInt(2, item.productId);
	        stmt.setInt(3, item.quantity);
	        stmt.setDouble(4, item.price);
	        stmt.executeUpdate();
	    }

	    public double getOrderTotal(int orderId) throws SQLException {
	        String sql = "SELECT SUM(quantity * price) AS total FROM order_items WHERE order_id = ?";
	        PreparedStatement stmt = conn.prepareStatement(sql);
	        stmt.setInt(1, orderId);
	        ResultSet rs = stmt.executeQuery();
	        if (rs.next()) {
	            return rs.getDouble("total");
	        }
	        return 0;
	    }
	    public List<Order> getOrdersByCustomerId(int customerId) throws SQLException {
	        List<Order> orders = new ArrayList<>();
	        String sql = "SELECT * FROM orders WHERE customer_id = ?";
	        PreparedStatement stmt = conn.prepareStatement(sql);
	        stmt.setInt(1, customerId);
	        ResultSet rs = stmt.executeQuery();
	        while (rs.next()) {
	            Order order = new Order();
	            order.id = rs.getInt("id");
	            order.customerId = rs.getInt("customer_id");
	            order.orderDate = rs.getString("order_date");
	            orders.add(order);
	        }
	        return orders;
	    }

	}
