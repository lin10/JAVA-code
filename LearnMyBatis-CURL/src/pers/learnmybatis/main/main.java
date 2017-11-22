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
			reader = Resources.getResourceAsReader("config/Config.xml");    /*���������ļ�*/
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
	//��ȡjob����Ϣ
	public static void GetJobList(){
		try{
			SqlSession session = sqlSessionFactory.openSession();
			JobInter jobinter = session.getMapper(JobInter.class);
			//���Job��Ϣ
			System.out.println("��ѯ��ʼ����");
			printJobs(jobinter.getJobList());
			System.out.println("��ѯ��������");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	//��������
	public static void InsertJobTest(){
		long time = new Date().getTime();
		try{
			SqlSession session = sqlSessionFactory.openSession();
			JobInter jobinter = session.getMapper(JobInter.class);
			System.out.println("�������ݿ�ʼ����");
			//ִ�в���
			Job job = new Job();
			job.setJname("��ά����ʦ");
			job.setNumber(5);
			job.setCreate_at(time);
			job.setUpdate_at(time);
			jobinter.insertJob(job);
			//�ύ����
			session.commit();
			System.out.println("������ɣ�");
			GetJobTest();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	//��������
	public static void UpdateJobTest(){
		long time = new Date().getTime();
		try{
			SqlSession session = sqlSessionFactory.openSession();
			JobInter jobinter = session.getMapper(JobInter.class);
			System.out.println("��ʼ�������ݡ���");
			//ִ�и���
			Job job = jobinter.getJob("��ά��������ʦ");
			job.setNumber(13);
			job.setUpdate_at(time);
			jobinter.updateJob(job);
			//�ύ����
			session.commit();
			System.out.println("������ɡ���");
			printJobs(jobinter.getJobList());
		}catch(Exception e){
			e.printStackTrace();
		}
	}
    //ɾ������
	public static void DeleteJobTest(){
		try{
			SqlSession session = sqlSessionFactory.openSession();
			JobInter jobinter = session.getMapper(JobInter.class);
			System.out.println("����ɾ������");
			//ִ��ɾ��
			jobinter.deleteJob("JAVA��������ʦ");
			session.commit();
			System.out.println("ɾ����ɡ���");
			printJobs(jobinter.getJobList());
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	//��ȡָ��ְλ�������Ϣ
	public static void GetJobTest(){
		SqlSession session = sqlSessionFactory.openSession();
		JobInter jobinter = session.getMapper(JobInter.class);
		try{
			System.out.println("��ѯ��ʼ����");
			printJob(jobinter.getJob("��ά��������ʦ"));
			System.out.println("��ѯ��������");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	//�����Ϣ������̨
	public static void printJobs(final List<Job> jobs){
		int count = 0;
		for(Job job : jobs){
			System.out.println(MessageFormat.format("--------------Job[{0}]------------------",++count));
				System.out.println("Job��ţ�"+job.getJid());
				System.out.println("Job���ƣ�"+job.getJname());
				System.out.println("Job��Ŀ��"+job.getNumber());
				System.out.println("����ʱ�䣺"+job.getCreate_at());
				System.out.println("����ʱ�䣺"+job.getUpdate_at());
			
		}
	}
	public static void printJob(Job job){
		    System.out.println("----------------------------------");
			System.out.println("Job��ţ�"+job.getJid());
			System.out.println("Job���ƣ�"+job.getJname());
			System.out.println("Job��Ŀ��"+job.getNumber());
			System.out.println("����ʱ�䣺"+job.getCreate_at());
			System.out.println("����ʱ�䣺"+job.getUpdate_at());
	}
}
