package com.soft1721.jianyue.api.entity;

import lombok.Data;

import javax.xml.soap.Text;
import java.util.Date;
@Data
public class Comment {
    private Integer id;
    private Integer aId;
    private Integer uId;
    private String content;
    private Date commentTime;
}
