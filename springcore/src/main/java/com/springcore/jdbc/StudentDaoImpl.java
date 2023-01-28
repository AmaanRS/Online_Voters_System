package com.springcore.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class StudentDaoImpl implements StudentDao {

	private JdbcTemplate jdbcTemplate;

	public int insert(Student student) {

		String query = "insert into student values (?,?,?)";

		int update = this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getRollno());

		return update;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int chnge(Student student) {

		String query = "update student set name=?,rollno=? where Id=?";

		int update = this.jdbcTemplate.update(query, student.getName(), student.getRollno(), student.getId());

		return update;

	}

	public Student getStudent(int Id) {

		String query = "select * from student where Id=?";

		RowMapper<Student> rowMapper = new row();

		Student m = this.jdbcTemplate.queryForObject(query, rowMapper, Id);

		return m;
	}

	public List<Student> getAllStudent() {

		String query = "select * from student";

		RowMapper<Student> rowMapper = new row();

		List<Student> m = this.jdbcTemplate.query(query, rowMapper);

		return m;

	}

}
