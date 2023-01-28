package springmvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import springmvc.model.User;

@Repository
public class UserDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	public int saveUser(User user) {
		int a = (Integer) this.hibernateTemplate.save(user);
		return a;
	}

}