package suwaaaa.author.springboot_redis.dao;

import javax.annotation.Generated;
import org.apache.ibatis.annotations.Mapper;
import suwaaaa.author.springboot_redis.damain.User;

@Mapper
public interface UserMapper {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", comments = "Source Table: user")
	int deleteByPrimaryKey(Integer userid);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", comments = "Source Table: user")
	int insert(User record);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", comments = "Source Table: user")
	int insertSelective(User record);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", comments = "Source Table: user")
	User selectByPrimaryKey(Integer userid);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", comments = "Source Table: user")
	int updateByPrimaryKeySelective(User record);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", comments = "Source Table: user")
	int updateByPrimaryKey(User record);
}