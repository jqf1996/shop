package com.jang.Shop.mapper;

import com.jang.Shop.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 狂神说
 * @since 2020-12-03
 */
@Resource
@Repository
public interface UserMapper extends BaseMapper<User> {

}
