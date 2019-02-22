package com.mybatis.service.impl;

import com.mybatis.service.MediaEventKeywordsService;

import com.mybatis.entity.MediaEventKeywordsEntity;

import com.mybatis.mapper.MediaEventKeywordsDao;

import java.util.List;

public class MediaEventKeywordsServiceImpl	implements MediaEventKeywordsService{

	private MediaEventKeywordsDao	MediaEventKeywordsDao;

	public MediaEventKeywordsDao getMediaEventKeywordsDao(){
		return	MediaEventKeywordsDao;
	}

	public MediaEventKeywordsDao setMediaEventKeywordsDao(MediaEventKeywordsDao MediaEventKeywordsDao){
		return this.MediaEventKeywordsDao=MediaEventKeywordsDao;
	}

	//添加一条完整记录
	public int insertRecord(MediaEventKeywordsEntity record){
		return	MediaEventKeywordsDao.insertRecord(record);
	}

	//添加指定列的数据
	public int insertSelective(MediaEventKeywordsEntity record){
		return	MediaEventKeywordsDao.insertSelective(record);
	}

	//通过Id(主键)删除一条记录
	public int deleteById(Integer mkid){
		return	MediaEventKeywordsDao.deleteById(mkid);
	}

	//按Id(主键)修改指定列的值
	public int updateByIdSelective(MediaEventKeywordsEntity record){
		return	MediaEventKeywordsDao.updateByIdSelective(record);
	}

	//按Id(主键)修改指定列的值
	public int updateById(MediaEventKeywordsEntity record){
		return	MediaEventKeywordsDao.updateById(record);
	}

	//计算表中的总记录数
	public int countRecord(){
		return	MediaEventKeywordsDao.countRecord();
	}

	//根据条件计算记录条数
	public int countSelective(MediaEventKeywordsEntity record){
		return	MediaEventKeywordsDao.countSelective(record);
	}

	//获得表中的最大Id
	public int maxId(){
		return	MediaEventKeywordsDao.maxId();
	}

	//通过Id(主键)查询一条记录
	public	MediaEventKeywordsEntity	selectById(Integer	mkid){
		return	MediaEventKeywordsDao.selectById(mkid);
	}

	//查询所有记录
	public List selectAll(){
		return	MediaEventKeywordsDao.selectAll();
	}


}