package suwaaaa.author.springboot_redis.config;

import java.util.ArrayList;

import org.springframework.boot.context.config.Profiles;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2      //  开启Swagger2
public class swaggerConfig {

	@Bean
	public Docket docket001() {
		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("分开组的文档");
	}
	
	@Bean		//  配置swagger的docker2的bean实例
	public Docket docket(Environment environment) {
		
		//  获取项目的环境
		org.springframework.core.env.Profiles profiles = org.springframework.core.env.Profiles.of("dev","pro");
		
		boolean booleaner = environment.acceptsProfiles(profiles);
		
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				.groupName("suwaaaa")     //  api分组的文档 m
				.enable(booleaner)
				.select()
				
				//  RequestHandlerSelectors配置需要扫描接口的方式
				//  .withMethodAnnotation(annotation)是扫描注解上面的方法
				//.apis(RequestHandlerSelectors.basePackage("suwaaaa.author.springboot_redis.controller"))
				//  .paths(selector)   表示过滤路径 
				.build()
			  	;
	}
	
	
	
	private ApiInfo apiInfo() {
		
		//作者信息
		springfox.documentation.service.Contact contact =  
				new springfox.documentation.service.Contact
				("suwaaaa", "https://github.com/suwaaaa/springboot_redis.git", "1264584869@qq.com");
		
		//配置swagger的信息== ApiInfo
		return new ApiInfo(
				"springboot-redis-swagger",
				"suwaaaa -- Api Documentation", 
				"verson 1.0", "urn:tos",
				contact, 
		          "Apache 2.0",
		          "http://www.apache.org/licenses/LICENSE-2.0", 
		          new ArrayList<VendorExtension>());
	}
	
}
