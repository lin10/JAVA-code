package pers.learnmybatis.main;
import java.io.Reader;
import java.text.MessageFormat;
import java.util.List;
import java.util.Date;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import pers.learnmybatis.mapper.*;
import pers.learnmybatis.po.Job;

public class main {
	public static SqlSessionFactory sqlSessionFactory;
	public static Reader reader;
	
	static{
		try{
			reader = Resources.getResourceAsReader("config/Config.xml");    /*引入配置文件*/
		    sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static SqlSessionFactory getSession(){
		return sqlSessionFactory;
	}
	
	public static void main(String[] args){
		SqlSession session = sqlSessionFactory.openSession();
		try{
//			GetJobList();
//			InsertJobTest();
//			UpdateJobTest();
			DeleteJobTest();
//			GetJobTest();
		}finally{
			session.close();
		}
	}
	//获取job表信息
	public static void GetJobList(){
		try{
			SqlSession session = sqlSessionFactory.openSession();
			JobInter jobinter = session.getMapper(JobInter.class);
			//输出Job信息
			System.out.println("查询开始……");
			printJobs(jobinter.getJobList());
			System.out.println("查询结束……");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	//插入数据
	public static void InsertJobTest(){
		long time = new Date().getTime();
		try{
			SqlSession session = sqlSessionFactory.openSession();
			JobInter jobinter = session.getMapper(JobInter.class);
			System.out.println("插入数据开始……");
			//执行插入
			Job job = new Job();
			job.setJname("运维工程师");
			job.setNumber(5);
			job.setCreate_at(time);
			job.setUpdate_at(time);
			jobinter.insertJob(job);
			//提交事务
			session.commit();
			System.out.println("插入完成！");
			GetJobTest();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	//更新数据
	public static void UpdateJobTest(){
		long time = new Date().getTime();
		try{
			SqlSession session = sqlSessionFactory.openSession();
			JobInter jobinter = session.getMapper(JobInter.class);
			System.out.println("开始更新数据……");
			//执行更新
			Job job = jobinter.getJob("运维开发工程师");
			job.setNumber(13);
			job.setUpdate_at(time);
			jobinter.updateJob(job);
			//提交事务
			session.commit();
			System.out.println("更新完成……");
			printJobs(jobinter.getJobList());
		}catch(Exception e){
			e.printStackTrace();
		}
	}
    //删除数据
	public static void DeleteJobTest(){
		try{
			SqlSession session = sqlSessionFactory.openSession();
			JobInter jobinter = session.getMapper(JobInter.class);
			System.out.println("正在删除……");
			//执行删除
			jobinter.deleteJob("JAVA开发工程师");
			session.commit();
			System.out.println("删除完成……");
			printJobs(jobinter.getJobList());
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	//获取指定职位的相关信息
	public static void GetJobTest(){
		SqlSession session = sqlSessionFactory.openSession();
		JobInter jobinter = session.getMapper(JobInter.class);
		try{
			System.out.println("查询开始……");
			printJob(jobinter.getJob("运维开发工程师"));
			System.out.println("查询结束……");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	//输出信息到控制台
	public static void printJobs(final List<Job> jobs){
		int count = 0;
		for(Job job : jobs){
			System.out.println(MessageFormat.format("--------------Job[{0}]------------------",++count));
				System.out.println("Job编号："+job.getJid());
				System.out.println("Job名称："+job.getJname());
				System.out.println("Job数目："+job.getNumber());
				System.out.println("发布时间："+job.getCreate_at());
				System.out.println("更新时间："+job.getUpdate_at());
			
		}
	}
	public static void printJob(Job job){
		    System.out.println("----------------------------------");
			System.out.println("Job编号："+job.getJid());
			System.out.println("Job名称："+job.getJname());
			System.out.println("Job数目："+job.getNumber());
			System.out.println("发布时间："+job.getCreate_at());
			System.out.println("更新时间："+job.getUpdate_at());
	}
}
