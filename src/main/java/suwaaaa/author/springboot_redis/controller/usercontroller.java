package suwaaaa.author.springboot_redis.controller;

import java.util.Map;

import org.mybatis.dynamic.sql.SqlTable;
import org.mybatis.dynamic.sql.delete.DeleteModel;
import org.mybatis.dynamic.sql.delete.DeleteModel.Builder;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Template;

import sun.tools.serialver.resources.serialver;
import suwaaaa.author.springboot_redis.dao.UserDynamicSqlSupport;
import suwaaaa.author.springboot_redis.dao.UserDynamicSqlSupport.User;
import suwaaaa.author.springboot_redis.service.UserService;

@RestController
@RequestMapping("/api/v1/user")
public class usercontroller {

	@Autowired
	private UserService userservice;

	@DeleteMapping("/delect/{userid}")
	public int delect(int userid) {
		
		return userservice.deleteByPrimaryKey(userid);
	}

	@PostMapping("/insertall")
	public int insertall(suwaaaa.author.springboot_redis.damain.User record) {

		return userservice.insert(record);
	}

	@PostMapping("insertsome")
	public int insert(suwaaaa.author.springboot_redis.damain.User record) {

		return userservice.insertSelective(record);
	}

	@GetMapping("/selectone/{userid}")
	public suwaaaa.author.springboot_redis.damain.User select(int userid){
		
		return userservice.selectByPrimaryKey(userid);
	}

	@PostMapping("/updatesome")
	public int update(suwaaaa.author.springboot_redis.damain.User user) {
		
		return userservice.updateByPrimaryKeySelective(user);
	}
	
	@PostMapping("/updateall")
	public int updateall(suwaaaa.author.springboot_redis.damain.User user) {
		
		return userservice.updateByPrimaryKey(user);
	}
	
	
	
	
	
	
	
}
