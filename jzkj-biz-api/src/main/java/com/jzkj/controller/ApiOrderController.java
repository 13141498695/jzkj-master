//package com.jzkj.controller;
//
//import com.jzkj.annotation.IgnoreAuth;
//import com.jzkj.annotation.LoginUser;
//import com.jzkj.common.platform.utils.Query;
//import com.jzkj.entity.OrderGoodsVo;
//import com.jzkj.entity.OrderVo;
//import com.jzkj.entity.UserVo;
//import com.jzkj.service.ApiKdniaoService;
//import com.jzkj.service.ApiOrderGoodsService;
//import com.jzkj.service.ApiOrderService;
//
//import com.jzkj.until.util.ApiBaseAction;
//import com.jzkj.until.util.ApiPageUtils;
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
//import org.apache.commons.collections.MapUtils;
//import org.apache.commons.lang.StringUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.Date;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
///**
// * 作者: @author Harmon <br>
// * 时间: 2017-08-11 08:32<br>
// * 描述: ApiIndexController <br>
// */
//@Api(tags = "订单相关")
//@RestController
//@RequestMapping("/api/order")
//public class ApiOrderController extends ApiBaseAction {
//    @Autowired
//    private ApiOrderService orderService;
//    @Autowired
//    private ApiOrderGoodsService orderGoodsService;
//    @Autowired
//    private ApiKdniaoService apiKdniaoService;
//
//    /**
//     */
//    @ApiOperation(value = "订单首页")
//    @IgnoreAuth
//    @PostMapping("index")
//    public Object index() {
//        //
//        return toResponsSuccess("");
//    }
//
//    /**
//     * 获取订单列表
//     */
//    @ApiOperation(value = "获取订单列表")
//    @PostMapping("list")
//    public Object list(@LoginUser UserVo loginUser,
//                       @RequestParam(value = "page", defaultValue = "1") Integer page,
//                       @RequestParam(value = "size", defaultValue = "10") Integer size) {
//        //
//        Map params = new HashMap();
//        params.put("user_id", loginUser.getUserId());
//        params.put("page", page);
//        params.put("limit", size);
//        params.put("sidx", "id");
//        params.put("order", "asc");
//        //查询列表数据
//        Query query = new Query(params);
//        List<OrderVo> orderEntityList = orderService.queryList(query);
//        int total = orderService.queryTotal(query);
//        ApiPageUtils pageUtil = new ApiPageUtils(orderEntityList, total, query.getLimit(), query.getPage());
//        //
//        for (OrderVo item : orderEntityList) {
//            Map orderGoodsParam = new HashMap();
//            orderGoodsParam.put("order_id", item.getId());
//            //订单的商品
//            List<OrderGoodsVo> goodsList = orderGoodsService.queryList(orderGoodsParam);
//            Integer goodsCount = 0;
//            for (OrderGoodsVo orderGoodsEntity : goodsList) {
//                goodsCount += orderGoodsEntity.getNumber();
//                item.setGoodsCount(goodsCount);
//            }
//        }
//        return toResponsSuccess(pageUtil);
//    }
//
//    /**
//     * 获取订单详情
//     */
//    @ApiOperation(value = "获取订单详情")
//    @PostMapping("detail")
//    public Object detail(Integer orderId) {
//        Map resultObj = new HashMap();
//        //
//        OrderVo orderInfo = orderService.queryObject(orderId);
//        if (null == orderInfo) {
//            return toResponsObject(400, "订单不存在", "");
//        }
//        Map orderGoodsParam = new HashMap();
//        orderGoodsParam.put("order_id", orderId);
//        //订单的商品
//        List<OrderGoodsVo> orderGoods = orderGoodsService.queryList(orderGoodsParam);
//        //订单最后支付时间
//        if (orderInfo.getOrder_status() == 0) {
//            // if (moment().subtract(60, 'minutes') < moment(orderInfo.add_time)) {
////            orderInfo.final_pay_time = moment("001234", "Hmmss").format("mm:ss")
//            // } else {
//            //     //超过时间不支付，更新订单状态为取消
//            // }
//        }
//
//        //订单可操作的选择,删除，支付，收货，评论，退换货
//        Map handleOption = orderInfo.getHandleOption();
//        //
//        resultObj.put("orderInfo", orderInfo);
//        resultObj.put("orderGoods", orderGoods);
//        resultObj.put("handleOption", handleOption);
//        if (!StringUtils.isEmpty(orderInfo.getShipping_code()) && !StringUtils.isEmpty(orderInfo.getShipping_no())) {
//            // 快递
//            List Traces = apiKdniaoService.getOrderTracesByJson(orderInfo.getShipping_code(), orderInfo.getShipping_no());
//            resultObj.put("shippingList", Traces);
//        }
//        return toResponsSuccess(resultObj);
//    }
//
//    @ApiOperation(value = "修改订单")
//    @PostMapping("updateSuccess")
//    public Object updateSuccess(Integer orderId) {
//        OrderVo orderInfo = orderService.queryObject(orderId);
//        if (orderInfo == null) {
//            return toResponsFail("订单不存在");
//        } else if (orderInfo.getOrder_status() != 0) {
//            return toResponsFail("订单状态不正确orderStatus" + orderInfo.getOrder_status() + "payStatus" + orderInfo.getPay_status());
//        }
//
//        orderInfo.setId(orderId);
//        orderInfo.setPay_status(2);
//        orderInfo.setOrder_status(201);
//        orderInfo.setShipping_status(0);
//        orderInfo.setPay_time(new Date());
//        int num = orderService.update(orderInfo);
//        if (num > 0) {
//            return toResponsMsgSuccess("修改订单成功");
//        } else {
//            return toResponsFail("修改订单失败");
//        }
//    }
//
//    /**
//     * 获取订单列表
//     */
//    @ApiOperation(value = "订单提交")
//    @PostMapping("submit")
//    public Object submit(@LoginUser UserVo loginUser) {
//        Map resultObj = null;
//        try {
//            resultObj = orderService.submit(getJsonRequest(), loginUser);
//            if (null != resultObj) {
//                return toResponsObject(MapUtils.getInteger(resultObj, "errno"), MapUtils.getString(resultObj, "errmsg"), resultObj.get("data"));
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return toResponsFail("提交失败");
//    }
//
//    /**
//     * 获取订单列表
//     */
//    @ApiOperation(value = "取消订单")
//    @PostMapping("cancelOrder")
//    public Object cancelOrder(Integer orderId) {
//        try {
//            OrderVo orderVo = orderService.queryObject(orderId);
//            if (orderVo.getOrder_status() == 300) {
//                return toResponsFail("已发货，不能取消");
//            } else if (orderVo.getOrder_status() == 301) {
//                return toResponsFail("已收货，不能取消");
//            }
//            // 需要退款
//            if (orderVo.getPay_status() == 2) {
////               // WechatRefundApiResult result = WechatUtil.wxRefund(orderVo.getOrder_sn(),
////              String  WechatRefundApiResult=null;
////                        0.01, 0.01);
////                if () {
//                    if (orderVo.getOrder_status() == 201) {
//                        orderVo.setOrder_status(401);
////                    } else if (orderVo.getOrder_status() == 300) {
////                        orderVo.setOrder_status(402);
////                    }
//                    orderVo.setPay_status(4);
//                    orderService.update(orderVo);
//                    return toResponsMsgSuccess("取消成功");
//                } else {
//                    return toResponsObject(400, "取消成失败", "");
//                }
//            } else {
//                orderVo.setOrder_status(101);
//                orderService.update(orderVo);
//                return toResponsSuccess("取消成功");
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return toResponsFail("提交失败");
//    }
//
//    /**
//     * 确认收货
//     */
//    @ApiOperation(value = "确认收货")
//    @PostMapping("confirmOrder")
//    public Object confirmOrder(Integer orderId) {
//        try {
//            OrderVo orderVo = orderService.queryObject(orderId);
//            orderVo.setOrder_status(301);
//            orderVo.setShipping_status(2);
//            orderVo.setConfirm_time(new Date());
//            orderService.update(orderVo);
//            return toResponsSuccess("确认收货成功");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return toResponsFail("提交失败");
//    }
//}
