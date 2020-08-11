package com.xrb.xrb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Integer uid;
    private String username;
    private String password;
    private String tel;
    private String avatar;
    private Integer score;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date sdate;
}
