package com.education.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RestController;

import com.education.service.QuestionService;

@RestController
public class QuestionRestController {

	private QuestionService questionService;
	
	
	@Autowired
	public void setQuestionService(QuestionService questionService) {
		System.out.println("Autowring thru setter method");
		this.questionService = questionService;
	}
	
	public String getMSG() {
		return "Hello world";
	}
	
		//hello  heiiii
}
