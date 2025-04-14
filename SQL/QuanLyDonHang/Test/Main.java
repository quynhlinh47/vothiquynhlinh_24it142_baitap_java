package Test;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.SwingUtilities;

import Controller.OrderController;
import DAO.OrderDAO;
import view.OrderForm;

public class Main {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/qldonhang", "root", "");
            OrderDAO orderDAO = new OrderDAO(conn);
            OrderController controller = new OrderController(orderDAO);

            SwingUtilities.invokeLater(() -> new OrderForm(controller));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

