package com.cts.training.sample.daoimp;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.cts.training.sample.dao.UserDao;
import com.cts.training.sample.model.User;

public class UserDaoImp implements UserDao
{
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public boolean saveUser(User user) {
		String query="insert into user values(?,?,?)";
		try
		{
			jdbcTemplate.update(query,user.getId(),
			user.getName(),
			user.getAddress());
			return true;
		}
		catch(DataAccessException e)
		{
			e.printStackTrace();
		   return false;
	    }
	}

	public boolean UpdateUser(User user) {
		String query = "update user set  name=?, address=? where id =?";
				try {
				jdbcTemplate.update(query, user.getName(),user.getAddress());
				return true;
				}
				catch (DataAccessException e) {
				e.printStackTrace();
		return false;
	}
	}

	public boolean deleteUser(User user) {
		String query="delete from user where id=?";
		try {
			jdbcTemplate.update(query,user.getId());
			return true;
		}
		catch(DataAccessException e)
		{
			e.printStackTrace();
		return false;
		}
		}

	public User getUserById(int id) {
		String query="select *from user where id=?";
		RowMapper<User> rowMapper = new BeanPropertyRowMapper<User>();
		return jdbcTemplate.queryForObject(query, rowMapper, id);
	}

	public List<User> getAllUsers() {
		return null;
	}

}
