package com.onlineEdu.content;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@EnableSwagger2Doc
@SpringBootApplication
@ComponentScan(basePackages = "com.onlineEdu")
@EnableFeignClients
public class ContentApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(ContentApiApplication.class, args);
    }
}
