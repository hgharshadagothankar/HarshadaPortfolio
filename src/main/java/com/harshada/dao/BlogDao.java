package com.harshada.dao;

import java.util.List;

import com.harshada.model.Blog;

public interface BlogDao {
	public void add(Blog Blog);
	public List<Blog> getBlogById(int id);
	public List<Blog> getAllBlogs();
}
