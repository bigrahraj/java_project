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
import trandpl.pojo.JobPojo;
import trandpl.pojo.ParticipantJobPojo;

/**
 *
 * @author ashut
 */
public class JobDAO {
    public static int getNewJobId()throws SQLException{
        Connection conn=DBConnection.getConnection();
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("select max(jobid) from jobs");
        rs.next();
        String strid=rs.getString(1);
        int jobId=101;
        if(strid!=null){
            String id=strid.substring(4);
            jobId=Integer.parseInt(id)+1;
        }
        return jobId;
    }
    public static boolean addNewJob(JobPojo job)throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("insert into jobs values(?,?,?,?,?)");
        ps.setString(1,job.getJobId());
        ps.setString(2,job.getJobTitle());
        ps.setString(3,job.getHrId());
        ps.setString(4,job.getTags());
        ps.setInt(5,job.getStatus());
        return 1==ps.executeUpdate();
    }
    public static List <JobPojo> getAllActiveJobsByCurrentHr(String hrId)throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select jobid,jobtitle,tags,status from jobs where hrid=? and status!=-1");
        ps.setString(1, hrId);
        ResultSet rs=ps.executeQuery();
        List <JobPojo> allJobList=new ArrayList<>();
        while(rs.next()){
            JobPojo obj=new JobPojo();
            obj.setJobId(rs.getString(1));
            obj.setJobTitle(rs.getString(2));
            obj.setTags(rs.getString(3));
            obj.setStatus(rs.getInt(4));
            allJobList.add(obj);
        }
        return allJobList;
    }
    public static boolean removeJobByJobId(String JobId)throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("update jobs set status=-1 where jobid=?");
        ps.setString(1, JobId);
        return ps.executeUpdate()==1;
    }
    public static List <JobPojo> getAllEditableJobsByCurrentHr(String hrId)throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select jobid,jobtitle,tags,status from jobs where hrid=? and status=0");
        ps.setString(1, hrId);
        ResultSet rs=ps.executeQuery();
        List <JobPojo> allJobList=new ArrayList<>();
        while(rs.next()){
            JobPojo obj=new JobPojo();
            obj.setJobId(rs.getString(1));
            obj.setJobTitle(rs.getString(2));
            obj.setTags(rs.getString(3));
            obj.setStatus(rs.getInt(4));
            allJobList.add(obj);
        }
        return allJobList;
    }
    public static boolean editJobByJobId(JobPojo job)throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("update jobs set jobtitle=?, tags=? where jobid=?");
        ps.setString(1, job.getJobTitle());
        ps.setString(2,job.getTags());
        ps.setString(3,job.getJobId());
        return 1==ps.executeUpdate();
    }
    public static boolean setJobStatus(String jobId)throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("update jobs set status=1, where jobid=?");
        ps.setString(1, jobId);
        return 1==ps.executeUpdate();
    }
     public static List <JobPojo> getAllOpenJobsByCurrentHr(String hrId)throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select jobid,jobtitle,tags,status from jobs where hrid=? and status=1");
        ps.setString(1, hrId);
        ResultSet rs=ps.executeQuery();
        List <JobPojo> allJobList=new ArrayList<>();
        while(rs.next()){
            JobPojo obj=new JobPojo();
            obj.setJobId(rs.getString(1));
            obj.setJobTitle(rs.getString(2));
            obj.setTags(rs.getString(3));
            obj.setStatus(rs.getInt(4));
            allJobList.add(obj);
        }
        return allJobList;
    }
     public static List<ParticipantJobPojo> getAvailableJobs() throws SQLException{
        Connection conn=DBConnection.getConnection();
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("select jobid,jobtitle,companyname,tags,jobs.hrId from jobs,hr where jobs.hrid=hr.hrid and status=1 order by jobid");
        List<ParticipantJobPojo> allOpenJobsList=new ArrayList<>();
        while(rs.next()){
            ParticipantJobPojo pt=new ParticipantJobPojo();
            pt.setJobId(rs.getString(1));
            pt.setJobTitle(rs.getString(2));
            pt.setCompanyName(rs.getString(3));
            pt.setTags(rs.getString(4));
            pt.setHrId(rs.getString(5));
            allOpenJobsList.add(pt);
        }
        return allOpenJobsList;
     }
}
