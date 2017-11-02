package com.cdkj.coin.ao;

import java.util.List;

/**
 * Created by tianlei on 2017/十一月/02.
 */
public interface IEthTxAO {

    // 定时器调用：每隔**同步账户流水
    public void doEthTransactionSync();

    // 确认推送成功
    public Object confirmPush(List<String> hashList);
}
