package com.druck.pay.enums;

public enum TradeStatusEnum {
	SUCCESS("0"),

	WAITING_PAYMENT("1");
	
	private String desc;
	
	private TradeStatusEnum(String desc) {
		this.desc = desc;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
}
