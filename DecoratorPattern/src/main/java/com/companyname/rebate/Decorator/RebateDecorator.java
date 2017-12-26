package com.companyname.rebate.Decorator;

import com.companyname.rebate.RebateBO;
import com.companyname.rebate.RebateDataResultDTO;
import com.companyname.rebate.component.RebateComponent;

public class RebateDecorator implements RebateComponent {
    public RebateComponent component;

    @Override
    public RebateDataResultDTO getValue(RebateBO rebateBO) {
        return component.getValue(rebateBO);
    }


    public RebateDecorator(RebateComponent component) {
        this.component = component;
    }
}
