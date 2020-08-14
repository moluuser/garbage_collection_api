package com.xrb.xrb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Myaddress {
    private Integer aid;
    private Integer uid;
    private String contactname;
    private String contacttel;
    private String homeaddress;
    private String detailaddress;
}
