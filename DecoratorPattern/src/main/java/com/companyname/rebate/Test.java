package com.companyname.rebate;

import com.companyname.rebate.Decorator.CheckSellCurStatus;
import com.companyname.rebate.Decorator.CheckSellOrderStatus;
import com.companyname.rebate.component.RebateBenjinNormal;

public class Test {
    public static void main(String[] args) {
        RebateService service = new RebateService();

        RebateServiceStream pro = RebateServiceStream.getOne()
                .pro(new CheckSellOrderStatus())
                .pro(new CheckSellCurStatus())
                .pro(new RebateBenjinNormal(service));
        pro.head.getValue(new RebateDataDTO());
    }
}
