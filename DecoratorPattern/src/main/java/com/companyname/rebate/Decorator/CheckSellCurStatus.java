package com.companyname.rebate.Decorator;


import com.companyname.rebate.RebateBO;
import com.companyname.rebate.RebateDataResultDTO;

public class CheckSellCurStatus extends RebateDecorator {
    

    @Override
    public RebateDataResultDTO getValue(RebateBO rebateBO) {
        RebateDataResultDTO dto = rebateBO.ervice.checkSellCurStatus(rebateBO.rebateDate);
        if (!dto.isOk) {
            return dto;
        }
        return super.getValue(rebateBO);
    }


}
