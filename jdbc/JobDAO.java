package blog;

public interface JobDAO {
      public int insert(String jname,int number,long create_at,long update_at);
      public int update(String jname,int number);
      public int delete(String jname);
      public void select(String jname);
}
