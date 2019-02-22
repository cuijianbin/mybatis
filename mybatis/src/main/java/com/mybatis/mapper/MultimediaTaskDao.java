package com.mybatis.mapper;

import	com.mybatis.entity.MultimediaTaskEntity;

import java.util.List;

public interface MultimediaTaskDao{

	public int insertRecord(MultimediaTaskEntity record);//添加一条完整记录

	public int insertSelective(MultimediaTaskEntity record);//添加指定列的数据

	public int deleteById(Integer mtid);//通过Id(主键)删除一条记录

	public int updateByIdSelective(MultimediaTaskEntity record);//按Id(主键)修改指定列的值

	public int updateById(MultimediaTaskEntity record);//按Id(主键)修改指定列的值

	public int countRecord();//计算表中的总记录数

	public int countSelective(MultimediaTaskEntity record);//根据条件计算记录条数

	public int maxId();//获得表中的最大Id

	public	MultimediaTaskEntity	selectById(Integer	mtid);//通过Id(主键)查询一条记录

	public List selectAll();//查询所有记录


}