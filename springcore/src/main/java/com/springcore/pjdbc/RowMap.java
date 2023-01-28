package com.springcore.pjdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class RowMap implements RowMapper<StdProp> {

	public StdProp mapRow(ResultSet rs, int rowNum) throws SQLException {

		StdProp s = new StdProp();
		s.setId(rs.getInt(1));
		s.setName(rs.getString(2));
		s.setRollno(rs.getInt(3));

		return s;
	}

}
