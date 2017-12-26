package com.companyname.rebate.component;


import com.companyname.rebate.RebateBO;
import com.companyname.rebate.RebateDataResultDTO;

public interface RebateComponent {
	RebateDataResultDTO getValue(RebateBO rebateBO);
	void setComponent(RebateComponent component);
}
