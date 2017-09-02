package com.druck.pay.domain;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import org.hibernate.annotations.GenericGenerator;

/**
 * DruckPayOrder entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "druck_pay_order", uniqueConstraints = @UniqueConstraint(columnNames = {"merchant_order_no", "merchant_no"}))
public class DruckPayOrder implements java.io.Serializable {

	// Fields
	private static final long serialVersionUID = -4766001979642826739L;
	private String id;
	private String merchantNo;
	private String merchantOrderNo;
	private String druckOrderNo;
	private String bankOrderNo;
	private String productName;
	private Double orderAmount;
	private Double payAmount;
	private String isRefund;
	private String orderIp;
	private Integer refundTimes;
	private Short orderPeriod;
	private Date expireTime;
	private Date createTime;
	private Date editTime;
	private Date orderDate;
	private Date orderTime;
	private String returnUrl;
	private String notifyUrl;
	private String status;
	private String payWayCode;
	private Integer recordTimes;
	private String remark;
	private String field1;
	private String field2;
	private String field3;
	private String field4;
	private String field5;

	// Constructors

	/** default constructor */
	public DruckPayOrder() {
	}

	/** minimal constructor */
	public DruckPayOrder(String merchantNo, String merchantOrderNo,
			String druckOrderNo, String bankOrderNo, Double orderAmount,
			Date createTime) {
		this.merchantNo = merchantNo;
		this.merchantOrderNo = merchantOrderNo;
		this.druckOrderNo = druckOrderNo;
		this.bankOrderNo = bankOrderNo;
		this.orderAmount = orderAmount;
		this.createTime = createTime;
	}

	/** full constructor */
	public DruckPayOrder(String merchantNo, String merchantOrderNo,
			String druckOrderNo, String bankOrderNo, String productName,
			Double orderAmount, Double payAmount, String isRefund,
			String orderIp, Integer refundTimes, Short orderPeriod,
			Date expireTime, Date createTime, Date editTime,
			Date orderDate, Date orderTime, String returnUrl,
			String notifyUrl, String status, String payWayCode,
			Integer recordTimes, String remark, String field1, String field2,
			String field3, String field4, String field5) {
		this.merchantNo = merchantNo;
		this.merchantOrderNo = merchantOrderNo;
		this.druckOrderNo = druckOrderNo;
		this.bankOrderNo = bankOrderNo;
		this.productName = productName;
		this.orderAmount = orderAmount;
		this.payAmount = payAmount;
		this.isRefund = isRefund;
		this.orderIp = orderIp;
		this.refundTimes = refundTimes;
		this.orderPeriod = orderPeriod;
		this.expireTime = expireTime;
		this.createTime = createTime;
		this.editTime = editTime;
		this.orderDate = orderDate;
		this.orderTime = orderTime;
		this.returnUrl = returnUrl;
		this.notifyUrl = notifyUrl;
		this.status = status;
		this.payWayCode = payWayCode;
		this.recordTimes = recordTimes;
		this.remark = remark;
		this.field1 = field1;
		this.field2 = field2;
		this.field3 = field3;
		this.field4 = field4;
		this.field5 = field5;
	}

	// Property accessors
	@Id
	@GenericGenerator(name = "generator", strategy = "uuid")
	@GeneratedValue(generator = "generator")
	@Column(name = "id", unique = true, nullable = false, length = 100)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "merchant_no", nullable = false, length = 100)
	public String getMerchantNo() {
		return this.merchantNo;
	}

	public void setMerchantNo(String merchantNo) {
		this.merchantNo = merchantNo;
	}

	@Column(name = "merchant_order_no", nullable = false, length = 30)
	public String getMerchantOrderNo() {
		return this.merchantOrderNo;
	}

	public void setMerchantOrderNo(String merchantOrderNo) {
		this.merchantOrderNo = merchantOrderNo;
	}

	@Column(name = "druck_order_no", nullable = false, length = 30)
	public String getDruckOrderNo() {
		return this.druckOrderNo;
	}

	public void setDruckOrderNo(String druckOrderNo) {
		this.druckOrderNo = druckOrderNo;
	}

	@Column(name = "bank_order_no", nullable = false, length = 30)
	public String getBankOrderNo() {
		return this.bankOrderNo;
	}

	public void setBankOrderNo(String bankOrderNo) {
		this.bankOrderNo = bankOrderNo;
	}

	@Column(name = "product_name", length = 300)
	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	@Column(name = "order_amount", nullable = false, precision = 20, scale = 6)
	public Double getOrderAmount() {
		return this.orderAmount;
	}

	public void setOrderAmount(Double orderAmount) {
		this.orderAmount = orderAmount;
	}

	@Column(name = "pay_amount", precision = 20, scale = 6)
	public Double getPayAmount() {
		return this.payAmount;
	}

	public void setPayAmount(Double payAmount) {
		this.payAmount = payAmount;
	}

	@Column(name = "is_refund", length = 30)
	public String getIsRefund() {
		return this.isRefund;
	}

	public void setIsRefund(String isRefund) {
		this.isRefund = isRefund;
	}

	@Column(name = "order_ip", length = 50)
	public String getOrderIp() {
		return this.orderIp;
	}

	public void setOrderIp(String orderIp) {
		this.orderIp = orderIp;
	}

	@Column(name = "refund_times")
	public Integer getRefundTimes() {
		return this.refundTimes;
	}

	public void setRefundTimes(Integer refundTimes) {
		this.refundTimes = refundTimes;
	}

	@Column(name = "order_period")
	public Short getOrderPeriod() {
		return this.orderPeriod;
	}

	public void setOrderPeriod(Short orderPeriod) {
		this.orderPeriod = orderPeriod;
	}

	@Column(name = "expire_time", length = 19)
	public Date getExpireTime() {
		return this.expireTime;
	}

	public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}

	@Column(name = "create_time", nullable = false, length = 19)
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Column(name = "edit_time", length = 19)
	public Date getEditTime() {
		return this.editTime;
	}

	public void setEditTime(Date editTime) {
		this.editTime = editTime;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "order_date", length = 10)
	public Date getOrderDate() {
		return this.orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	@Column(name = "order_time", length = 19)
	public Date getOrderTime() {
		return this.orderTime;
	}

	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}

	@Column(name = "return_url", length = 600)
	public String getReturnUrl() {
		return this.returnUrl;
	}

	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}

	@Column(name = "notify_url", length = 600)
	public String getNotifyUrl() {
		return this.notifyUrl;
	}

	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}

	@Column(name = "mstatus", length = 50)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "pay_way_code", length = 50)
	public String getPayWayCode() {
		return this.payWayCode;
	}

	public void setPayWayCode(String payWayCode) {
		this.payWayCode = payWayCode;
	}

	@Column(name = "record_times")
	public Integer getRecordTimes() {
		return this.recordTimes;
	}

	public void setRecordTimes(Integer recordTimes) {
		this.recordTimes = recordTimes;
	}

	@Column(name = "mremark", length = 200)
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Column(name = "field1", length = 500)
	public String getField1() {
		return this.field1;
	}

	public void setField1(String field1) {
		this.field1 = field1;
	}

	@Column(name = "field2", length = 500)
	public String getField2() {
		return this.field2;
	}

	public void setField2(String field2) {
		this.field2 = field2;
	}

	@Column(name = "field3", length = 500)
	public String getField3() {
		return this.field3;
	}

	public void setField3(String field3) {
		this.field3 = field3;
	}

	@Column(name = "field4", length = 500)
	public String getField4() {
		return this.field4;
	}

	public void setField4(String field4) {
		this.field4 = field4;
	}

	@Column(name = "field5", length = 500)
	public String getField5() {
		return this.field5;
	}

	public void setField5(String field5) {
		this.field5 = field5;
	}

}