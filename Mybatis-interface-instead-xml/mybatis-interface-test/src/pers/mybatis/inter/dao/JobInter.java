package pers.mybatis.inter.dao;
import org.apache.ibatis.annotations.Select;
import pers.mybatis.inter.model.*;
public interface JobInter {
	    @Select("select * from yl_job where jid = #{jid}")
         public Job getJobByid(long jid);
}
