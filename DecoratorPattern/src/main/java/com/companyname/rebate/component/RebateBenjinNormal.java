package com.companyname.rebate.component;


import com.companyname.rebate.RebateDataDTO;
import com.companyname.rebate.RebateDataResultDTO;
import com.companyname.rebate.RebateService;

public class RebateBenjinNormal implements RebateComponent {
    public RebateService rebateService;

    public RebateBenjinNormal(RebateService rebateService) {
        this.rebateService = rebateService;
    }


    @Override
    public RebateDataResultDTO getValue(RebateDataDTO rebateDataDTO) {
        RebateDataResultDTO dto = this.rebateService.getBenjinNormal(rebateDataDTO);
        System.out.println("获得本金值");
        return dto;
    }

    public RebateService getRebateService() {
        return rebateService;
    }

    public void setComponent(RebateComponent component) {
        
    }

}
