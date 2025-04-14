package DAO;

import java.sql.*;
import Model.Customer;

public class CustomerDAO {
	private Connection connection;
	
	public CustomerDAO(Connection connection) {
		this.connection = connection;
	}
	public Customer getCustomerById(int id) throws SQLException{
		String sql = "SELECT * FROM customers WHERE id= ?";
		PreparedStatement stmt = connection.prepareStatement(sql);
		stmt.setInt(1, id);
		
		ResultSet rs = stmt.executeQuery();
		if(rs.next()) {
			Customer customer = new Customer();
			customer.id = rs.getInt("id");
			customer.name = rs.getString("name");
			return customer;
		}
		return null;
	}
}
