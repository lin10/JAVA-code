package blog;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.*;
public  class JobDAOImpl implements JobDAO{
        private Connection conn;
        private PreparedStatement psjob;
        private Statement jobinfo;
        private ResultSet results;
        long time = new Date().getTime();
        //��������
        public int insert(String jname, int number, long create_at,long update_at){
        	int result = 0;
        	conn = ConnectionManager.getConnection();
        	try{
        		String sql = "insert into yl_job (jname,number,create_at,update_at)values(?,?,?,?)";
        		psjob = conn.prepareStatement(sql);
        		psjob.setString(1, jname);
        		psjob.setInt(2, number);
        		psjob.setLong(3, create_at);
        		psjob.setLong(4, update_at);
        		result = psjob.executeUpdate();
        	}catch(SQLException e){
        		e.printStackTrace();
        	}finally{
        		ConnectionManager.closeStatement(psjob);
        		ConnectionManager.closeConnection(conn);
        	}
        	return result;
        }
        //����job�� ��Ŀ
        public int update(String jobName, int number){
        	int result = 0;
        	conn = ConnectionManager.getConnection();
        	try{
        		String sql = "update yl_job set number=?,update_at=? where jname=?";
        	    psjob = conn.prepareStatement(sql);
        		psjob.setInt(1, number);
        		psjob.setLong(2, time);
        		psjob.setString(3, jobName);
        		result = psjob.executeUpdate();
        	}catch(SQLException e){
        		e.printStackTrace();
        	}finally{
        		ConnectionManager.closeStatement(psjob);
        		ConnectionManager.closeConnection(conn);
        	}
        	return result;
        }
        //����job nameɾ��job
        public int delete(String jobName){
        	int result = 0;
        	conn = ConnectionManager.getConnection();
        	try{
        		String sql = "delete from yl_job where jname=?";
        		psjob = conn.prepareStatement(sql);
        		psjob.setString(1, jobName);
        		result = psjob.executeUpdate();
        	}catch(SQLException e){
        		e.printStackTrace();
        	}finally{
        		ConnectionManager.closeStatement(psjob);
        		ConnectionManager.closeConnection(conn);
        	}
        	return result;
        }
        public void select(String jobName){
        	conn = ConnectionManager.getConnection();
        	try{
        		String sql = "select * from yl_job where jname = '"+jobName+"'";
        		jobinfo = conn.createStatement();
        		ResultSet results = jobinfo.executeQuery(sql);
        		while(results.next()){
        			System.out.println(results.getString("jid")+" "+results.getString("jname")+" "+results.getString("create_at")
        			+" "+results.getString("update_at") );
        		}
        	}catch(SQLException e){
        		e.printStackTrace();
        	}
        }

}
