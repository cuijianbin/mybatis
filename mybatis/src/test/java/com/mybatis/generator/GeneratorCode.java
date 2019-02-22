package com.mybatis.generator;


import com.mybatis.generator.dao.BeanAutoDao;
import com.mybatis.generator.dao.DaoAutoDao;
import com.mybatis.generator.dao.MapperXmlAutoDao;
import com.mybatis.generator.dao.ServiceAutoDao;
import com.mybatis.generator.dao.ServiceImplAutoDao;
import com.mybatis.generator.daoimpl.BeanAutoDaoImpl;
import com.mybatis.generator.daoimpl.DaoAutoDaoImpl;
import com.mybatis.generator.daoimpl.MapperXmlAutoDaoImpl;
import com.mybatis.generator.daoimpl.ServiceAutoDaoImpl;
import com.mybatis.generator.daoimpl.ServiceImplAutoDaoImpl;

/**
 * MyBatis的默认的注释生成器
 * @author cuijianbin
 */
public class GeneratorCode {
	
	/**
	 * 生成entity、mapper、mapper.xml、service入口
	 * @param args
	 */
	public static void main(String[] args) {
		GeneratorCode mr = new GeneratorCode();
		mr.generateCode();
		System.out.println("生成结束");
	}
	
	public void generateCode() {
		// 1.生成Bean实体类
		BeanAutoDao beanAuto = new BeanAutoDaoImpl();
		if (beanAuto.createBean()) {
			System.out.println("所有Entity实体类生成成功*_*");
		} else {
			System.out.println("所有Entity实体类生成失败");
		}
		// 2.生成Dao接口
		DaoAutoDao daoAuto = new DaoAutoDaoImpl();
		if (daoAuto.createDao()) {
			System.out.println("所有Dao接口生成成功*_*");
		} else {
			System.out.println("所有Dao接口生成失败");
		}
		// 3.生成Mapper.xml
		MapperXmlAutoDao mapperXmlAuto = new MapperXmlAutoDaoImpl();
		if (mapperXmlAuto.createMapperXml()) {
			System.out.println("所有Mapper.xml生成成功*_*");
		} else {
			System.out.println("所有Mapper.xml生成失败");
		}
		// 4.生成Service接口
		ServiceAutoDao serviceAuto = new ServiceAutoDaoImpl();
		if (serviceAuto.createService()) {
			System.out.println("所有Service接口生成成功*_*");
		} else {
			System.out.println("所有Service接口生成失败");
		}
		// 5.生成ServiceImpl实现类
		ServiceImplAutoDao serviceImplAuto = new ServiceImplAutoDaoImpl();
		if (serviceImplAuto.createServiceImpl()) {
			System.out.println("所有ServiceImpl实现类生成成功*_*");
		} else {
			System.out.println("所有ServiceImpl实现类生成失败");
		}
	}
}
