package suwaaaa.author.springboot_redis.damain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

import java.util.Date;

import javax.annotation.Generated;

/**
 * 在末尾加入数据库执行的SQL语句
 * 
 * Class Name: User.java Description:
 * 
 * @author suwaaaa DateTime 2021�??????1�??????12�?????? 下午8:55:50
 * @email 1264584869@qq.com
 * @version 1.0
 */
//@Data
public class User {
	

	
	  private Integer userid;
	  
	  private Integer age;
	  
	  @JsonInclude(Include.NON_NULL)
	  private String name;
	  
	  private String address;
	  
	  @JsonInclude(Include.NON_NULL)
	  @JsonIgnore
	  @JsonProperty("passcode")
	  private String passcode;
	  
	  @JsonInclude(Include.NON_NULL)
	  private Integer phone;
	  
	  private String mail;
	  
	  private Boolean vip;
	  
	  @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss", locale = "zh", timezone ="GMT+8")
	  private Date creatTime;

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPasscode() {
		return passcode;
	}

	public void setPasscode(String passcode) {
		this.passcode = passcode;
	}

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public Boolean getVip() {
		return vip;
	}

	public void setVip(Boolean vip) {
		this.vip = vip;
	}

	public Date getCreatTime() {
		return creatTime;
	}

	public void setCreatTime(Date creatTime) {
		this.creatTime = creatTime;
	}
	 
	  





	

	
	
	/*
	 * private Integer userid;
	 * 
	 * private Integer age;
	 * 
	 * @JsonInclude(Include.NON_NULL) private Integer name;
	 * 
	 * private Integer address;
	 * 
	 * @JsonIgnore
	 * 
	 * @JsonInclude(Include.NON_NULL)
	 * 
	 * @JsonProperty("passcode") private Integer passcode;
	 * 
	 * @JsonInclude(Include.NON_NULL) private Integer phone;
	 * 
	 * private Integer mail;
	 * 
	 * private Boolean vip;
	 * 
	 * @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss", locale = "zh", timezone
	 * ="GMT+8") private Date creatTime;
	 * 
	 */

	/*
	 * 编写SQL语句
	 * 
	 * CREATE TABLE `user` ( `userId` int(11) NOT NULL AUTO_INCREMENT COMMENT
	 * '用户ID', `age` int(11)  COMMENT '用户年龄', `name` varchar(255) NOT NULL
	 * DEFAULT '' COMMENT '用户名称', `address` varchar(255)  DEFAULT '' COMMENT
	 * '用户地址', `passcode` varchar(255) NOT NULL DEFAULT '' COMMENT '用户密码', `phone`
	 * int(11) NOT NULL COMMENT '用户手机�??????', `mail` varchar(255) DEFAULT ''
	 * COMMENT '用户邮箱', `vip` BOOLEAN COMMENT '用户vip', `creat_time` int(20)
	 * COMMENT '用户创建时间', PRIMARY KEY (`userId`) ) ENGINE=InnoDB AUTO_INCREMENT=10
	 * DEFAULT CHARSET=utf8;
	 */

}
