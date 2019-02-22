package com.mybatis.service.impl;

import com.mybatis.service.MediaEventInfoService;

import com.mybatis.entity.MediaEventInfoEntity;

import com.mybatis.mapper.MediaEventInfoDao;

import java.util.List;

public class MediaEventInfoServiceImpl	implements MediaEventInfoService{

	private MediaEventInfoDao	MediaEventInfoDao;

	public MediaEventInfoDao getMediaEventInfoDao(){
		return	MediaEventInfoDao;
	}

	public MediaEventInfoDao setMediaEventInfoDao(MediaEventInfoDao MediaEventInfoDao){
		return this.MediaEventInfoDao=MediaEventInfoDao;
	}

	//添加一条完整记录
	public int insertRecord(MediaEventInfoEntity record){
		return	MediaEventInfoDao.insertRecord(record);
	}

	//添加指定列的数据
	public int insertSelective(MediaEventInfoEntity record){
		return	MediaEventInfoDao.insertSelective(record);
	}

	//通过Id(主键)删除一条记录
	public int deleteById(Integer meid){
		return	MediaEventInfoDao.deleteById(meid);
	}

	//按Id(主键)修改指定列的值
	public int updateByIdSelective(MediaEventInfoEntity record){
		return	MediaEventInfoDao.updateByIdSelective(record);
	}

	//按Id(主键)修改指定列的值
	public int updateById(MediaEventInfoEntity record){
		return	MediaEventInfoDao.updateById(record);
	}

	//计算表中的总记录数
	public int countRecord(){
		return	MediaEventInfoDao.countRecord();
	}

	//根据条件计算记录条数
	public int countSelective(MediaEventInfoEntity record){
		return	MediaEventInfoDao.countSelective(record);
	}

	//获得表中的最大Id
	public int maxId(){
		return	MediaEventInfoDao.maxId();
	}

	//通过Id(主键)查询一条记录
	public	MediaEventInfoEntity	selectById(Integer	meid){
		return	MediaEventInfoDao.selectById(meid);
	}

	//查询所有记录
	public List selectAll(){
		return	MediaEventInfoDao.selectAll();
	}


}