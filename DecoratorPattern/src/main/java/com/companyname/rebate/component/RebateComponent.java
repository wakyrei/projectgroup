package com.companyname.rebate.component;


import com.companyname.rebate.RebateDataDTO;
import com.companyname.rebate.RebateDataResultDTO;
import com.companyname.rebate.RebateService;

public interface RebateComponent {
	RebateDataResultDTO getValue(RebateDataDTO rebateDataDTO);
	RebateService getRebateService();
	void setComponent(RebateComponent component);
}
