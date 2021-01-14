package suwaaaa.author.springboot_redis.damain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;
import javax.annotation.Generated;

/**
 * 在末尾加入数据库执行的SQL语句
 * 
 * Class Name: User.java Description:
 * 
 * @author suwaaaa DateTime 2021�???1�???12�??? 下午8:55:50
 * @email 1264584869@qq.com
 * @version 1.0
 */
@Data
public class User {

	
	
	/*
	 * private int userId;
	 * 
	 * private String address;
	 * 
	 * @JsonInclude(Include.NON_NULL) 
	 * private Object phone;
	 * 
	 * private String mail;
	 * 
	 * @JsonInclude(Include.NON_NULL) 
	 * private String name;
	 * 
	 * private String age;
	 * 
	 * private boolean vip;
	 */
	  
	  private Integer userid;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", comments = "Source field: user.age")
	private Integer age;

	@JsonInclude(Include.NON_NULL)
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", comments = "Source field: user.name")
	private String name;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", comments = "Source field: user.address")
	private String address;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", comments = "Source field: user.passcode")
	private String passcode;

	@JsonInclude(Include.NON_NULL)
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", comments = "Source field: user.phone")
	private Integer phone;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", comments = "Source field: user.mail")
	private String mail;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", comments = "Source field: user.vip")
	private Boolean vip;

	private Integer creatTime;

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", comments = "Source field: user.age")
	public Integer getAge() {
		return age;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", comments = "Source field: user.age")
	public void setAge(Integer age) {
		this.age = age;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", comments = "Source field: user.name")
	public String getName() {
		return name;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", comments = "Source field: user.name")
	public void setName(String name) {
		this.name = name;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", comments = "Source field: user.address")
	public String getAddress() {
		return address;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", comments = "Source field: user.address")
	public void setAddress(String address) {
		this.address = address;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", comments = "Source field: user.passcode")
	public String getPasscode() {
		return passcode;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", comments = "Source field: user.passcode")
	public void setPasscode(String passcode) {
		this.passcode = passcode;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", comments = "Source field: user.phone")
	public Integer getPhone() {
		return phone;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", comments = "Source field: user.phone")
	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", comments = "Source field: user.mail")
	public String getMail() {
		return mail;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", comments = "Source field: user.mail")
	public void setMail(String mail) {
		this.mail = mail;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", comments = "Source field: user.vip")
	public Boolean getVip() {
		return vip;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", comments = "Source field: user.vip")
	public void setVip(Boolean vip) {
		this.vip = vip;
	}

	public Integer getCreatTime() {
		return creatTime;
	}

	public void setCreatTime(Integer creatTime) {
		this.creatTime = creatTime;
	}

	@JsonProperty("passcode")
	  
	  @JsonIgnore private String password;
	  
	  @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss", locale = "zh", timezone =
	  "GMT+8") private String creat_time;
	 
	 

	/*
	 * 编写SQL语句
	 * 
	 * CREATE TABLE `user` ( `userId` int(11) NOT NULL AUTO_INCREMENT COMMENT
	 * '用户ID', `age` int(11) NOT NULL COMMENT '用户年龄', `name` char(20) NOT NULL
	 * DEFAULT '' COMMENT '用户名称', `address` varchar(255) NOT NULL DEFAULT '' COMMENT
	 * '用户地址', `passcode` varchar(255) NOT NULL DEFAULT '' COMMENT '用户密码', `phone`
	 * int(11) NOT NULL COMMENT '用户手机�???', `mail` varchar(255) NOT NULL DEFAULT ''
	 * COMMENT '用户邮箱', `vip` BOOLEAN COMMENT '用户vip', `creat_time` int(20) NOT NULL
	 * COMMENT '用户创建时间', PRIMARY KEY (`userId`) ) ENGINE=InnoDB AUTO_INCREMENT=10
	 * DEFAULT CHARSET=utf8;
	 */

}
