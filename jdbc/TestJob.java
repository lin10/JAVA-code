package blog;
import java.util.*;
public class TestJob {
   public static void main(String[] args){
	   JobDAO jobdao = new JobDAOImpl();
	   long time = new Date().getTime();
	   int res;
	   res = jobdao.insert("JAVA�ܹ�ʦ", 3, time, time);
	   if(res>0)
		   System.out.println("����ɹ�, ����"+res+"��");
	   else
		   System.out.println("����ʧ�ܣ�����");
	   res = jobdao.update("JAVA�ܹ�ʦ", 13);
	   if(res>0)
		   System.out.println("���³ɹ���");
	   else
		   System.out.println("����ʧ�ܣ�����");
	   res = jobdao.delete("JAVA�ܹ�ʦ");
	   if(res>0)
		   System.out.println("ɾ���ɹ���");
	   else
		   System.out.println("ɾ��ʧ�ܣ�����");
	   jobdao.select("JAVA�з�����ʦ");
   }
}
