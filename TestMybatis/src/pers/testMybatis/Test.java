package pers.testMybatis;
import java.io.Reader;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import pers.testMybatis.*;

public class Test {
    private static SqlSessionFactory sqlSessionFactory;
    private static Reader reader;
    
    static{
    	try{
    		reader = Resources.getResourceAsReader("Config.xml");
    		sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    }
    public static String TimeToDate(Long t){
            String res;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = new Date(t);
            res = simpleDateFormat.format(date);
            return res;
    }
    
    public static void main(String[] args){
    	SqlSession session = sqlSessionFactory.openSession();
    	try{
    		Job job = (Job) session.selectOne("pers.testMybatis.JobMapper.getJob", 12);
    		if(job != null){
    			String jobinfo = "ID: "+job.getJid()+" "+"ְλ���ƣ� "+job.getJname()+" ��Ŀ�� "
    		+job.getNumber()+" ����ʱ�䣺 "+TimeToDate(job.getCreate_at());
    			System.out.println(jobinfo);
    			System.out.println("��ѯ�ɹ�");
    		}
    	}catch(Exception e){
    		e.printStackTrace();
    	}finally{
    		session.close();
    	}
    }
}
