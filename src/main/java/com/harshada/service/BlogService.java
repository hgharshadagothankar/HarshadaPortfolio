package com.harshada.service;

import java.util.List;

import com.harshada.model.Blog;

public interface BlogService {
	public void add( Blog  Blog);
	public List<Blog> getAllBlog();
}
