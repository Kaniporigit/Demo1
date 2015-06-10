package com.ht.user.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ht.htusers.entity.HTUser;

@Repository
public class UserDaoImpl implements UserDao {
	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public HTUser findByUserId(String userId) {

		List<HTUser> users = new ArrayList<HTUser>();

		users = sessionFactory.getCurrentSession()
				.createQuery("from htUser where userid=?")
				.setParameter(0, userId).list();

		HTUser result = null;
		if (users.size() > 0) {
			result = users.get(0);
		}

		return result;
	}

}
