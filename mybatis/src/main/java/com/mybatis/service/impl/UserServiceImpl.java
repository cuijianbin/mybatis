package com.mybatis.service.impl;

import com.mybatis.service.UserService;

import com.mybatis.entity.UserEntity;

import com.mybatis.mapper.UserDao;

import java.util.List;

public class UserServiceImpl	implements UserService{

	private UserDao	UserDao;

	public UserDao getUserDao(){
		return	UserDao;
	}

	public UserDao setUserDao(UserDao UserDao){
		return this.UserDao=UserDao;
	}

	//添加一条完整记录
	public int insertRecord(UserEntity record){
		return	UserDao.insertRecord(record);
	}

	//添加指定列的数据
	public int insertSelective(UserEntity record){
		return	UserDao.insertSelective(record);
	}

	//通过Id(主键)删除一条记录
	public int deleteById(Integer id){
		return	UserDao.deleteById(id);
	}

	//按Id(主键)修改指定列的值
	public int updateByIdSelective(UserEntity record){
		return	UserDao.updateByIdSelective(record);
	}

	//按Id(主键)修改指定列的值
	public int updateById(UserEntity record){
		return	UserDao.updateById(record);
	}

	//计算表中的总记录数
	public int countRecord(){
		return	UserDao.countRecord();
	}

	//根据条件计算记录条数
	public int countSelective(UserEntity record){
		return	UserDao.countSelective(record);
	}

	//获得表中的最大Id
	public int maxId(){
		return	UserDao.maxId();
	}

	//通过Id(主键)查询一条记录
	public	UserEntity	selectById(Integer	id){
		return	UserDao.selectById(id);
	}

	//查询所有记录
	public List selectAll(){
		return	UserDao.selectAll();
	}


}