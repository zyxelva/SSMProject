package com.zyx.test.java.service;

import java.util.List;

import com.java.mapper.SysUser;

public interface IUserService {

	SysUser selectByPrimaryKey(Integer userId);
	void save(SysUser user);
	boolean update(SysUser user);
	boolean delete(int id);
	SysUser findById(int id);
	List<SysUser> findAll();
}
