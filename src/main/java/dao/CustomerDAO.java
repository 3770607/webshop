package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import bean.Customer;

public class CustomerDAO extends ConnectionManager{
	public Customer search(String login,String password) throws Exception{
		Customer c=null;
		Connection con=getConnection();
		PreparedStatement st;
		st=con.prepareStatement("select * from Customer where login=? and password=?");
		st.setString(1,login);
		st.setString(2,password);
		ResultSet rs=st.executeQuery();
		
		while(rs.next()) {
			c=new Customer();
			c.setId(rs.getInt("id"));
			c.setLogin(rs.getString("login"));
			c.setPassword(rs.getString("password"));
		}
		st.close();
		con.close();
		return c;
	}
	
	public int insert(Customer c) throws Exception {
		Connection con=getConnection();

		PreparedStatement st=con.prepareStatement(
			"insert into customer(login,password) values(?,?)");
		st.setString(1, c.getLogin());
		st.setString(2, c.getPassword());
		
		int line=st.executeUpdate();

		st.close();
		con.close();

		return line;
	}
}
