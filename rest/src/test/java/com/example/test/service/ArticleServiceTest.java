package com.example.test.service;

import com.example.test.models.Article;
import com.example.test.models.Doctor;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import static org.junit.Assert.*;

public class ArticleServiceTest {

    private ArticleService articleService;
    private DoctorService doctorService = new DoctorService(null);
    private Map<String, Article> expectedListArticles = new ConcurrentHashMap<>();

    private Article article1 = new Article("Q21","ИСтатьи1",1999,"Science", doctorService.getDoctorByPersonalNumber("01AD") );
    private Article article2 = new Article("Q22","ИСтатьи2",1998,"Science", doctorService.getDoctorByPersonalNumber("F84T"));
    private Article article3 = new Article("W22","ИСтатьи3",2000,"Science 2.0",doctorService.getDoctorByPersonalNumber("51CK"));



    @Before
    public void setUp() throws Exception {
        articleService = new ArticleService(null);
        articleService.add(article1);
        articleService.add(article1);
        articleService.add(article3);

        expectedListArticles.put(article1.getArticleID(), article1);
        expectedListArticles.put(article2.getArticleID(), article2);
        expectedListArticles.put(article3.getArticleID(), article3);
    }

    @Test
    public void add() throws Exception {
        articleService.add(new Article("55", "N1", 2000, "N1", doctorService.getDoctorByPersonalNumber("01AD")));

        assertEquals("55", articleService.getArticle("55").getArticleID());
        assertEquals(2000, articleService.getArticle("55").getYear());
    }

    @Test
    public void getArticle() throws Exception {
        Article actualArticle = articleService.getArticle("Q22");

        assertEquals(article2.getArticleID(), actualArticle.getArticleID());
        assertEquals(article2.getNameArticle(), actualArticle.getNameArticle());
        assertEquals(article2.getYear(), actualArticle.getYear());
    }

    @Test
    public void delete() throws Exception{
        assertEquals(article3.getArticleID(), articleService.getArticle("W22").getArticleID());
        articleService.delete("W22");
        assertEquals(null, articleService.getArticle("W22"));
    }

    @Test
    public void update() throws Exception{
        Article actualArticle = articleService.getArticle("Q21");
        actualArticle.setNameArticle("NameIsChanged");

        articleService.update("Q21", actualArticle);
        assertEquals("NameIsChanged", articleService.getArticle("Q21").getNameArticle());
    }



}