//package com.jzkj.controller;
//
//import com.jzkj.annotation.IgnoreAuth;
//import com.jzkj.annotation.LoginUser;
//import com.jzkj.common.platform.utils.Query;
//import com.jzkj.entity.TopicVo;
//import com.jzkj.entity.UserVo;
//import com.jzkj.service.ApiTopicService;
//import com.jzkj.until.util.ApiBaseAction;
//
//import com.jzkj.until.util.ApiPageUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
///**
// * 作者: @author Harmon <br>
// * 时间: 2017-08-11 08:32<br>
// * 描述: ApiIndexController <br>
// */
//@RestController
//@RequestMapping("/api/topic")
//public class ApiTopicController extends ApiBaseAction {
//    @Autowired
//    private ApiTopicService topicService;
//
//    /**
//     */
//    @IgnoreAuth
//    @PostMapping("list")
//    public Object list(@RequestParam(value = "page", defaultValue = "1") Integer page,
//                       @RequestParam(value = "size", defaultValue = "10") Integer size) {
//        Map param = new HashMap();
//        param.put("page", page);
//        param.put("limit", size);
//        param.put("sidx", "id");
//        param.put("order", "desc");
//        param.put("fields", "id, title, price_info, scene_pic_url,subtitle");
//        //查询列表数据
//        Query query = new Query(param);
//        List<TopicVo> topicEntities = topicService.queryList(query);
//        int total = topicService.queryTotal(query);
//        ApiPageUtils pageUtil = new ApiPageUtils(topicEntities, total, query.getLimit(), query.getPage());
//        return toResponsSuccess(pageUtil);
//    }
//
//    /**
//     */
//    @IgnoreAuth
//    @PostMapping("detail")
//    public Object detail(@LoginUser UserVo loginUser, Integer id) {
//        TopicVo topicEntity = topicService.queryObject(id);
//        return toResponsSuccess(topicEntity);
//    }
//
//    /**
//     */
//    @IgnoreAuth
//    @PostMapping("related")
//    public Object related(@LoginUser UserVo loginUser, Integer id) {
//        Map param = new HashMap();
//        param.put("limit", 4);
//        List<TopicVo> topicEntities = topicService.queryList(param);
//        return toResponsSuccess(topicEntities);
//    }
//}
