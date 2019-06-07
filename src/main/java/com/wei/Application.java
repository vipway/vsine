package com.wei;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author Jiawei.Mao
 * @date 2019/06/07 09:42
 */
@SpringBootApplication

@tk.mybatis.spring.annotation.MapperScan("com.wei.mapper")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
