package com.java.mapper;

import java.util.List;


public interface UserMapper {

	void save(SysUser user);
	boolean update(SysUser user);
	boolean delete(int id);
	SysUser findById(int id);
	List<SysUser> findAll();
}
