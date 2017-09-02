package com.druck.pay.facade;

import java.util.Map;

import com.druck.pay.domain.DruckPayOrder;

public interface DruckPayOrderFacade {
	public void save(DruckPayOrder druckPayOrder);
	public void update(String druckOrderNo, String bankOrderNo, String status);
	public void completeScanPay(Map<String , String > notifyMessageMap);
	public DruckPayOrder getRecordByBankOrderNo(String bankOrderNo);
}
