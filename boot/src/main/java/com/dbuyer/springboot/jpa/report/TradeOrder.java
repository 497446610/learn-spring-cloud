package com.dbuyer.springboot.jpa.report;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 会员信息
 * @author Administrator
 *
 */
@Entity
@Table(name="yjxg_qxd_trade_order")
public class TradeOrder {

	@Id
	@Column(name="tradeid",length=2)
	private String tradeId;
	
	/**
	 */
	@Column(name="tablename",length=2)
	private String tableName;
	
	private BigDecimal amount;

	public String getTradeId() {
		return tradeId;
	}

	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	
	
	
}
