package com.soft1721.jianyue.api.service.impl;


import com.soft1721.jianyue.api.entity.Comment;
import com.soft1721.jianyue.api.entity.vo.CommentVO;
import com.soft1721.jianyue.api.service.CommentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class CommentServiceImplTest {
    @Resource
    private CommentService commentService;

    @Test
    public void selectCommentsByAId() {
        List<CommentVO> commentVOList = commentService.selectCommentsByAId(1);
        commentVOList.forEach(comment -> System.out.println(comment));
    }
    @Test
    public void addComment() {
        Comment comment = new Comment();
        comment.setAId(2);
        comment.setUId(9);
        comment.setContent("very good!");
        /* comment.setCommentTime(new Date(2019,04,10,9,43,35));*/
        commentService.addComment(comment);
    }

}