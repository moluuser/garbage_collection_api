package com.xrb.xrb.api;

import com.xrb.xrb.entity.Myaddress;
import com.xrb.xrb.mapper.MyaddressMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/api/Myaddress")
public class MyaddressAPI {
    @Resource
    MyaddressMapper myaddressMapper;

    @GetMapping("/getMyaddressByUid")
    List<Myaddress> getMyaddressByUid(Integer uid) {
        return myaddressMapper.getMyaddressByUid(uid);
    }

    @GetMapping("/addMyaddress")
    Integer addMyaddress(Myaddress Myaddress) {
        return myaddressMapper.addMyaddress(Myaddress);
    }

    @GetMapping("/delMyaddressById")
    Integer delMyaddressById(Integer aid) {
        return myaddressMapper.delMyaddressById(aid);
    }

    @GetMapping("/updMyaddressById")
    Integer updMyaddressById(Integer aid, String contactname, String contacttel, String homeaddress, String detailaddress) {
        return myaddressMapper.updMyaddressById(aid, contactname, contacttel, homeaddress, detailaddress);
    }

    @GetMapping("/getMyaddressById")
    Myaddress getMyaddressById(Integer aid) {
        return myaddressMapper.getMyaddressById(aid);
    }
}
