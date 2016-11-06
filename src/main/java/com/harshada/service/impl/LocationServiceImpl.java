package com.harshada.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.harshada.dao.LocationDao;
import com.harshada.model.Location;
import com.harshada.service.LocationService;

@Service
public class LocationServiceImpl implements LocationService {
//	@Autowired
//	private SmsServiceUserService smsServiceUserService;
	
	@Autowired
	private LocationDao LocationDao;
	

	@Transactional
	public void add(Location Location) {
		LocationDao.add(Location);
		
	}

	@Override
	public List<Location> getAllLocation() {
		return LocationDao.getAllLocation();
	}

}
