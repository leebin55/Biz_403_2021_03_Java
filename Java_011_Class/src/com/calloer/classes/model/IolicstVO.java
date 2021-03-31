package com.calloer.classes.model;

public class IolicstVO {
	
	private String date;
	private String proname;
	private String conname;
	private boolean purorsell;
	private int count;
	private int purprice;
	private int sellprice;
	
	//변수의 이름과 타입 결정
	//private으로 설정
	//getter 와 setter생성 alt shitf s
	
	public String getProname() {
		return proname;
	}
	public void setProname(String proname) {
		this.proname = proname;
	}
	public String getConname() {
		return conname;
	}
	public void setConname(String conname) {
		this.conname = conname;
	}
	public boolean isPurorsell() {
		return purorsell;
	}
	public void setPurorsell(boolean purorsell) {
		this.purorsell = purorsell;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getPurprice() {
		return purprice;
	}
	public void setPurprice(int purprice) {
		this.purprice = purprice;
	}
	public int getSellprice() {
		return sellprice;
	}
	public void setSellprice(int sellprice) {
		this.sellprice = sellprice;
	}
	
	
}
