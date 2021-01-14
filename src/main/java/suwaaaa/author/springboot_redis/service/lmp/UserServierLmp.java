package suwaaaa.author.springboot_redis.service.lmp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import suwaaaa.author.springboot_redis.damain.User;
import suwaaaa.author.springboot_redis.dao.UserMapper;
import suwaaaa.author.springboot_redis.service.UserService;

@Service
public class UserServierLmp {

	@Autowired
	private UserMapper userMapper;
	
	
	int deleteByPrimaryKey(Integer userid) {
		return userMapper.deleteByPrimaryKey(userid);
	}

	
	int insert(User record) {
		return userMapper.insert(record);
	}

	
	int insertSelective(User record) {
		return userMapper.insertSelective(record);
	}

	
	User selectByPrimaryKey(Integer userid) {
		return userMapper.selectByPrimaryKey(userid);
	}

	
	int updateByPrimaryKeySelective(User record) {
		return userMapper.updateByPrimaryKeySelective(record);
	}

	
	int updateByPrimaryKey(User record) {
		return userMapper.updateByPrimaryKey(record);
	}
	
}
