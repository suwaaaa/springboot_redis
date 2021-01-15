package suwaaaa.author.springboot_redis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("suwaaaa.author.springboot_redis.mapper")
public class SpringbootRedisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootRedisApplication.class, args);
	}

}
