package com.companyname.rebate.Decorator;


import com.companyname.rebate.RebateDataDTO;
import com.companyname.rebate.RebateDataResultDTO;
import com.companyname.rebate.component.RebateComponent;

public class CheckSellCurStatus extends RebateDecorator {

    public CheckSellCurStatus(RebateComponent component) {
        super(component);
    }

    public CheckSellCurStatus() {
        super(null);
    }

    @Override
    public RebateDataResultDTO getValue(RebateDataDTO rebateDataDTO) {
        RebateDataResultDTO dto = this.rebateService.checkSellCurStatus(rebateDataDTO);
        if (!dto.isOk) {
            return dto;
        }
        System.out.println("处理卖方当前状态");
        return super.getValue(rebateDataDTO);
    }


}
