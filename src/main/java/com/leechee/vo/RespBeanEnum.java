package com.leechee.vo;

import lombok.*;

@Getter
@ToString
@AllArgsConstructor
public enum RespBeanEnum {
    SUCCESS(200, "SUCCESS"),
    ERROR(500, "服务端异常");

    private final Integer code;
    private final String message;
}
