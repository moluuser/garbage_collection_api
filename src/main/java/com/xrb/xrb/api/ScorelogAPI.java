package com.xrb.xrb.api;

import com.xrb.xrb.entity.Scorelog;
import com.xrb.xrb.mapper.ScorelogMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/Scorelog")
public class ScorelogAPI {
    @Resource
    ScorelogMapper scorelogMapper;

    @GetMapping("getScorelogByUid")
    List<Scorelog> getScorelogByUid(Integer uid) {
        return scorelogMapper.getScorelogByUid(uid);
    }

    @GetMapping("addScorelog")
    Integer addScorelog(Scorelog scorelog) {
        Date date = new Date();
        scorelog.setSid(String.valueOf(date.getTime()) + scorelog.getUid());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        scorelog.setCreatetime(sdf.format(date));
        return scorelogMapper.addScorelog(scorelog);
    }

}
