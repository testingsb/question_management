package com.education.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RestController;

import com.education.service.QuestionService;

@RestController
public class QuestionRestController {

	
	private QuestionService questionService;
	
	
//	public QuestionRestController(QuestionService questionService) {
//		System.out.println("RestController Constructro");
//		this.questionService = questionService;
//	}
	
	@Autowired
	public void setQuestionService(QuestionService questionService) {
		System.out.println("Autowring thru setter method");
		this.questionService = questionService;
	}
		//hello  heiiii
}
