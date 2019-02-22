package com.mybatis.entity;

import java.util.Date;

public class UserEntity{

	private	Integer	id;
	private	String	name;
	private	Date	birthday;
	private	Integer	gender;
	private	String	email;
	private	String	imgUrl;
	public	Integer	getId(){
		return	id;
	}
	public	String	getName(){
		return	name;
	}
	public	Date	getBirthday(){
		return	birthday;
	}
	public	Integer	getGender(){
		return	gender;
	}
	public	String	getEmail(){
		return	email;
	}
	public	String	getImgUrl(){
		return	imgUrl;
	}
	public void	setId(Integer id){
		this.id = id;
	}
	public void	setName(String name){
		this.name = name;
	}
	public void	setBirthday(Date birthday){
		this.birthday = birthday;
	}
	public void	setGender(Integer gender){
		this.gender = gender;
	}
	public void	setEmail(String email){
		this.email = email;
	}
	public void	setImgUrl(String imgUrl){
		this.imgUrl = imgUrl;
	}
	public	UserEntity(){
		super();
	}
	public UserEntity(Integer id,String name,Date birthday,Integer gender,String email,String imgUrl){
		super();
		this.id = id;
		this.name = name;
		this.birthday = birthday;
		this.gender = gender;
		this.email = email;
		this.imgUrl = imgUrl;
	}
}