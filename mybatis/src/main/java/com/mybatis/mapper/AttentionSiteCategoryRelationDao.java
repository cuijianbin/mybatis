package com.mybatis.mapper;

import	com.mybatis.entity.AttentionSiteCategoryRelationEntity;

import java.util.List;

public interface AttentionSiteCategoryRelationDao{

	public int insertRecord(AttentionSiteCategoryRelationEntity record);//添加一条完整记录

	public int insertSelective(AttentionSiteCategoryRelationEntity record);//添加指定列的数据

	public int deleteById(Integer id);//通过Id(主键)删除一条记录

	public int updateByIdSelective(AttentionSiteCategoryRelationEntity record);//按Id(主键)修改指定列的值

	public int updateById(AttentionSiteCategoryRelationEntity record);//按Id(主键)修改指定列的值

	public int countRecord();//计算表中的总记录数

	public int countSelective(AttentionSiteCategoryRelationEntity record);//根据条件计算记录条数

	public int maxId();//获得表中的最大Id

	public	AttentionSiteCategoryRelationEntity	selectById(Integer	id);//通过Id(主键)查询一条记录

	public List selectAll();//查询所有记录


}