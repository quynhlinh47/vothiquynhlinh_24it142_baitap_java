package view;
import java.awt.GridLayout;
import java.util.List;

import javax.swing.*;

import Controller.OrderController;
import Model.Order;
import Model.OrderItem;

public class OrderForm extends JFrame {
	private JTextField customerIdField, productIdField, quantityField, priceField, orderDateField;
    private JTextArea outputArea;
    private JButton addButton, historyButton;
    private Order currentOrder;
    private OrderController controller;

    public OrderForm(OrderController controller) {
        this.controller = controller;
        this.currentOrder = new Order();
        initUI();
    }

    private void initUI() {
        setTitle("Order Management");
        setSize(500, 500);
        setLayout(new GridLayout(7, 2));

        add(new JLabel("Customer ID:"));
        customerIdField = new JTextField();
        add(customerIdField);

        add(new JLabel("Order Date (yyyy-mm-dd):"));
        orderDateField = new JTextField();
        add(orderDateField);

        add(new JLabel("Product ID:"));
        productIdField = new JTextField();
        add(productIdField);

        add(new JLabel("Quantity:"));
        quantityField = new JTextField();
        add(quantityField);

        add(new JLabel("Price:"));
        priceField = new JTextField();
        add(priceField);

        addButton = new JButton("Add Order Item");
        add(addButton);

        historyButton = new JButton("View Order History");
        add(historyButton);

        outputArea = new JTextArea();
        outputArea.setEditable(false);
        add(new JScrollPane(outputArea));

        addButton.addActionListener(e -> handleAddItem());
        historyButton.addActionListener(e -> handleViewHistory());

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void handleAddItem() {
        try {
            int customerId = Integer.parseInt(customerIdField.getText());
            int productId = Integer.parseInt(productIdField.getText());
            int quantity = Integer.parseInt(quantityField.getText());
            double price = Double.parseDouble(priceField.getText());
            String orderDate = orderDateField.getText();

            if (currentOrder.customerId == 0) {
                currentOrder.customerId = customerId;
                currentOrder.orderDate = orderDate;
            }

            currentOrder.items.add(new OrderItem(0, productId, quantity, price));
            controller.createOrder(currentOrder);
            double total = controller.calculateOrderTotal(currentOrder.id);
            outputArea.setText("Order created with ID: " + currentOrder.id + "\nTotal: " + total);
            currentOrder = new Order();
        } catch (Exception ex) {
            outputArea.setText("Error: " + ex.getMessage());
        }
    }

    private void handleViewHistory() {
        try {
            int customerId = Integer.parseInt(customerIdField.getText());
            List<Order> history = controller.getOrderHistoryByCustomerId(customerId);
            StringBuilder sb = new StringBuilder("Order History:\n");
            for (Order o : history) {
                sb.append("ID: ").append(o.id).append(", Date: ").append(o.orderDate).append("\n");
            }
            outputArea.setText(sb.toString());
        } catch (Exception e) {
            outputArea.setText("Error: " + e.getMessage());
        }
    }
}
