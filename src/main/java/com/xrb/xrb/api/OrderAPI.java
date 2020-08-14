package com.xrb.xrb.api;

import com.xrb.xrb.entity.Order;
import com.xrb.xrb.mapper.OrderMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
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
    private Integer addOrder(Order order) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        order.setCreatetime(sdf.format(date));
        order.setOid(order.getUid() + String.valueOf(date.getTime()));
        order.setStatus("等待上门");
        return orderMapper.addOrder(order);
    }

    @GetMapping("/updStatusById")
    private Integer updStatusById(String oid, String status) {
        return orderMapper.updStatusById(oid, status);
    }

    @GetMapping("/getOrderById")
    private Order getOrderById(String oid) {
        return orderMapper.getOrderById(oid);
    }

    @GetMapping("/getOrderListByUid")
    private List<Order> getOrderListByUid(Integer uid) {
        return orderMapper.getOrderListByUid(uid);
    }
}
