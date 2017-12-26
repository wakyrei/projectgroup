package com.companyname.rebate;

import com.companyname.rebate.Decorator.CheckSellOrderStatus;
import com.companyname.rebate.component.RebateComponent;

public class RebateServiceStream {
    public RebateComponent head;
    public RebateComponent cur;
    public RebateServiceStream pro(RebateComponent rebateComponent) {
        if (head == null) {
            head = rebateComponent;
        }
        if (cur!=null){
            cur.setComponent(rebateComponent);
        }
        cur = rebateComponent;
        return this;
    }
    public static RebateServiceStream getOne(){
        return new RebateServiceStream();
    }
}
