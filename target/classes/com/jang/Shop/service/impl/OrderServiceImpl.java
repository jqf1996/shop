package com.jang.Shop.service.impl;

import com.jang.Shop.entity.Order;
import com.jang.Shop.mapper.OrderMapper;
import com.jang.Shop.service.OrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 狂神说
 * @since 2020-12-03
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

}
