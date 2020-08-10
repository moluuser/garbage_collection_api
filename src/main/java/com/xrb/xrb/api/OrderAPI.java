package com.xrb.xrb.api;

import com.xrb.xrb.entity.Order;
import com.xrb.xrb.mapper.OrderMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/Order")
public class OrderAPI {
    @Resource
    OrderMapper orderMapper;

    @GetMapping("/getOrderList")
    private List<Order> getOrderList() {
        return orderMapper.getOrderList();
    }

    @GetMapping("/addOrder")
    private Integer addOrder(Integer uid, String title, BigDecimal price, Integer num,
                             String detail, String photo, String place) {
        Order order = new Order();
        Date utilDate = new Date();
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
        order.setOdate(sqlDate);
        order.setUid(uid);
        order.setTitle(title);
        order.setPrice(price);
        order.setNum(num);
        order.setDetail(detail);
        order.setPhoto(photo);
        order.setPlace(place);
        return orderMapper.addOrder(order);
    }

    @GetMapping("/updStatusById")
    private Integer updStatusById(Integer oid, String status) {
        return orderMapper.updStatusById(oid, status);
    }

    @GetMapping("/getOrderById")
    private Order getOrderById(Integer oid) {
        return orderMapper.getOrderById(oid);
    }

    @GetMapping("/getOrderListByUid")
    private List<Order> getOrderListByUid(Integer uid) {
        return orderMapper.getOrderListByUid(uid);
    }
}
