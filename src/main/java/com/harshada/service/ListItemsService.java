package com.harshada.service;

import java.util.List;

import com.harshada.model.ListItems;

public interface ListItemsService {
	public void add(ListItems ListItems);
	public List<ListItems> getAllListItems();
	public List<ListItems> getItemsByListId(int listid);
	public void deleteItemsByListId(int updateid);
}
