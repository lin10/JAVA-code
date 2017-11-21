package pers.mybatis.inter.main;
import java.io.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import pers.mybatis.inter.model.*;
import pers.mybatis.inter.dao.*;
public class main {
     public static SqlSessionFactory sqlSessionFactory;
     public static Reader reader;
     static{
    	 try{
    		 reader = Resources.getResourceAsReader("config/config.xml");
    		 sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
    		 sqlSessionFactory.getConfiguration().addMapper(JobInter.class);
    	 }catch(Exception e){
    		 e.printStackTrace();
    	 }
     }
     
     public static SqlSessionFactory getSession(){
    	 return sqlSessionFactory;
     }
     
     public static String TimeToDate(long time){
    	 SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:MM:ss");
    	 Date date = new Date(time);
    	 String res = simpleDateFormat.format(date);
    	 return res;
     }
     
     public static  void main(String[] args){
    	 SqlSession session = sqlSessionFactory.openSession();
    	 try{
    		 JobInter jobInter = session.getMapper(JobInter.class);
    		 Job job = jobInter.getJobByid(11);
    		 System.out.println("ID：               "+job.getJid());
    		 System.out.println("职位名称："+job.getJname());
    		 System.out.println("数目：          "+job.getNumber() );
    		 System.out.println("发布日期："+TimeToDate(job.getCreate_at()));
    	 }catch(Exception e){
    		 e.printStackTrace();
    	 }finally{
    		 session.close();
    	 }
     }
}
