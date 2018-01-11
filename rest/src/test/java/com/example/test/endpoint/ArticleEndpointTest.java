package com.example.test.endpoint;

import com.example.test.service.ArticleService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class)
@WebMvcTest(ArticleEndpoint.class)
public class ArticleEndpointTest {

    public ArticleEndpointTest(){

    }

    @SpyBean
    private ArticleService articleService;

    @Autowired
    private MockMvc mvc;

    @Autowired
    private ObjectMapper mapper;

    @Test
    public void getArticle() throws Exception {
        String testID = "Q21";
        this.mvc.perform(
                get("/article/{articleID}", testID).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());

    }

    @Test
    public void deleteArticle() throws Exception {
        String testID = "Q21";
        this.mvc.perform(
                delete("/delete_article/{articleID}", testID).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());

    }

}