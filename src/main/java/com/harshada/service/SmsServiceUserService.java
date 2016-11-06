package com.harshada.service;

import java.util.List;

import com.harshada.model.SmsServiceUser;

public interface SmsServiceUserService {
	public void add(SmsServiceUser student);
	public void edit(SmsServiceUserService student);
	public List<SmsServiceUser> getAllUsers();
}
