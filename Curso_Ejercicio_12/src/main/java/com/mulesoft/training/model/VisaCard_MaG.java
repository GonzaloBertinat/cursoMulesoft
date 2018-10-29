package com.mulesoft.training.model;

public class VisaCard_MaG {

	String card_no;
	int processor_id;
	int amount_granted;
	String partner;
	public String getCard_no() {
		return card_no;
	}
	public void setCard_no(String card_no) {
		this.card_no = card_no;
	}
	public int getProcessor_id() {
		return processor_id;
	}
	public void setProcessor_id(int processor_id) {
		this.processor_id = processor_id;
	}
	public int getAmount_granted() {
		return amount_granted;
	}
	public void setAmount_granted(int amount_granted) {
		this.amount_granted = amount_granted;
	}
	public String getPartner() {
		return partner;
	}
	public void setPartner(String partner) {
		this.partner = partner;
	}
	public VisaCard_MaG(String card_no, int processor_id, int amount_granted, String partner) {
		super();
		this.card_no = card_no;
		this.processor_id = processor_id;
		this.amount_granted = amount_granted;
		this.partner = partner;
	}
	
	public VisaCard_MaG(){}
}
