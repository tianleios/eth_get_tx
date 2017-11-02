package com.cdkj.coin.enums;

import java.util.HashMap;
import java.util.Map;

import com.cdkj.coin.exception.BizException;

//渠道类型分两大类：外部渠道和唯一的内部渠道（内部账）

public enum EChannelType {
    ETH("ETH", "以太坊"), NBZ("0", "内部账");

    public static Map<String, EChannelType> getChannelTypeResultMap() {
        Map<String, EChannelType> map = new HashMap<String, EChannelType>();
        for (EChannelType type : EChannelType.values()) {
            map.put(type.getCode(), type);
        }
        return map;
    }

    public static EChannelType getEChannelType(String code) {
        Map<String, EChannelType> map = getChannelTypeResultMap();
        EChannelType channelType = map.get(code);
        if (null == channelType) {
            throw new BizException("xn0000", code + "对应支付渠道类型不存在");
        }
        return channelType;
    }

    EChannelType(String code, String value) {
        this.code = code;
        this.value = value;
    }

    private String code;

    private String value;

    public String getCode() {
        return code;
    }

    public String getValue() {
        return value;
    }

}
