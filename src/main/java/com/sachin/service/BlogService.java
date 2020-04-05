package com.sachin.service;

import java.util.Map;

import com.sachin.dto.BlogDTO;

public interface BlogService {
	public BlogDTO getBlogData(Map<String,Object> findParam);
	public String saveData(BlogDTO blogDTO);

}
