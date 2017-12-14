package pers.onezero.el.comel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("proBeanEl")
public class ProgrammerEl {
	  @Value("#{jobBeanEl.name}")
      private String jobName;
	  @Value("#{jobBeanEl}")
      private JobEl job;
      
      public void setjobName(String jobName){
    	  this.jobName = jobName;
    	  
      }
      public String getjobName(){
    	  return jobName;
      }
      public void setjob(JobEl job){
    	  this.job = job;
      }
      public JobEl getjob(){
    	  return job;
      }
      
      public String toString(){
    	  return "jobName: "+jobName+"\naddress: "+job.getaddress()+"\nyearsOfWorking: "+job.getyearsOfWorking();
      }
}
