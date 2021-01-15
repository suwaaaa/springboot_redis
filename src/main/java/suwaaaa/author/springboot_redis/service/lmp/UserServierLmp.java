package suwaaaa.author.springboot_redis.service.lmp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import suwaaaa.author.springboot_redis.damain.User;
import suwaaaa.author.springboot_redis.mapper.UserMapper;
import suwaaaa.author.springboot_redis.service.UserService;

@Service
public class UserServierLmp implements UserService{

	@Autowired
	private UserMapper userMapper;
	
	
	public int deleteByPrimaryKey(Integer userid) {
		return userMapper.deleteByPrimaryKey(userid);
	}

	
	public int insert(User record) {
		return userMapper.insert(record);
	}

	
	public int insertSelective(User record) {
		return userMapper.insertSelective(record);
	}

	
	public User selectByPrimaryKey(Integer userid) {
		return userMapper.selectByPrimaryKey(userid);
	}

	
	public int updateByPrimaryKeySelective(User record) {
		return userMapper.updateByPrimaryKeySelective(record);
	}

	
	public int updateByPrimaryKey(User record) {
		return userMapper.updateByPrimaryKey(record);
	}
	
}
