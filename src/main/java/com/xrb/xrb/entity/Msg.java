package com.xrb.xrb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Msg {
    private Integer mid;
    private Integer uid;
    private String title;
    private String content;
    private String createtime;
}
