package com.example.test.endpoint;


import com.example.test.models.Article;
import com.example.test.models.Doctor;
import com.example.test.service.ArticleService;
import com.example.test.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

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
    public Doctor getArticle(@PathVariable("articleID") String artID){
        return null;
    }

    @ResponseBody
    @PostMapping(value = "/doctor/{doctorID}/add_article/{articleID}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Doctor addArticle(@PathVariable("doctorID") String id, @RequestBody Article input){
        return null;
    }

    @ResponseBody
    @PutMapping(value = "/doctor/{doctorID}/update_article/{articleID}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public String update(@PathVariable("personal_number") String id){

        return "Article is updated";
    }

    @ResponseBody
    @DeleteMapping(value = "/doctors/{articleID}/delete_article/{articleID}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public String deleteArticleByDoctor(@PathVariable("articleID") String docID, @PathVariable("articleID") String articleID){

        return "Article is deleted";
    }

}
