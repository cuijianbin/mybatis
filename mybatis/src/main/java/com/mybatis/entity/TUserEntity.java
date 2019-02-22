package com.mybatis.entity;

public class TUserEntity{

	private	Integer	USERID;
	private	String	USERNAME;
	private	String	USERPASSWORD;
	public	Integer	getUSERID(){
		return	USERID;
	}
	public	String	getUSERNAME(){
		return	USERNAME;
	}
	public	String	getUSERPASSWORD(){
		return	USERPASSWORD;
	}
	public void	setUSERID(Integer USERID){
		this.USERID = USERID;
	}
	public void	setUSERNAME(String USERNAME){
		this.USERNAME = USERNAME;
	}
	public void	setUSERPASSWORD(String USERPASSWORD){
		this.USERPASSWORD = USERPASSWORD;
	}
	public	TUserEntity(){
		super();
	}
	public TUserEntity(Integer USERID,String USERNAME,String USERPASSWORD){
		super();
		this.USERID = USERID;
		this.USERNAME = USERNAME;
		this.USERPASSWORD = USERPASSWORD;
	}
}