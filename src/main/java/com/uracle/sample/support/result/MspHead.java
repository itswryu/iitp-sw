package com.uracle.sample.support.result;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class MspHead {

    private String result_code;
    private String result_msg;
}