package com.xrb.xrb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    private String oid;
    private Integer uid;
    private String status;
    private String createtime;
    private String contactname;
    private String contacttel;
    private String homeaddress;
    private String detailaddress;
    private String goodstype;
    private String goodsname;
    private Integer goodsnum;
    private BigDecimal price;
    private String hometype;
    private String hometime;
    private String detail;
    private String photo;
}
