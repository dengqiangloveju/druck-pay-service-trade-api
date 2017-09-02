package com.druck.pay.exception;

public class TradeBizException extends BizException {
	private static final long serialVersionUID = -8220897746205578335L;
	/** 订单异常 **/
	public static final int TRADE_ORDER_ERROR = 104;
	/** 交易系统异常 **/
	public static final int TRADE_SYSTEM_ERROR = 108;
	/** 交易系统异常 **/
	public static final int TRADE_MESSAGE_ERROR = 109;
	/** 支付订单号重复 **/
	public static final int TRADE_ORDER_NO_REPEAT_ERROR = 101;
	
	public TradeBizException() {
	}
	
	public TradeBizException(int code, String msg) {
		super(code, msg);
	}
	
	public TradeBizException(int code, String msgFormat, Object... args) {
		super(code, msgFormat, args);
	}
}
