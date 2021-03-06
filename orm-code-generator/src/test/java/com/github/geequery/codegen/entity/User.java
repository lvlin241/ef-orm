package com.github.geequery.codegen.entity;

import javax.persistence.Table;
import jef.database.DataObject;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Date;
import jef.codegen.support.NotModified;
/**
 * This class was generated by JEF according to the table in database.
 * You need to modify the type of primary key field, to the strategy your own.
 */
@NotModified
@Entity
@Table(name="user")
public class User extends DataObject{


	@Id
	@Column(name="id",columnDefinition="char(12)",length=12,nullable=false)
	private String id;

	@Column(name="email",columnDefinition="varchar(45)",length=45)
	private String email;

	@Column(name="createtime",columnDefinition="timestamp")
	private Date createtime;

	@Column(name="password",columnDefinition="char(32)",length=32)
	private String password;

	@Column(name="type",columnDefinition="varchar(5) default 'USER'",length=5)
	private String type;

	@Column(name="nickname",columnDefinition="varchar(30)",length=30)
	private String nickname;

	@Column(name="avatar",columnDefinition="varchar(200)",length=200)
	private String avatar;

	@Column(name="status",columnDefinition="char(10)",length=10)
	private String status;

	@Column(name="lastlogintime",columnDefinition="timestamp")
	private Date lastlogintime;

	public void setId(String obj){
		this.id = obj;
	}

	public String getId(){
		return id;
	}

	public void setEmail(String obj){
		this.email = obj;
	}

	public String getEmail(){
		return email;
	}

	public void setCreatetime(Date obj){
		this.createtime = obj;
	}

	public Date getCreatetime(){
		return createtime;
	}

	public void setPassword(String obj){
		this.password = obj;
	}

	public String getPassword(){
		return password;
	}

	public void setType(String obj){
		this.type = obj;
	}

	public String getType(){
		return type;
	}

	public void setNickname(String obj){
		this.nickname = obj;
	}

	public String getNickname(){
		return nickname;
	}

	public void setAvatar(String obj){
		this.avatar = obj;
	}

	public String getAvatar(){
		return avatar;
	}

	public void setStatus(String obj){
		this.status = obj;
	}

	public String getStatus(){
		return status;
	}

	public void setLastlogintime(Date obj){
		this.lastlogintime = obj;
	}

	public Date getLastlogintime(){
		return lastlogintime;
	}

	public User(){
	}

	public User(String id){
		this.id = id;
	}


   public enum Field implements jef.database.Field{id,email,createtime,password,type,nickname,avatar,status,lastlogintime}
}