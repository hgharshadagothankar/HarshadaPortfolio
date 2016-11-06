package com.harshada.dao;

import java.util.List;

import com.harshada.model.ToDoList;

public interface ToDoListDao {
	public void add(ToDoList todolist);
	public ToDoList getToDoList(int id);
	public List<ToDoList> getAllToDoList();
	public List<ToDoList> getListById(int listid);
	public void deleteToDoListById(int updateid);
}
