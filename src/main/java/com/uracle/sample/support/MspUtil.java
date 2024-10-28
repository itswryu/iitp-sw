package com.uracle.sample.support;

import com.uracle.sample.support.protocol.MspResult.MspHead;
import com.uracle.sample.support.protocol.MspResult;
import com.uracle.sample.support.protocol.MspStatus;

public class MspUtil {

    public static MspResult makeResult(MspStatus status, Object data){
        return MspResult.builder()
            .head(MspHead.builder().resultCode(status.getCode()).resultMsg(status.getMsg()).build())
            .body(data)
            .build();
    }

    public static MspResult makeResult(String resultCode, String resultMsg,  Object data){
        return MspResult.builder()
            .head(MspHead.builder().resultCode(resultCode).resultMsg(resultMsg).build())
            .body(data)
            .build();
    }
}
