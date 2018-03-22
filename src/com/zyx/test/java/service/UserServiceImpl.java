package com.zyx.test.java.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.java.mapper.SysUser;
import com.java.mapper.SysUserMapper;

@Service
@Transactional
public class UserServiceImpl implements IUserService {

    @Autowired
    private SysUserMapper userDao;

    @Override
    public SysUser selectByPrimaryKey(Integer userId) {
        return userDao.selectByPrimaryKey(userId);
    }

	@Override
	public void save(SysUser user) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean update(SysUser user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public SysUser findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SysUser> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
