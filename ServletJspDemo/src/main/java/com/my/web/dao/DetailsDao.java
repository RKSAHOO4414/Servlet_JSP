package com.my.web.dao;

import java.sql.*;
import com.my.web.model.details;

public class DetailsDao {
	public details getDetails(int aid) {
		details d = new details();
		d.setAid(101);
		d.setAname("raja");
		d.setTech("java");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","root");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from irb where aid=" + aid);
			if(rs.next()) {
				d.setAid(rs.getInt("aid"));
				d.setAname(rs.getString("aname"));
				d.setTech(rs.getString("tech"));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return d;
	}
}
