package com.tiger;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.tiger.mapper")//将项目中对应的mapper类的路径加进来就可以了
@ComponentScan(basePackages={"com.tiger.controller","com.tiger.service"})
public class SrpingBootMybatis3Application {

	public static void main(String[] args) {
		SpringApplication.run(SrpingBootMybatis3Application.class, args);
	}
}