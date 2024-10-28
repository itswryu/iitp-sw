package com.uracle.sample.support.protocol;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@ToString
@Getter
@Setter
public class MspResult {

    private MspHead head;
    private Object body;

    @Builder
    @Getter
    @Setter
    public static class MspHead {

        @JsonProperty("result_code")
        private String resultCode;
        @JsonProperty("result_msg")
        private String resultMsg;
    }
}