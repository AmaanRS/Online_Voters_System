package com.springcore.pjdbc;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class StdDaoImpl implements StdDao {
	JdbcTemplate jdbcTemplate;

	public StdProp getStudent(int Id) {

		String uery = "select * from student where Id = ?";

		RowMapper<StdProp> rowMapper = new RowMap();

		StdProp stdprop = this.jdbcTemplate.queryForObject(uery, rowMapper, Id);

		return stdprop;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
