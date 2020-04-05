package com.sachin.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sachin.dao.BlogDao;
import com.sachin.dto.BlogDTO;
import com.sachin.service.BlogService;

@Service
public class BlogServiceImpl implements BlogService {
	@Autowired
	private BlogDao blogDao;

	public BlogDTO getBlogData(Map<String, Object> findParam) {
		return blogDao.getBlogData(findParam);
	}
	public String saveData(BlogDTO blogDTO) {
		return blogDao.saveData(blogDTO);
	}
}
