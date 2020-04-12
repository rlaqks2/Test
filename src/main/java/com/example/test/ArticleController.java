package com.example.test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class ArticleController {
   
  @RequestMapping(value = "list", method = RequestMethod.GET)
  public List<Article> test() {
    List<Article> list = new ArrayList<Article>();
    String text = "This is text";
    String title = "This is title";
    String writer = "I am writer";
    for(int i=1; i<=10; i++) {
            Article article = new Article();
            article.setSeq(i);
            article.setText(text);
            article.setTitle(title);
            article.setWriter(writer);
             
            list.add(article);
    }
    return list;
  }
 
  @RequestMapping(value = "article/{seq}", method = RequestMethod.GET)
  public Article detail(@PathVariable("seq") long seq) {
 
        Article article = new Article();
        article.setSeq(seq);
        article.setText("This is text");  
        article.setTitle("This is title");
        article.setWriter("I am writer");
  
    return article;
  }
  
  @RequestMapping(value = "helloWold", method = RequestMethod.GET)
  public String helloWold() {
	  return LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
  }
  
}




