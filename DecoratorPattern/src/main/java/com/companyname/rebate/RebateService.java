package com.companyname.rebate;

public class RebateService {

	public RebateDataResultDTO checkSellOrderStatus(RebateDate rebate) {
		// TODO Auto-generated method stub
		RebateDataResultDTO rebateDataResultDTO = new RebateDataResultDTO();
		rebateDataResultDTO.isOk = true;
		rebateDataResultDTO.value = "卖方订单状态"+(rebateDataResultDTO.isOk?"成功":"失败");
		return rebateDataResultDTO;
	}

	public RebateDataResultDTO checkSellCurStatus(RebateDate rebate) {
		// TODO Auto-generated method stub
		RebateDataResultDTO rebateDataResultDTO = new RebateDataResultDTO();
		rebateDataResultDTO.isOk = true;
		rebateDataResultDTO.value = "卖方订单状态"+(rebateDataResultDTO.isOk?"成功":"失败");
		return rebateDataResultDTO;
	}

	public RebateDataResultDTO getBenjinNormal(RebateDate rebate) {
		// TODO Auto-generated method stub
		RebateDataResultDTO rebateDataResultDTO = new RebateDataResultDTO();
		rebateDataResultDTO.isOk = true;
		rebateDataResultDTO.value = "获取本金值"+(rebateDataResultDTO.isOk?"成功":"失败");
		return rebateDataResultDTO;
	}

}
