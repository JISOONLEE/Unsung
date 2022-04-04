package com.ssafy.unsung.controller;

import java.util.List;

import com.ssafy.unsung.repository.WordCount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.unsung.model.News;
import com.ssafy.unsung.service.NewsService;

@RestController
@RequestMapping("/api/news")
@CrossOrigin("*")
public class NewsController {

	@Autowired
	private NewsService newsService;
	
	
	@GetMapping("/search/{keyword}")
	public ResponseEntity<List<News>> search(@PathVariable("keyword") String keyword){
		return ResponseEntity.ok(newsService.findKeywords(keyword));
	}
	@GetMapping("/search/wordcount")
	public ResponseEntity<List<WordCount>> wordCount(){
		return new ResponseEntity<List<WordCount>>(newsService.wordCount(), HttpStatus.OK);
	}
}
