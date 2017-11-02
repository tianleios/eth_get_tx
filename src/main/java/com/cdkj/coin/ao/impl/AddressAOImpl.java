package com.cdkj.coin.ao.impl;

import com.cdkj.coin.ao.IAddressAO;
import com.cdkj.coin.bo.IEthAddressBO;
import com.cdkj.coin.dto.req.UploadEthAddressReq;
import com.cdkj.coin.dto.res.UploadEthAddressRes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by tianlei on 2017/十一月/01.
 */
@Service
public class AddressAOImpl implements IAddressAO {

    @Autowired
    IEthAddressBO addressBO;

    @Override
    public UploadEthAddressRes uploadAddress(UploadEthAddressReq req) {

        UploadEthAddressRes res = this.addressBO.uploadAddress(req);
        return res;

    }
}
