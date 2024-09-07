/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.stw2.lab3.model.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Oscar A. Díaz Barriga
 */
public class BaseDAO {
    
    public Connection conn;
    
    public BaseDAO() {
        String user = "root";
        String pass = "123456";
        String url = "jdbc:mysql://192.168.152.137:3306/hr?serverTimezone=UTC&useSSL=false&publicKeyRetrieval=true";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BaseDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            conn = DriverManager.getConnection(url, user, pass);
        } catch (SQLException ex) {
            System.out.println("Ocurrió un error");
        }     
        
    }
    
}
