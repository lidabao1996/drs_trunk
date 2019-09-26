package com.kingyee.drs_trunk;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.kingyee.drs_trunk.*.mapper")
public class DrsTrunkApplication {

    public static void main(String[] args) {
        SpringApplication.run(DrsTrunkApplication.class, args);
    }

}
