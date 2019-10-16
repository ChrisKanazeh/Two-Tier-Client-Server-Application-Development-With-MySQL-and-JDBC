/*
 * Author: Christopher Kanazeh
 * Course: CNT 4714 Fall 2015
 * Assignment title: MySQL and JDBC 
 * Date: October 4th, 2015
 */

package mysql;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.MySQLConnection;

public class DBEngine {

	private String mURL;
	private String mUser;
	private String mPassword;
	private MySQLConnection mConnection;
	
	/**
	 * Constructor to set the URL, Username, and Password for the DB.
	 * @param URL
	 * @param Username
	 * @param Password
	 */
	public DBEngine(String URL, String Username, String Password){
		this.mURL = URL;
		this.mUser = Username;
		this.mPassword = Password;
	}
	
	/**
	 * Establishes the database connection.
	 * @throws SQLException
	 */
	public void EstablishConnection() throws SQLException{
		mConnection = (MySQLConnection) DriverManager.getConnection(this.mURL, this.mUser, this.mPassword);
	}
	
	/**
	 * Closes the database connection.
	 * @throws SQLException
	 */
	public void CloseConnection() throws SQLException{
		mConnection.close();
	}
	
	/**
	 * Retrieves the current connection.
	 * @return
	 */
	public MySQLConnection getConnection(){
		return this.mConnection;
	}
	
}
