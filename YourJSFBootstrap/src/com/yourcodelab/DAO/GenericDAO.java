package com.yourcodelab.DAO;


import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;


public class GenericDAO {
		private ConnectDB db = new ConnectDB ();
		protected Connection connect;
		
		public void openConnection() throws ClassNotFoundException, IOException, SQLException{
				connect = db.getConnection();
		}
		
		public void closeConnection(){
			if(connect != null){
				try {
					connect.close();
				} catch (SQLException e) {
					System.out.println("Error on Closing Connection");
				}
			}
		}
	}
