package blog;
import java.util.*;
public class TestJob {
   public static void main(String[] args){
	   JobDAO jobdao = new JobDAOImpl();
	   long time = new Date().getTime();
	   int res;
	   res = jobdao.insert("JAVA架构师", 3, time, time);
	   if(res>0)
		   System.out.println("插入成功, 插入"+res+"条");
	   else
		   System.out.println("插入失败！！！");
	   res = jobdao.update("JAVA架构师", 13);
	   if(res>0)
		   System.out.println("更新成功！");
	   else
		   System.out.println("更新失败！！！");
	   res = jobdao.delete("JAVA架构师");
	   if(res>0)
		   System.out.println("删除成功！");
	   else
		   System.out.println("删除失败！！！");
	   jobdao.select("JAVA研发工程师");
   }
}
