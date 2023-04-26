package com.project;

import java.sql.*;


public class savefiles 
{
    static final String QUERY = "SELECT name, key, chars FROM Userdata";

    public Connection connect() throws SQLException
    {
        return DriverManager.getConnection("jdbc:sqlite:userdata.db");
    }
    
    public void createSave(Connection conn, String name, int chars) throws SQLException
    {
        Statement st = conn.createStatement();
        
        String sql = "INSERT INTO Userdata (name, chars) VALUES (%s, %d)".formatted(name, chars);
        ResultSet rs = st.executeQuery(sql);

        rs.close();
    }

    public void updateSave(Connection conn, String name, int chars) throws SQLException
    {
        Statement st = conn.createStatement();

        String sql = "UPDATE Userdata SET chars = %d WHERE name in (%s)".formatted(chars, name);
        st.executeUpdate(sql);

        ResultSet rs = st.executeQuery(QUERY);

        rs.close();
    }


    
}
