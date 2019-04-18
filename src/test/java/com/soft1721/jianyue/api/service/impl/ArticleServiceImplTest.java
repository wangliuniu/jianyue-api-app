package com.soft1721.jianyue.api.service.impl;

import com.soft1721.jianyue.api.entity.Article;
import com.soft1721.jianyue.api.entity.Follow;
import com.soft1721.jianyue.api.entity.vo.ArticleVO;
import com.soft1721.jianyue.api.service.ArticleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ArticleServiceImplTest {
    @Resource
    private ArticleService articleService;

    @Test
    public void selectAll() {
        List<ArticleVO> articleVOList=articleService.selectAll();
        System.out.println(articleVOList);
    }

//    @Test
//    public void getArticleById() {
//        ArticleVO articleVO=articleService.getArticleById(1);
//        System.out.println(articleVO);
//    }
//    @Test
//    public void insertArticle() {
//        Article article=new Article();
//        article.setUId(2);
//        article.getContent();
//        articleService.insertArticle(article);
//    }

}