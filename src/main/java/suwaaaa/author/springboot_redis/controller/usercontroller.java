package suwaaaa.author.springboot_redis.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import suwaaaa.author.springboot_redis.damain.User;
import suwaaaa.author.springboot_redis.service.UserService;

@RestController
@RequestMapping("/api/v1/user")
public class usercontroller {

	@Autowired
	private UserService userservice;

	
//	http://localhost:8081/api/v1/user/delete?userid=15
		
	@DeleteMapping("/delete")
	public int delect(int userid) {
		return userservice.deleteByPrimaryKey(userid);
	}

	
	
//	http://localhost:8081/api/v1/user/insertall?name=福嫂&address=广东省&phone=400823823&mail=2@qq.cpm&age=21&vip=0&userId=&passcode=123456
	
	@PostMapping("/insertall")
	public int insertall(User user) {
		user.setCreatTime(new Date());
		return userservice.insert(user);
	}

	
	
//	http://localhost:8081/api/v1/user/insertsome?name=宋鹏&phone=4006843&age=20&vip=1
		
	@PostMapping("insertsome")
	public int insert(@RequestBody User user) {
		user.setCreatTime(new Date());
		return userservice.insertSelective(user);
	}

	
//	http://localhost:8081/api/v1/user/selectone?userid=12
		
	@GetMapping("/selectone")
	public User select(int userid){
		return userservice.selectByPrimaryKey(userid);
	}

	
	
//	http://localhost:8081/api/v1/user/updatesome?address=山东省&mail=3@qq.cpm&passcode=12564869&name=康师傅&userid=15
		
	@PostMapping("/updatesome")
	public int update(User user) {
		user.setCreatTime(new Date());
		return userservice.updateByPrimaryKeySelective(user);
	}
	
	
	
//	  http://localhost:8081/api/v1/user/updateall?address=山东省&mail=3@qq.cpm&passcode=12564869&creat_time=1999-01-01&name=康师傅&passcode=456456456&vip=1&phone=0456879&userid=11&age=22
		
	@PostMapping("/updateall")
	public int updateall(User user) {
		user.setCreatTime(new Date());
		return userservice.updateByPrimaryKey(user);
	}
	
	
	
	
	
	
	
}
