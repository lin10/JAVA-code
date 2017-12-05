package pers.onezero.qiyi;

public class Job {
	private String name;
	private String company;
	private int number;
	/**4.1.0之后版本传入参数后默认注入排在前面的构造方法**/
	public Job(String name, int number, String company){
		this.name = name;
		this.number = number;
		this.company = company;
	}
	
	public Job(String name, String company, int number){
		this.name = name;
		this.company = company;
		this.number = number;
	}
    
	
	
	public String toString(){
		return "name: "+name+"\ncompany: "+company+"\nnumber: "+number;
	}
}
