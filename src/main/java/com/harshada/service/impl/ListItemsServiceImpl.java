package com.harshada.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.harshada.dao.ListItemsDao;
import com.harshada.model.ListItems;
import com.harshada.service.ListItemsService;

@Service
public class ListItemsServiceImpl implements ListItemsService {
//	@Autowired
//	private SmsServiceUserService smsServiceUserService;
	
	@Autowired
	private ListItemsDao ListItemsDao;
	

	@Transactional
	public void add(ListItems ListItems) {
		ListItemsDao.add(ListItems);
	}

	@Override
	public List<ListItems> getAllListItems() {
		return ListItemsDao.getAllListItems();
	}

	@Override
	public List<ListItems> getItemsByListId(int listid) {
		return ListItemsDao.getItemsByListId(listid);

	}

	@Override
	public void deleteItemsByListId(int updateid) {
		ListItemsDao.deleteItemsByListId(updateid);
	}

}
