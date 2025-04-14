package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Model.Product;

public class ProductDAO {
	private Connection conn;
	
	public ProductDAO(Connection conn) {
		this.conn = conn;
	}
	public Product getProductById(int id) throws SQLException{
		String sql = "SELECT * FROM products WHERE id = ?";
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setInt(1, id);
		ResultSet rs  = stmt.executeQuery();
		if(rs.next()) {
			Product product = new Product();
			product.id = rs.getInt("id");
			product.name = rs.getString("name");
			product.price = rs.getDouble("price");
			return product;
		}
		return null;
	}
}
