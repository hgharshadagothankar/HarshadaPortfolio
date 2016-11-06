package com.harshada.service;

import java.util.List;

import com.harshada.model.ToDoList;

public interface ToDoListService {
	public void add(ToDoList ToDoList);
	public List<ToDoList> getAllToDoList();
	public List<ToDoList> getListById(int listid);
	public void deleteToDoListById(int updateid);
}
