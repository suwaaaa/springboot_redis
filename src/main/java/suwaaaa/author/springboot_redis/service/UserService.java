package suwaaaa.author.springboot_redis.service;

import org.springframework.stereotype.Repository;
import suwaaaa.author.springboot_redis.damain.User;

@Repository
public interface UserService {
	
	
	int deleteByPrimaryKey(Integer userid);

	int insert(User record);

	int insertSelective(User record);

	User selectByPrimaryKey(Integer userid);

	int updateByPrimaryKeySelective(User record);

	int updateByPrimaryKey(User record);
	
}