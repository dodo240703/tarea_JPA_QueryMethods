/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.stw2.lab3.model.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import pe.edu.pucp.stw2.lab3.model.bean.Department;
import pe.edu.pucp.stw2.lab3.model.bean.Employee;
import pe.edu.pucp.stw2.lab3.model.bean.Job;
import pe.edu.pucp.stw2.lab3.model.bean.Location;

/**
 *
 * @author Oscar A. Díaz Barriga
 */
public class EmployeeDAO extends BaseDAO {

    public ArrayList<Employee> findAll() {

        ArrayList<Employee> listaEmpleados = new ArrayList<>();

        //        COMPLETAR

        return listaEmpleados;
    }

    public Employee findById(int id) {

        Employee employee = new Employee();

 //        COMPLETAR

        return employee;
    }

    public boolean deleteById(int id) {
        String sql = " //        COMPLETAR";
        boolean flag = false;
        try {
             //        COMPLETAR
            flag = true;

        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag;
    }

}
