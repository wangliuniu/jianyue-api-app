package com.soft1721.jianyue.api.service.impl;

import com.soft1721.jianyue.api.entity.Follow;
import com.soft1721.jianyue.api.entity.Img;
import com.soft1721.jianyue.api.service.ImgService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class ImgServiceImplTest {
    @Resource
    private ImgService imgService;

    @Test
    public void selectImgsByAId() {
        List<Img> imgList = imgService.selectImgsByAId(1);
        System.out.println(imgList);
    }

//    @Test
//    public void insertImg() {
//        Img img= new Img();
//        img.setAId(2);
//        img.setImgUrl("https://i2.hdslb.com/bfs/archive/1f7e6da08b1a933402e98d1ef77a9ab9124f9854.jpg");
//        imgService.insertImg(img);
//    }
}