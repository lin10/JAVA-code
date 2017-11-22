package pers.learnmybatis.po;

public class Job {
	 private long jid;
     private String jname;
     private int number;
     private long create_at;
     private long update_at;
     
     public long getJid(){
    	 return jid;
     }
     public void setJid(long jid){
    	 this.jid = jid;
     } 
     public String getJname(){
    	 return jname;
     }
     public void setJname(String jname){
    	 this.jname = jname;
     }
     public int getNumber(){
    	 return number;
     }
     public void setNumber(int number){
    	 this.number = number;
     }
     public long getCreate_at(){
    	 return create_at;
     }
     public void setCreate_at(long create_at){
    	 this.create_at = create_at;
     }
     public long getUpdate_at(){
    	 return update_at;
     }
     public void setUpdate_at(long update_at){
    	 this.update_at = update_at;
     }
}
