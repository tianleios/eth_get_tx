package com.cdkj.coin.api.impl;

import com.cdkj.coin.ao.IEthTxAO;
import com.cdkj.coin.api.AProcessor;
import com.cdkj.coin.core.ObjValidater;
import com.cdkj.coin.dto.req.PushTxConfirmReq;
import com.cdkj.coin.exception.BizException;
import com.cdkj.coin.exception.ParaException;
import com.cdkj.coin.proxy.JsonUtil;
import com.cdkj.coin.spring.SpringContextHolder;

/**
 * Created by tianlei on 2017/十一月/02.
 */
public class XN616020 extends AProcessor{

   private PushTxConfirmReq req;

    private IEthTxAO ethTxAO = SpringContextHolder
            .getBean(IEthTxAO.class);


    @Override
    public void doCheck(String inputparams) throws ParaException {

        req = JsonUtil.json2Bean(inputparams,PushTxConfirmReq.class);
//        if ()
        ObjValidater.validateReq(req);

    }

    @Override
    public Object doBusiness() throws BizException {

      return  this.ethTxAO.confirmPush(req.getHashList());
    }
}
