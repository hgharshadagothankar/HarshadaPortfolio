package com.harshada.dao;

import java.util.List;

import com.harshada.model.SmsServiceUser;

public interface SmsServiceUserDao {
	public void add(SmsServiceUser user);
	public void edit(SmsServiceUser user);
	public List<SmsServiceUser> getAllUsers();
}
