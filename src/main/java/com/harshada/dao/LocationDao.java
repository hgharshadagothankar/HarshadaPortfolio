package com.harshada.dao;

import java.util.List;

import com.harshada.model.Location;

public interface LocationDao {
	public void add(Location student);
	public Location getLocation(int id);
	public List<Location> getAllLocation();
}
