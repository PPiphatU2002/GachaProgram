package ClassMethod;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author PIPHAT
 */
public class DB_Con {
    private Connection con = null;
    private Statement st = null;
    private ResultSet rs = null;
    private String url = "jdbc:mysql://localhost:3306/gacha program";
    private String username = "root";
    private String password = "";

    public void ConnectDB() throws SQLException {
        try {
            con = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            System.out.print("error");
        }
    }

    public void DisconnectDB() throws SQLException {
        try {
            con.close();
        } catch (Exception e) {
            System.out.print("error");
        }
    }

    public boolean execute(String SQL) throws SQLException {
        try {
            ConnectDB();
            st = con.createStatement();
            st.execute(SQL);
            DisconnectDB();
            return true;
        } catch (Exception e) {
            DisconnectDB();
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        } 
    }

    public ResultSet getResultSet(String SQL) throws SQLException {
        try {
            ConnectDB();
            st = con.createStatement();
            rs = st.executeQuery(SQL);
            return rs;
        } catch (Exception e) {
            return null;
        }
    }
}
