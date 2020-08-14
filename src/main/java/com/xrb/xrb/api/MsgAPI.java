package com.xrb.xrb.api;

import com.xrb.xrb.entity.Msg;
import com.xrb.xrb.entity.Scorelog;
import com.xrb.xrb.mapper.MsgMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/Msg")
public class MsgAPI {
    @Resource
    MsgMapper msgMapper;

    @GetMapping("/getMsgByUid")
    List<Scorelog> getMsgByUid(Integer uid) {
        return msgMapper.getMsgByUid(uid);
    }

    @GetMapping("/addMsg")
    Integer addMsg(Msg msg) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        msg.setCreatetime(sdf.format(date));
        return msgMapper.addMsg(msg);
    }

    @GetMapping("/delMsgById")
    Integer delMsgById(Integer mid) {
        return msgMapper.delMsgById(mid);
    }
}
