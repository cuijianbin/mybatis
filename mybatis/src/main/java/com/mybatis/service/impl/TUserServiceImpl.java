package com.mybatis.service.impl;

import com.mybatis.service.TUserService;

import com.mybatis.entity.TUserEntity;

import com.mybatis.mapper.TUserDao;

import java.util.List;

public class TUserServiceImpl	implements TUserService{

	private TUserDao	TUserDao;

	public TUserDao getTUserDao(){
		return	TUserDao;
	}

	public TUserDao setTUserDao(TUserDao TUserDao){
		return this.TUserDao=TUserDao;
	}

	//添加一条完整记录
	public int insertRecord(TUserEntity record){
		return	TUserDao.insertRecord(record);
	}

	//添加指定列的数据
	public int insertSelective(TUserEntity record){
		return	TUserDao.insertSelective(record);
	}

	//通过Id(主键)删除一条记录
	public int deleteById(Integer USERID){
		return	TUserDao.deleteById(USERID);
	}

	//按Id(主键)修改指定列的值
	public int updateByIdSelective(TUserEntity record){
		return	TUserDao.updateByIdSelective(record);
	}

	//按Id(主键)修改指定列的值
	public int updateById(TUserEntity record){
		return	TUserDao.updateById(record);
	}

	//计算表中的总记录数
	public int countRecord(){
		return	TUserDao.countRecord();
	}

	//根据条件计算记录条数
	public int countSelective(TUserEntity record){
		return	TUserDao.countSelective(record);
	}

	//获得表中的最大Id
	public int maxId(){
		return	TUserDao.maxId();
	}

	//通过Id(主键)查询一条记录
	public	TUserEntity	selectById(Integer	USERID){
		return	TUserDao.selectById(USERID);
	}

	//查询所有记录
	public List selectAll(){
		return	TUserDao.selectAll();
	}


}