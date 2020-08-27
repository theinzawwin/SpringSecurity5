package com.trustcore.security.dao;

import java.util.List;

import com.trustcore.security.model.LoginUser;
import com.trustcore.security.model.UserRole;

public interface IUserDao {
	public LoginUser findUserByUserName(String name);
	public void saveUser(LoginUser user);
	public List<UserRole> getUserRoles();
}
