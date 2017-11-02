package com.cdkj.coin.ao;

import com.cdkj.coin.dto.req.UploadEthAddressReq;
import com.cdkj.coin.dto.res.UploadEthAddressRes;

/**
 * Created by tianlei on 2017/十一月/01.
 */
public interface IAddressAO {

    public UploadEthAddressRes uploadAddress(UploadEthAddressReq req);

}
