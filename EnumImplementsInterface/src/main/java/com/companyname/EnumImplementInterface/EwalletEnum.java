package com.companyname.EnumImplementInterface;

import java.util.UUID;

public enum EwalletEnum implements IdGenerate{
    NET_COIN("网币",1) {
        public String getTransactionId() {
            String uuid = UUID.randomUUID().toString().replace("-", "");;
            return  "WBTZ"+"_"+uuid;
        }
    },
    DIS_COIN("折扣",2) {
        public String getTransactionId() {
            String uuid = UUID.randomUUID().toString().replace("-", "");;
            return  "ZKTZ"+"_"+uuid;
        }
    },
    CX_COIN("重消",3) {
        public String getTransactionId() {
            String uuid = UUID.randomUUID().toString().replace("-", "");;
            return  "CXTZ"+"_"+uuid;
        }
    };
    
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
