package com.companyname.rebate.Decorator;


import com.companyname.rebate.RebateBO;
import com.companyname.rebate.RebateDataResultDTO;
import com.companyname.rebate.component.RebateComponent;

public class CheckSellCurStatus extends RebateDecorator {


    public CheckSellCurStatus(RebateComponent component) {
        super(component);
    }

    @Override
    public RebateDataResultDTO getValue(RebateBO rebateBO) {
        RebateDataResultDTO dto = rebateBO.ervice.checkSellCurStatus(rebateBO.rebateDate);
        if (!dto.isOk) {
            return dto;
        }
        return super.getValue(rebateBO);
    }


}
