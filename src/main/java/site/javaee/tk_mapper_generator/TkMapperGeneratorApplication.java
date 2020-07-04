package site.javaee.tk_mapper_generator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan(basePackages = "site.javaee.tk_mapper_generator.mapper")
@SpringBootApplication
public class TkMapperGeneratorApplication {

    public static void main(String[] args) {
        SpringApplication.run(TkMapperGeneratorApplication.class, args);
    }

}
