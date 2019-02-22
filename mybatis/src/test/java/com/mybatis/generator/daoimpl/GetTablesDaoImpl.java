/**
 * 
 */
package com.mybatis.generator.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mybatis.generator.bean.ColumnStruct;
import com.mybatis.generator.bean.TableStruct;
import com.mybatis.generator.dao.GetTablesDao;
import com.mybatis.generator.tool.DataSourceUtil;
import com.mybatis.utils.Util;

/**
 * 获取数据表及其结构的dao层实现类
 * @author cuijianbin
 */
@SuppressWarnings("all")
public class GetTablesDaoImpl extends DataSourceUtil implements GetTablesDao {

	// 获得数据库的所有表名
	@Override
	public List getTablesName() {
		List tables = new ArrayList();
		String sql = "show tables";
		ResultSet rs = this.query(sql);
		try {
			while (rs.next()) {
				// 将获得的所有表名装进List
				tables.add(rs.getString(1));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return tables;
	}

	// 获得数据表中的字段名称、字段类型
	@Override
	public List getTablesStruct() {
		// 获得装有所有表名的List
		List tables = this.getTablesName();
		String sqls = null;
		// 装所有的表结构（表名+字段名称+字段类型）
		List tablesStruct = new ArrayList();
		for (int i = 0; i < tables.size(); i++) {
			String tableName = tables.get(i).toString();
			
			//调用生成注释的方法
			//List<String> columnComments = this.getColumnComments(tableName);
			
			sqls = "show columns from " + tableName;
			ResultSet rs = this.query(sqls);
			// 装所有的列结构(字段名称+字段类型)
			List list = new ArrayList();
			try {
				while (rs.next()) {
					ColumnStruct cs = new ColumnStruct(rs.getString(1), rs.getString(2),rs.getString(3));
					// 找到一列装进List
					list.add(cs);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			// 遍历完一张表，封装成对象
			TableStruct ts = new TableStruct(tables.get(i).toString(), list);
			// 将对象（一张表）装进集合
			tablesStruct.add(ts);
		}
		return tablesStruct;
	}
	
	/**
	 * 获取表中字段的所有注释
	 * 
	 * @param tableName
	 * @return
	 */
	private static final String SQL = "SELECT * FROM ";// 数据库操作
	public static List<String> getColumnComments(String tableName) {
		List<String> columnTypes = new ArrayList<>();
		// 与数据库的连接
		Connection conn = DataSourceUtil.getConnection();
		PreparedStatement pStemt = null;
		String tableSql = SQL + tableName;
		List<String> columnComments = new ArrayList<>();// 列名注释集合
		ResultSet rs = null;
		try {
			pStemt = conn.prepareStatement(tableSql);
			rs = pStemt.executeQuery("show full columns from " + tableName);
			while (rs.next()) {
				columnComments.add(rs.getString("Comment"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return columnComments;
	}
}
