package com.cdkj.coin.dto.req;

import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;

/**
 * Created by tianlei on 2017/十一月/03.
 */
public class TxPageReq {

    @NotBlank
    @DecimalMin(value = "0")
    private String start;

    @NotBlank
    @DecimalMin(value = "1")
    private String limit;

    private String from;
    private String to;

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }
}
