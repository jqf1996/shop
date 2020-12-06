package com.jang.Shop.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotation.Version;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author 狂神说
 * @since 2020-12-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Product对象", description="")
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer productId;

    private String productName;

    private String productInfo;

    private String productTop;

    private Integer productNum;

    private Double productPrice;

    private Date createTime;

    private Date modifyTime;


}
