package com.sachin.dao;

import java.util.Map;

import com.sachin.dto.BlogDTO;

public interface BlogDao {
	
	public BlogDTO getBlogData(Map<String,Object> findParam);
	public String saveData(BlogDTO blogDTO);

}
