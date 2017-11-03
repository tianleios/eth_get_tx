package com.cdkj.coin.dto.req;

import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by tianlei on 2017/十一月/03.
 */
public class AddressPageReq {

    @NotBlank
    @DecimalMin(value = "0")
    private String start;

    @NotBlank
    @DecimalMin(value = "1")
    private String limit;

    @NotNull
    private List<String> statusList;

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

    public List<String> getStatusList() {
        return statusList;
    }

    public void setStatusList(List<String> statusList) {
        this.statusList = statusList;
    }
}
