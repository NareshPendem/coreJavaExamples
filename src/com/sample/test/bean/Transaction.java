package com.sample.test.bean;

public class Transaction {

	private String type;
	private String txnID;
	
	
	
	/**
	 * @param type
	 * @param txnID
	 */
	public Transaction(String type, String txnID) {
		super();
		this.type = type;
		this.txnID = txnID;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the txnID
	 */
	public String getTxnID() {
		return txnID;
	}
	/**
	 * @param txnID the txnID to set
	 */
	public void setTxnID(String txnID) {
		this.txnID = txnID;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Transaction [type=" + type + ", txnID=" + txnID + "]";
	}
	
	
	
}
