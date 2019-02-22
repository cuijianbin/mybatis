/**
 * 
 */
package com.mybatis.generator.dao;

/**
 * 生成Bean实体类的dao层接口
 * @author cuijianbin
 */
public interface BeanAutoDao {
	//通过表名、字段名称、字段类型创建Bean实体
	public boolean createBean();
}
