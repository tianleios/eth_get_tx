package com.cdkj.coin.bo;

import java.math.BigInteger;
import java.text.ParseException;
import java.util.List;

import org.web3j.protocol.core.methods.response.EthBlock;

import com.cdkj.coin.bo.base.IPaginableBO;
import com.cdkj.coin.domain.EthTransaction;

public interface IEthTransactionBO extends IPaginableBO<EthTransaction> {

    //对象转换
    public EthTransaction convertTx(EthBlock.TransactionObject tx,BigInteger timestamp) ;

    //分页
    public List<EthTransaction> queryEthTxPage(EthTransaction condition, int start, int limit);

    //改变 交易状态 为以推送
    public void changeTxStatusToPushed(String txHash);

    //
    public int saveEthTransaction(EthTransaction tx);

    public List<EthTransaction> queryEthTransactionList(EthTransaction condition);

    public EthTransaction getEthTransaction(String hash);

    public String customTxByWalletFile(String from, String fromPassword,
            String to, BigInteger amount);
}
