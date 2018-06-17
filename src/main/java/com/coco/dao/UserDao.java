package com.coco.dao;

import org.springframework.stereotype.Repository;

import com.coco.model.User;

public interface UserDao {

	public User findById(int id);
}
