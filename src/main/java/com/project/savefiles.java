package com.project;

import java.sql.*;

public class savefiles 
{

    public Connection connect() throws SQLException
    {
        return DriverManager.getConnection("jdbc:sqlite:userdata.db");
    }

    
    // public void displayRecords(Connection conn) throws SQLException
    // {
    //     Statement st = conn.createStatement();

    //     ResultSet rs = st.executeQuery("SELECT * FROM Userdata");

    //     while (rs.next())
    //     {
    //         System.out.println("Name: " + rs.getString("name"));
    //         System.out.println("key: "  + rs.getInt("key"));
    //     }
    // }

    
}
