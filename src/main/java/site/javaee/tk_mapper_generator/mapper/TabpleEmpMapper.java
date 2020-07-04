package site.javaee.tk_mapper_generator.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import site.javaee.tk_mapper_generator.pojo.TabpleEmp;
import site.javaee.tk_mapper_generator.pojo.TabpleEmpExample;
import tk.mybatis.mapper.common.Mapper;

public interface TabpleEmpMapper extends Mapper<TabpleEmp> {
    long countByExample(TabpleEmpExample example);

    int deleteByExample(TabpleEmpExample example);

    List<TabpleEmp> selectByExample(TabpleEmpExample example);

    int updateByExampleSelective(@Param("record") TabpleEmp record, @Param("example") TabpleEmpExample example);

    int updateByExample(@Param("record") TabpleEmp record, @Param("example") TabpleEmpExample example);
}