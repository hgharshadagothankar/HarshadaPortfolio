package com.harshada.service;

import java.util.List;

import com.harshada.model.Location;

public interface LocationService {
	public void add(Location Location);
	public List<Location> getAllLocation();
}
