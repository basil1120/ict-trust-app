package com.digiapps.main.entities;

public class ResponsePayload {

	private String statusCode;
	private String statusDescription;
	private String additionalDetails;
	private String transactionDate;
	
	public String getStatusCode() {return statusCode;}
	public void setStatusCode(String statusCode) {this.statusCode = statusCode;}
	
	public String getStatusDescription() {return statusDescription;}
	public void setStatusDescription(String statusDescription) {this.statusDescription = statusDescription;}
	
	public String getAdditionalDetails() {return additionalDetails;}
	public void setAdditionalDetails(String additionalDetails) {this.additionalDetails = additionalDetails;}
	
	public String getTransactionDate() {return transactionDate;}
	public void setTransactionDate(String transactionDate) {this.transactionDate = transactionDate;}
	
}
