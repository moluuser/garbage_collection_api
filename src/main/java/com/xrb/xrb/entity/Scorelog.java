package com.xrb.xrb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Scorelog {
    private String sid;
    private Integer uid;
    private String detail;
    private Integer delta;
    private String createtime;
}
