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
    			String jobinfo = "ID: "+job.getJid()+" "+"职位名称： "+job.getJname()+" 数目： "
    		+job.getNumber()+" 创建时间： "+TimeToDate(job.getCreate_at());
    			System.out.println(jobinfo);
    			System.out.println("查询成功");
    		}
    	}catch(Exception e){
    		e.printStackTrace();
    	}finally{
    		session.close();
    	}
    }
}
