package com.rabbitmq.sender;

import lombok.Data;

/**
 * @author lwl
 * @date 2018/11/13 14:59
 * @description 监听企业logo改变的model
 */
@Data
public class CorpLogoModel {
    private Long userId;
    private String logo;
}