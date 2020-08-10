package com.xrb.xrb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Feed {
    private Integer fid;
    private String tel;
    private String msg;
    private String username;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fdate;
}
