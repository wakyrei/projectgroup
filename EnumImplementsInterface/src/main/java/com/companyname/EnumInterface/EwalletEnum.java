package com.companyname.EnumInterface;

public enum EwalletEnum {
    NET_COIN("网币",1),
    DIS_COIN("折扣",2),
    CX_COIN("重消",3);
    
    public String type;
    public int value;

    EwalletEnum(String type, int value) {
        this.type = type;
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public int getValue() {
        return value;
    }
}
