package com.jang.Shop.service.impl;

import com.jang.Shop.entity.Product;
import com.jang.Shop.mapper.ProductMapper;
import com.jang.Shop.service.ProductService;
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
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

}
