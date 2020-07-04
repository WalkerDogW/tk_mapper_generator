package site.javaee.tk_mapper_generator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import site.javaee.tk_mapper_generator.mapper.TabpleEmpMapper;
import site.javaee.tk_mapper_generator.pojo.TabpleEmp;

import java.util.List;

@SpringBootTest
class TkMapperGeneratorApplicationTests {

    @Autowired
    TabpleEmpMapper empMapper;

    @Test
    void contextLoads() {
        List<TabpleEmp> emps = empMapper.selectAll();
        System.out.println(emps);


    }

}
