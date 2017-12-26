package com.companyname.rebate;

import com.companyname.rebate.Decorator.CheckSellCurStatus;
import com.companyname.rebate.Decorator.CheckSellOrderStatus;
import com.companyname.rebate.Decorator.RebateDecorator;
import com.companyname.rebate.component.RebateJoinOrderWithSell;
import com.companyname.rebate.component.RebateComponent;

public class Test {
    public static void main(String[] args) {
        RebateService service = new RebateService();
        RebateDate rebateDate = new RebateDate();
        RebateBO rebateBO = new RebateBO(rebateDate, service);


        RebateComponent stream = RebateDecorator.stream(
                new CheckSellOrderStatus(),
                new CheckSellCurStatus(),
                new RebateJoinOrderWithSell()
        );

        RebateDataResultDTO value = stream.getValue(rebateBO);

        System.out.println(value.isOk+"/"+value.value);

    }
}
