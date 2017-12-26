package com.companyname.rebate.Decorator;

import com.companyname.rebate.RebateDataDTO;
import com.companyname.rebate.RebateDataResultDTO;
import com.companyname.rebate.RebateService;
import com.companyname.rebate.component.RebateComponent;

public class RebateDecorator implements RebateComponent {
    public RebateComponent component;
    public RebateService rebateService;

    public RebateDecorator(RebateComponent component) {
        this.component = component;
        this.rebateService = component.getRebateService();
    }

    @Override
    public RebateDataResultDTO getValue(RebateDataDTO rebateDataDTO) {
        return component.getValue(rebateDataDTO);
    }

    @Override
    public RebateService getRebateService() {
        return rebateService;
    }

    @Override
    public void setComponent(RebateComponent component) {
        this.component = component;
    }

}
