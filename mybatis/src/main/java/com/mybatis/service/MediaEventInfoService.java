package com.mybatis.service;

import com.mybatis.entity.MediaEventInfoEntity;

import java.util.List;

public interface MediaEventInfoService{

	public int insertRecord(MediaEventInfoEntity record);//添加一条完整记录

	public int insertSelective(MediaEventInfoEntity record);//添加指定列的数据

	public int deleteById(Integer meid);//通过Id(主键)删除一条记录

	public int updateByIdSelective(MediaEventInfoEntity record);//按Id(主键)修改指定列的值

	public int updateById(MediaEventInfoEntity record);//按Id(主键)修改指定列的值

	public int countRecord();//计算表中的总记录数

	public int countSelective(MediaEventInfoEntity record);//根据条件计算记录条数

	public int maxId();//获得表中的最大Id

	public	MediaEventInfoEntity	selectById(Integer	meid);//通过Id(主键)查询一条记录

	public List selectAll();//查询所有记录


}