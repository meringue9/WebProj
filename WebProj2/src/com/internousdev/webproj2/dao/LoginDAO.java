package com.internousdev.webproj2.dao;

import java.sql.Connection;

import com.internousdev.webproj2.util.DBConnector;

public class LoginDAO {

	public String username;
	public String password;
	public boolean select (String username,String password) {
		boolean ret=false;
		DBConnector db = new DBConnector();
		Connection con =db.getConnection();

		String sql ="select : from user_name=? and password =?";
		try {

		}



	}

}
