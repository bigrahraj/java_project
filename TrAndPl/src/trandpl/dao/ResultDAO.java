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
import java.util.ArrayList;
import java.util.List;
import trandpl.dbutil.DBConnection;
import trandpl.pojo.ParticipantJobPojo;
import trandpl.pojo.ParticipantResultPojo;
import trandpl.pojo.ResultsPojo;

/**
 *
 * @author ashut
 */
public class ResultDAO {
    public static boolean applyForJob(ResultsPojo result) throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("Select * from results where participantid=? and jobid=?");
        ps.setString(1,result.getpId());
        ps.setString(2,result.getJobId());
        ResultSet rs=ps.executeQuery();
        if(rs.next()){
            return false;
        }
        ps=conn.prepareStatement("insert into results values(?,?,?,?)");
        ps.setString(1,result.getpId());
        ps.setString(2,result.getJobId());
        ps.setDouble(3,result.getPercentage());
        ps.setString(4,result.getSelectedByHr());
        return 1==ps.executeUpdate();
    }
    public static List<ParticipantJobPojo> getAllAppliedJob(String participantId) throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select jobs.jobid,jobs.jobtitle,companyname,tags from jobs,results,hr where jobs.jobid=results.jobid and jobs.hrid=hr.hrid and participantid=? and percentage=-1");
        ps.setString(1, participantId);
        List<ParticipantJobPojo> allAppliedJobList=new ArrayList<>();
        ResultSet rs=ps.executeQuery();
        while(rs.next()){
            ParticipantJobPojo pj=new ParticipantJobPojo();
            pj.setJobId(rs.getString(1));
            pj.setJobTitle(rs.getString(2));
            pj.setCompanyName(rs.getString(3));
            pj.setTags(rs.getString(4));
            allAppliedJobList.add(pj);
        }
        return allAppliedJobList;
    }
    public static boolean setResult(ResultsPojo result) throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("update results set percentage=? where participantid=? and jobid=?");
        ps.setDouble(1,result.getPercentage());
        ps.setString(2,result.getpId());
        ps.setString(3,result.getJobId());
        return 1==ps.executeUpdate();
    }
    public static List<ParticipantResultPojo> getAllCompletedJobs(String participantId) throws SQLException{
       Connection conn=DBConnection.getConnection();
       PreparedStatement ps=conn.prepareStatement("select jobs.jobid,jobs.jobtitle,hr.companyname,jobs.tags,results.percentage from jobs,hr,results where jobs.jobid=results.jobid and jobs.hrid=hr.hrid and results.percentage!=-1 and results.participantid=?");
       ps.setString(1,participantId);
       ResultSet rs=ps.executeQuery();
       List<ParticipantResultPojo> allResultList=new ArrayList<>();
       while(rs.next()){
           ParticipantResultPojo result=new ParticipantResultPojo();
           result.setJobId(rs.getString(1));
           result.setJobTitle(rs.getString(2));
           result.setCompanyName(rs.getString(3));
           result.setTags(rs.getString(4));
           result.setPercentage(rs.getDouble(5));
           allResultList.add(result);
       }
       return allResultList;
    }
}
