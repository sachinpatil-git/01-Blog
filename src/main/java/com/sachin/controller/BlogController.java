package com.sachin.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sachin.dto.BlogDTO;
import com.sachin.dto.ResponseDTO;
import com.sachin.service.BlogService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class BlogController {
	@Autowired
	private BlogService blogService;

	@RequestMapping(value = "/data")
	public BlogDTO retreiveData() {
		Map<String, Object> findParam = new HashMap<>();
		findParam.put("key","CORE_JAVA_STUDY");
		BlogDTO blogData = blogService.getBlogData(findParam);
		System.out.println(blogData.getNextNode());
		return blogData;
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public void saveData(@RequestBody BlogDTO blogDTO) {
		String saveData = blogService.saveData(blogDTO);
		System.out.println("result--- " + saveData);
	}
	@RequestMapping(value="/next/{nextNode}")
	@CrossOrigin(origins="http://localhost:4200")
	public BlogDTO sayHello(@PathVariable String nextNode) {
		Map<String, Object> findParam = new HashMap<>();
		findParam.put("key",nextNode);
		BlogDTO blogData = blogService.getBlogData(findParam);
		System.out.println(blogData.getNextNode());
		return blogData;
	}

}
