package com.companyname.rebate.Decorator;

import com.companyname.rebate.RebateDataDTO;
import com.companyname.rebate.RebateDataResultDTO;
import com.companyname.rebate.component.RebateComponent;

public class CheckSellOrderStatus extends RebateDecorator{

	public CheckSellOrderStatus(RebateComponent component) {
		super(component);
	}

	public CheckSellOrderStatus() {
		super(null);
	}

	@Override
	public RebateDataResultDTO getValue(RebateDataDTO rebateDataDTO) {
		RebateDataResultDTO dto = this.rebateService.checkSellOrderStatus(rebateDataDTO);
		if (!dto.isOk) {
			return dto;
		}        
		System.out.println("处理卖方订单状态");
		return super.getValue(rebateDataDTO);
	}

}
