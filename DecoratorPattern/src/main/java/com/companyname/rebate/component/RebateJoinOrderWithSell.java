package com.companyname.rebate.component;


import com.companyname.rebate.RebateBO;
import com.companyname.rebate.RebateDataResultDTO;
import com.companyname.rebate.RebateService;

public class RebateJoinOrderWithSell implements RebateComponent {
    public RebateService rebateService;

    @Override
    public RebateDataResultDTO getValue(RebateBO rebateBO) {
        RebateDataResultDTO dto = rebateBO.ervice.getBenjinNormal(rebateBO.rebateDate);
        return dto;
    }

}
