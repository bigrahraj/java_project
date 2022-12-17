/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trandpl.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import trandpl.dbutil.DBConnection;
import trandpl.pojo.HrPojo;

/**
 *
 * @author ashut
 */
public class HrDAO {
    public static int getNewHrId() throws SQLException{
        Connection conn=DBConnection.getConnection();
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("Select max(hrid) from hr");
        int hrId=101;
        rs.next();
        String strid=rs.getString(1);
        if(strid!=null){           
            String id=strid.substring(3);
            hrId=Integer.parseInt(id)+1;
        }
        return hrId;
    }
    public static int addNewHr(HrPojo hr)throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select userid from users where userid=?");
        ps.setString(1,hr.getUserId());
        ResultSet rs=ps.executeQuery();
        if(rs.next())
        {
            return -1;
        }
         ps=conn.prepareStatement("insert into users values(?,?,?,?,?,?)");
         ps.setString(1,hr.getUserId());
         ps.setString(2,hr.getHrId());
         ps.setString(3,hr.getHrName());
         ps.setString(4,hr.getPassword());
         ps.setString(5,hr.getType());
         ps.setString(6,"Y");
         int x=ps.executeUpdate();
         int y=0;
         if(x==1){
            ps=conn.prepareStatement("insert into hr values(?,?,?,?)");
            ps.setString(1,hr.getHrId());
            ps.setString(2,hr.getPhone());
            ps.setString(3,hr.getCompanyName());
            ps.setString(4,hr.getProfession()); 
            y=ps.executeUpdate();
            
         }
         return y;
    }
    public static List <HrPojo> getAllHr() throws SQLException{
        Connection conn=DBConnection.getConnection();
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("select hr.hrid,users.userid,users.name,hr.phone,hr.companyname from hr,users where hr.hrid=users.id and users.active='Y' order by hr.hrid");
        List <HrPojo> allHrList=new ArrayList<>();
        while(rs.next()){
            HrPojo obj=new HrPojo();
            obj.setHrId(rs.getString(1));
            obj.setUserId(rs.getString(2));
            obj.setHrName(rs.getString(3));
            obj.setPhone(rs.getString(4));
            obj.setCompanyName(rs.getString(5));
            allHrList.add(obj);
        }
        return allHrList;
    }
    public static String getCompanyNameById(String hrId)throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select companyname from hr where hrid=?");
        ps.setString(1,hrId);
        ResultSet rs=ps.executeQuery();
        rs.next();
        return rs.getString(1);
    }
    
}
