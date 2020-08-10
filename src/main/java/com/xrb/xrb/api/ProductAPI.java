package com.xrb.xrb.api;

import com.xrb.xrb.entity.Product;
import com.xrb.xrb.mapper.ProductMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/api/Product")
public class ProductAPI {
    @Resource
    ProductMapper productMapper;

    @GetMapping("/getProductList")
    private List<Product> getProductList() {
        return productMapper.getProductList();
    }

    @GetMapping("/updProductNumById")
    private Integer updProductNumById(Integer num, Integer pid) {
        return productMapper.updProductNumById(num, pid);
    }

    @GetMapping("/getProductNumById")
    private Integer getProductNumById(Integer pid) {
        return productMapper.getProductNumById(pid);
    }
}
