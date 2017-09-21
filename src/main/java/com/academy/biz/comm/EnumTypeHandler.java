package com.academy.biz.comm;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import com.academy.biz.student.service.Grade;

public class EnumTypeHandler implements TypeHandler<Grade> {
	// DB Write
	@Override
	public void setParameter(PreparedStatement ps, int i, Grade parameter, JdbcType jdbcType) throws SQLException {
	}
	
	// DB Read
	@Override
	public Grade getResult(ResultSet rs, String columnName) throws SQLException {
		int iValue = rs.getInt(columnName);
		return null;
	}

	/* (non-Javadoc)
	 * @see org.apache.ibatis.type.TypeHandler#getResult(java.sql.ResultSet, int)
	 */
	@Override
	public Grade getResult(ResultSet rs, int columnIndex) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.apache.ibatis.type.TypeHandler#getResult(java.sql.CallableStatement, int)
	 */
	@Override
	public Grade getResult(CallableStatement cs, int columnIndex) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
