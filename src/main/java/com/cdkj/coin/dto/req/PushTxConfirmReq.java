package com.cdkj.coin.dto.req;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by tianlei on 2017/十一月/02.
 */
public class PushTxConfirmReq {

    @NotNull
    private List hashList;

    public List getHashList() {
        return hashList;
    }

    public void setHashList(List hashList) {
        this.hashList = hashList;
    }
}
