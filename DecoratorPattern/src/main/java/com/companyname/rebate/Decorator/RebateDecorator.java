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



    @Override
    public void setComponent(RebateComponent component) {
        this.component = component;
    }
    public static RebateComponent stream(RebateComponent... rebateComponents) {
        RebateComponent head= null;
        for (int i = 0; i < rebateComponents.length; i++) {
            RebateComponent component = rebateComponents[i];
            if (i==0){
                head = component;
            }else{
                rebateComponents[i-1].setComponent(component);
            }
        }
        return head;
    }
}
