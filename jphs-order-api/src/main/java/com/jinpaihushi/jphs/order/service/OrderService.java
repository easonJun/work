package com.jinpaihushi.jphs.order.service;

import java.util.List;
import java.util.Map;
import java.util.SortedMap;

import com.github.pagehelper.Page;
import com.jinpaihushi.jphs.order.model.Order;
import com.jinpaihushi.jphs.order.model.OrderInfo;
import com.jinpaihushi.jphs.order.model.OrderPojo;
import com.jinpaihushi.jphs.user.model.User;
import com.jinpaihushi.service.BaseService;

import net.sf.json.JSONObject;

/**
 * 
 * @author yangsong
 * @date 2017-06-27 14:43:43
 * @version 1.0
 */
public interface OrderService extends BaseService<Order> {

    Page<Order> getList(Order order);

    /**
     * 创建订单
     * 
     * @param order
     *            订单及相关信息
     * @param insurance
     *            保险的信息
     * @return
     */
    Map<String, Object> createOrder(OrderInfo orderInfo);

    List<Map<String, Object>> orderaccNotNullList(Map<String, Object> map);

    /**
     * 获取用的个人中心的订单列表
     * 
     * @param user
     *            用户对象
     * @return
     */
    List<Map<String, Object>> getUserOrder(Map<String, Object> query);

    /**
     * 查询订单详情
     * 
     * @param userId
     *            用户id
     * @param deviceType
     * @return
     */
    Order getUserOrderDetail(String orderId, Integer deviceType);

    /**
     * 验证支付金额
     * 
     * @param orderNo
     * @param payParice
     * @return
     */
    boolean checkPrice(String orderNo, Double payParice);

    List<Map<String, Object>> getUptoDataGoods(Map<String, Object> map);

    List<Map<String, Object>> getOrderGoodsList(Map<String, Object> map);

    List<Map<String, Object>> nurseOrderList(Map<String, Object> map);

    /**
     * 订单详情
     * 
     * @param order
     * @return
     */
    Order nurseOrderDetails(Order order);

    Map<String, Object> createOrderNew(OrderPojo orderInfo);

    /**
     * 用户余额支付
     * 
     * @param orderId
     * @param orderNo
     * @param payParice
     * @param userId
     * @return
     */
    byte[] balancePayment(String orderId, String orderNo, Double payParice, String userId);

    /**
     * 护士抢单
     * 
     * @param orderId
     * @param orderGoodsId
     * @param user
     * @return
     */
    String orderGrab(String orderId, String orderGoodsId, User user);

    /**
     * 
     */
    String startService(String orderId, String osId, User user);

    String fulfilService(String osId, String orderId, String orderGoodsId, User user);

    /**
     * 取消订单
     * 
     * @param orderId
     * @param remark
     * @return
     */
    String cancelOrder(String orderId, User user);

    /**
     * 微信支付回调-服务
     * 
     * @param map_re
     * @return
     */
    boolean updateWechatOrderStutas(SortedMap<Object, Object> map_re);

    /**
     * @param query
     *            query 参数 1. 日期 confirmTime 2. 订单状态 schedule 已完成的
     * @return
     */
    List<Order> getCompletedOrder(Map<String, Object> query);

    List<Map<String, Object>> getOrderUnpaid(String condition);

    Map<String, Object> getSmsMessage(String id);

    List<Map<String, Object>> getNotInRank();

    List<Map<String, Object>> exportExcel(Order order);

    /**
     * 订单量统计按周 
     * @param weeks 2017-10-11T2017-10-15
     * @return
     */
    List<Map<String, Object>> getQuantityByWeek(String weeks);

    /**
     * 修改订单为已失效
     * @param order
     */
    void updateOrderToExpired(Order order);

    /**
     * 订单量统计按月
     * @param month 2017-10
     * @return
     */
    List<Map<String, Object>> quantityByMonth(String month);

    /**
     * 修改接单人
     * @param id
     * @param orderId
     * @param acceptUserId
     * @return
     */
    int editAcceptUserId(String id, String orderId, String acceptUserId);

    /**
     * 订单量按年统计
     * @param year 2017 年
     * @return
     */
    List<Map<String, Object>> quantityByYear(String year);

    /**
     * 服务排名
     * @param year 年份
     * @return
     */
    Map<String, Object> getServiceRanking(String year);

    /**
     * 城市排名
     * @param year
     * @return
     */
    Map<String, Object> getCityRanking(String year);

    /**
     * 全年的订单量统计
     * @param year
     * @return
     */
    Map<String, Object> getAllNumByYear(String year);

    /**
     * 查询全年的服务订单量
     * @param map
     *      @param year 查询的年份
     *      @param goodsId 筛选的服务id
     * @return
     */
    Map<String, Object> getAllServiceNumByYear(Map<String, Object> map);

    /**
     * 查询全年的城市订单量
     * @param map
     *      @param year 查询的年份
     *      @param city 筛选的城市
     * @return
     */
    Map<String, Object> getAllCityNumByYear(Map<String, Object> map);

    /**
     * 打造白富美计划活动，查询护士收入
     * @param id
     * @return
     */
    JSONObject dzhsbfmHd(String id, String year, String month);

    /**
     * 白富美活动领取奖励
     * @param id
     * @param year
     * @param month
     * @param price
     * @return
     */
    int getHsbfmAward(String id, String year, String month, String price);

    /**
     * 获取活动的奖励记录的信息
     * @return
     */
    List<Map<String, Object>> getSendTransaction();

    /**
     * 统计导出
     * @param year
     * @return
     */
    List<Map<String, Object>> exportStatisticsExcel(String year);
}