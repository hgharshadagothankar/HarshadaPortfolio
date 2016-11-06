package com.harshada.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.harshada.dao.ToDoListDao;
import com.harshada.model.ToDoList;
import com.harshada.service.ToDoListService;

@Service
public class ToDoListServiceImpl implements ToDoListService {
//	@Autowired
//	private SmsServiceUserService smsServiceUserService;
	
	@Autowired
	private ToDoListDao ToDoListDao;
	

	@Transactional
	public void add(ToDoList ToDoList) {
		ToDoListDao.add(ToDoList);
	}

	@Override
	public List<ToDoList> getAllToDoList() {
		return ToDoListDao.getAllToDoList();
	}

	@Override
	public List<ToDoList> getListById(int listid) {
		return ToDoListDao.getListById(listid);

	}

	@Transactional
	public void deleteToDoListById(int updateid) {
		ToDoListDao.deleteToDoListById(updateid);		
	}

}
