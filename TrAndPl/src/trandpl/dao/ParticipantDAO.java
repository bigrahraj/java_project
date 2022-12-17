/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trandpl.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import trandpl.dbutil.DBConnection;
import trandpl.pojo.ParticipantPojo;

/**
 *
 * @author ashut
 */
public class ParticipantDAO {
    public static int getNewParticipantId() throws SQLException{
        Connection conn=DBConnection.getConnection();
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("Select max(pid) from participants");
        int pId=501;
        rs.next();
        String strid=rs.getString(1);
        if(strid!=null){           
            String id=strid.substring(2);
            pId=Integer.parseInt(id)+1;
        }
        return pId;
    }
    public static int addNewParticipant(ParticipantPojo pt)throws SQLException,FileNotFoundException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select userid from users where userid=?");
        ps.setString(1,pt.getUserId().toUpperCase().trim());
        ResultSet rs=ps.executeQuery();
        if(rs.next()){
            return -1;
        }
        ps=conn.prepareStatement("insert into users values(?,?,?,?,?,?)");
        ps.setString(1,pt.getUserId());
        ps.setString(2,pt.getId());
        ps.setString(3,pt.getName());
        ps.setString(4,pt.getPassword());
        ps.setString(5,pt.getType());
        ps.setString(6,"Y");
        int x=ps.executeUpdate();
        int y=0;
        if(x==1){
            ps=conn.prepareStatement("insert into participants values(?,?,?,?,?)");
            ps.setString(1,pt.getId());
            ps.setString(2,pt.getPhone());
            ps.setString(3,pt.getSkill());
            ps.setString(4,pt.getQualifications());
            File f=pt.getResume();
            InputStream fin=new FileInputStream(f.getPath());
            ps.setBlob(5, fin);
            y=ps.executeUpdate();
        }
        return y;
    }
    public static ParticipantPojo getParticipantById(String id) throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select name,userid,phone from users,participants where users.id=participants.pid and pid=?");
        ps.setString(1,id);
        ResultSet rs=ps.executeQuery();
        rs.next();
        ParticipantPojo pt=new ParticipantPojo();
        pt.setName(rs.getString(1));
        pt.setUserId(rs.getString(2));
        pt.setPhone(rs.getString(3));
        return pt;
    }
    public static boolean updateResume(String pId,File resume) throws SQLException,FileNotFoundException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("update participants set resume=? where pid=?");
        FileInputStream fobj=new FileInputStream(resume);
        ps.setBlob(1, fobj);
        ps.setString(2,pId);
        return ps.executeUpdate()==1;
    }
    
}
