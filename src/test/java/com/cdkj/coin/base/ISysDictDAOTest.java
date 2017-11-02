package com.cdkj.coin.base;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

import com.cdkj.coin.dao.IEthTransactionDAO;
import com.cdkj.coin.domain.EthAddress;
import com.cdkj.coin.domain.EthTransaction;
import com.cdkj.coin.enums.EPushStatus;
import org.junit.Test;
import org.unitils.spring.annotation.SpringBeanByType;

import com.cdkj.coin.dao.ISYSDictDAO;
import com.cdkj.coin.domain.SYSDict;

public class ISysDictDAOTest extends ADAOTest {

    @SpringBeanByType
    private ISYSDictDAO sysDictDAO;

    @SpringBeanByType
    private IEthTransactionDAO ethTransactionDAO;


    @Test
    public void insert() {
        SYSDict data = new SYSDict();
        data.setType("1");
        data.setParentKey("parentKey");
        data.setDkey("dkey");
        data.setDvalue("dvalue");

        data.setUpdater("updater");
        data.setUpdateDatetime(new Date());
        data.setRemark("remark");
        data.setCompanyCode("companyCode");
        data.setSystemCode("systemCode");
        sysDictDAO.insert(data);
        logger.info("insert : {}", data.getId());

    }

    @Test
    public void select() {
        SYSDict condition = new SYSDict();
        condition.setId(1L);
        SYSDict data = sysDictDAO.select(condition);
        logger.info("select : {}", data.getId());
    }

    @Test
    public void selectList() {
        SYSDict condition = new SYSDict();
        condition.setType("0");
        condition.setParentKey("A");
        Long count = sysDictDAO.selectTotalCount(condition);
        logger.info("selectList : {}", count);
    }

    @Test
    public void testTx() {

        EthTransaction ethTransaction = new EthTransaction();
        ethTransaction.setStatus("0");
        List ls = this.ethTransactionDAO.selectList(ethTransaction);


        EthTransaction transaction = new EthTransaction();
        transaction.setHash("0xss");
        transaction.setNonce(new BigInteger(String.valueOf(121)));

        transaction.setBlockHash("0xss");
        transaction.setBlockNumber("0xss");
        transaction.setTransactionIndex(new BigInteger(String.valueOf(121)));

        transaction.setFrom("0xss");
        transaction.setTo("0xss");

        transaction.setValue("0xss");
        transaction.setGasPrice("0xss");
        transaction.setGas(new BigInteger(String.valueOf(121)));

        //
        transaction.setStatus("0");
        transaction.setBlockCreateDatetime(new Date());
//        transaction.setSyncDatetime(); db set

        this.ethTransactionDAO.insert(transaction);

    }

}
