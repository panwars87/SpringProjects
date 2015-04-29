package com.ys.spring.aggregator.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ys.spring.aggregator.dto.Customer;
import com.ys.spring.aggregator.dto.CustomerType;
import com.ys.spring.aggregator.helpers.CustomerFactory;

@Service(value="jdbcCustomerDaoImpl")
public class JdbcCustomerDaoImpl implements JdbcCustomerDao{

	@Autowired
	DataSource dataSource;
	
	public void createCustomer(Customer customer) {
		String sql = "INSERT INTO CUSTOMER " +
				"(customerId, firstName, lastName, customerType) VALUES (?, ?, ?, ?)";
		Connection conn = null;
 
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, customer.getCustomerId());
			ps.setString(2, customer.getFirstName());
			ps.setString(3, customer.getLastName());
			ps.setString(4, customer.getCustomerType().toString());
			ps.executeUpdate();
			ps.close();
 
		} catch (SQLException e) {
			throw new RuntimeException(e);
 
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {}
			}
		}
	}

	public Customer findCustomer(int customerId) {
		String sql = "SELECT * FROM CUSTOMER WHERE customerId = ?";

		Connection conn = null;

		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, customerId);
			Customer customer = null;
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				customer = CustomerFactory.buildCustomer(CustomerType.Regular);
				customer.setFirstName(rs.getString("firstName"));
				customer.setLastName(rs.getString("lastName"));
				customer.setCustomerId(customerId);
				customer.setCustomerType(CustomerType.valueOf(rs.getString("customerType")));
			}
			rs.close();
			ps.close();
			return customer;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {}
			}
		}
	}
	
}
