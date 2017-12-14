package pers.onezero.el.com;

public class Programmer {
      private String jobName;
      private Job job;
      
      public void setjobName(String jobName){
    	  this.jobName = jobName;
    	  
      }
      public String getjobName(){
    	  return jobName;
      }
      public void setjob(Job job){
    	  this.job = job;
      }
      public Job getjob(){
    	  return job;
      }
      
      public String toString(){
    	  return "jobName: "+jobName+"\naddress: "+job.getaddress()+"\nyearsOfWorking: "+job.getyearsOfWorking();
      }
}
