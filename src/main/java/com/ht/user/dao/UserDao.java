package com.ht.user.dao;

import com.ht.htusers.entity.HTUser;

public interface UserDao {

	HTUser findByUserId(String userId);

}