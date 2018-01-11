package com.example.test.endpoint;


import com.example.test.models.Article;
import com.example.test.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class ArticleEndpoint {

    private final ArticleService articleService;

    @Autowired
    public ArticleEndpoint(ArticleService articleService) {
        this.articleService = articleService;
    }


    @ResponseBody
    @GetMapping(value = "/article/{articleID}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Article getArticle(@PathVariable("articleID") String artID){
        return articleService.getArticle(artID);
    }

    @ResponseBody
    @PostMapping(value = "/add_article",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Article addArticle( @Valid @RequestBody Article article){
         articleService.add(article);
         return article;
    }

    @ResponseBody
    @PutMapping(value = "/update_article/{articleID}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public String update(@PathVariable("articleID") String id,  @Valid @RequestBody Article article){
        articleService.update(id, article);
        return "Article is updated";
    }


    @ResponseBody
    @DeleteMapping(value = "/delete_article/{articleID}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public String deleteArticle(@PathVariable("articleID") String articleID){
        articleService.delete(articleID);
        return "Article is deleted";
    }

}
