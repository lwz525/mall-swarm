package com.coding.cloud.mall.common.domain;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@Builder
@EqualsAndHashCode(callSuper = false)
public class UserDto {
    private Long         id;
    private String       username;
    private String       password;
    private Integer      status;
    private String       clientId;
    private List<String> roles;
}