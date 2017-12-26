package com.companyname.rebate;

public class RebateService {

	public RebateDataResultDTO checkSellOrderStatus(RebateDataDTO rebateDataDTO) {
		// TODO Auto-generated method stub
		RebateDataResultDTO rebateDataResultDTO = new RebateDataResultDTO();
		rebateDataResultDTO.isOk = true;
		return rebateDataResultDTO;
	}

	public RebateDataResultDTO checkSellCurStatus(RebateDataDTO rebateDataDTO) {
		// TODO Auto-generated method stub
		RebateDataResultDTO rebateDataResultDTO = new RebateDataResultDTO();
		rebateDataResultDTO.isOk = true;
		return rebateDataResultDTO;
	}

	public RebateDataResultDTO getBenjinNormal(RebateDataDTO rebateDataDTO) {
		// TODO Auto-generated method stub
		RebateDataResultDTO rebateDataResultDTO = new RebateDataResultDTO();
		rebateDataResultDTO.value = 100;
		return rebateDataResultDTO;
	}

}
