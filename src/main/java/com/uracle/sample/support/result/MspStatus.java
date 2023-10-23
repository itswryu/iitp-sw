package com.uracle.sample.support.result;

import lombok.Getter;

@Getter
public enum MspStatus {

    OK("200", "OK"),
    BAD_REQUEST("400", "Bad Request"),
    NOT_FOUND("404", "Not Found"),
    ERROR("500", "Internal Server Error");

    private final String code;
    private final String msg;

    MspStatus(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}