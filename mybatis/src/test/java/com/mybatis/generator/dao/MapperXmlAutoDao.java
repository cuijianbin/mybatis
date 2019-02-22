/**
 * 
 */
package com.mybatis.generator.dao;

/**
 * 生成Mapper.xml的dao层接口
 * @author cuijianbin
 */
public interface MapperXmlAutoDao {
	//通过表名、字段名称、字段类型创建Mapper.xml
	public boolean createMapperXml();
}
