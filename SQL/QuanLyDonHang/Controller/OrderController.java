package Controller;

import java.sql.SQLException;
import java.util.List;
import Model.Order;
import DAO.OrderDAO;

public class OrderController {
	private OrderDAO orderDAO;

    public OrderController(OrderDAO orderDAO) {
        this.orderDAO = orderDAO;
    }

    public void createOrder(Order order) throws SQLException {
        orderDAO.addOrder(order);
    }

    public double calculateOrderTotal(int orderId) throws SQLException {
        return orderDAO.getOrderTotal(orderId);
    }

    public List<Order> getOrderHistoryByCustomerId(int customerId) throws SQLException {
        return orderDAO.getOrdersByCustomerId(customerId);
    }
}
