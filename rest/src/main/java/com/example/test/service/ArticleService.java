package com.example.test.service;


import com.example.test.models.Article;
import com.example.test.models.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.*;


@Service
public class ArticleService {

    private Article article;
    private static DoctorService doctorService = new DoctorService(null);

    private static Map<String, Article> articlesDB = new HashMap<>();


    static {
        initDocs();
    }

    private static void initDocs() {
        Article article1 = new Article("Q21","ИСтатьи1",1999,"Science", doctorService.getDoctorByPersonalNumber("01AD"));
        Article article2 = new Article("Q22","ИСтатьи2",1998,"Science", doctorService.getDoctorByPersonalNumber("F84T"));
        Article article3 = new Article("W22","ИСтатьи3",2000,"Science 2.0", doctorService.getDoctorByPersonalNumber("51CK"));
        articlesDB.put(article1.getArticleID(), article1);
        articlesDB.put(article2.getArticleID(), article2);
        articlesDB.put(article3.getArticleID(), article3);
    }


    @Autowired
    public ArticleService(Article article) {
        this.article = article;
    }


    public void add(Article article) {
        articlesDB.put(article.getArticleID(), article);
    }


    public Article getArticle(String articleID){
        //List<Article> list = listByDoctor(doctor.getPersonalNumber());
        //return foundArticle(articleID, list);
        return articlesDB.get(articleID);
    }


    public void delete(String ID) {
        articlesDB.remove(ID);
    }

    public void update(String ID, Article article){
        articlesDB.replace(ID, article);
    }

    private List<Article> listByDoctor(String docID){
        List<Article> result = new ArrayList<>();
        for (Article a : articlesDB.values()) {
            if(a.getDoctor().getPersonalNumber().equals(docID)){
                result.add(a);
            }
        }
        return result;
    }

    private Article foundArticle(String articleID, List<Article> list){
        Article article = null;
        for (Article iArticle : list) {
            if(iArticle.getArticleID().equals(articleID)){
                article = iArticle;
            }
        }
        return article;
    }


}
