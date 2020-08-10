package com.xrb.xrb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    private Integer uid;
    private Integer oid;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date odate;
    private String title;
    private BigDecimal price;
    private Integer num;
    private String detail;
    private String photo;
    private String place;
}
