package com.khs.exam.javap.controller; //클래스를 모아놓은 폴더

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.khs.exam.javap.vo.Article;



@Controller //annotation: 컨트롤러라고 스프링에게 알려주는 용도
public class UserArticleController{
	
	int articlesLastId;
	
	private List<Article> articles;
	
	public UserArticleController() {
		articlesLastId=0;
		articles = new ArrayList<>();
	}
	
	
	@RequestMapping("/user/article/doAdd")//homeController에 써도되지만 대게 나누어씀
	@ResponseBody
	public Article doAdd(String title, String body){
		
		
		int id =  articlesLastId+1;
		Article article = new Article(id, title, body);
		
		articles.add(article);
		articlesLastId=id;
		
		return article;
		
	}

	@RequestMapping("/user/article/getArticles")//homeController에 써도되지만 대게 나누어씀
	@ResponseBody
	public Article getArticles(){
		Article article1 = new Article(1, "제목1", "내용1");
		Article article2 = new Article(2, "제목2", "내용2");
		
		return article1;
		
	}
	
	
	
}