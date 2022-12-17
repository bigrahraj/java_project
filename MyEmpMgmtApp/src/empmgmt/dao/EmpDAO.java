  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empmgmt.dao;

import empmgmt.dbutil.DBConnection;
import empmgmt.pojo.Employee;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hp
 */
public class EmpDAO {
    public static boolean addEmp(Employee e)throws SQLException
    {
        Connection con = DBConnection.getConnection();
        PreparedStatement ps =con.prepareStatement("Insert into employees values(?,?,?)");
        ps.setInt(1,e.getEmpNo());
        ps.setString(2,e.getEmpName());
        ps.setDouble(3,e.getEmpSal());
        int result = ps.executeUpdate();
        
        return result==1; 
    }
    public static Employee findEmpbyNo(int empNo)throws SQLException{
        Connection con=DBConnection.getConnection();
        PreparedStatement ps = con.prepareStatement("Select * from employees where empno=?");
        ps.setInt(1,empNo);
        ResultSet rs=ps.executeQuery();
        Employee e =null;
        if(rs.next()){
            e=new Employee();
            e.setEmpNo(empNo);
            e.setEmpName(rs.getString(2));
            e.setEmpSal(rs.getDouble(3));                 
        }
        return e;
        
    }
    public static List<Employee> getAllEmployees()throws SQLException{
        Connection con=DBConnection.getConnection();
        Statement ps = con.createStatement();
        List<Employee> empList=new ArrayList<>();
        ResultSet rs = ps.executeQuery("Select * from Employees order by empno");
        while(rs.next()){
            Employee e = new Employee(rs.getInt(1),rs.getString(2),rs.getDouble(3));
            empList.add(e);
        }
        return empList;
    }
} 
