package pers.learnmybatis.mapper;
import java.util.List;
import org.apache.ibatis.annotations.Select;
import pers.learnmybatis.po.Job;

public interface JobInter {
	 public List<Job> getJobList();
	 public void insertJob(Job job);
	 public void updateJob(Job job);
	 public void deleteJob(String jname);
     public Job getJob(String jname);
}
