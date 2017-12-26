package com.companyname.rebate;

import com.companyname.rebate.Decorator.CheckSellCurStatus;
import com.companyname.rebate.Decorator.CheckSellOrderStatus;
import com.companyname.rebate.component.RebateComponent;
import com.companyname.rebate.component.RebateJoinOrderWithSell;

public class Test {
    public static void main(String[] args) {
        RebateService service = new RebateService();
        RebateDate rebateDate = new RebateDate();
        RebateBO rebateBO = new RebateBO(rebateDate, service);
        RebateDataResultDTO value = 
                new CheckSellOrderStatus(
                        new CheckSellCurStatus(
                                new RebateJoinOrderWithSell()
                        )
                ).getValue(rebateBO);
        System.out.println(value.isOk + "/" + value.value);

    }
}
