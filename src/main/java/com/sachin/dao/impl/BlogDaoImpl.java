package com.sachin.dao.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.sachin.dao.BlogDao;
import com.sachin.dto.BlogDTO;

@Repository
public class BlogDaoImpl implements BlogDao {
	@Autowired
	private MongoTemplate mongoTemplate;

	public BlogDTO getBlogData(Map<String, Object> findParam) {
		Query query = new Query();
		Query addCriteria = query.addCriteria(Criteria.where("key").is(findParam.get("key")));

		return mongoTemplate.findOne(addCriteria, BlogDTO.class, "data");

	}

	public String saveData(BlogDTO blogDTO) {

		mongoTemplate.insert(blogDTO);
		return "success";

	}

}
