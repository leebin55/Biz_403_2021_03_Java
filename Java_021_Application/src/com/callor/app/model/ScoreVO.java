package com.callor.app.model;

public class ScoreVO {

	private String strNum;
	private Integer kor;
	private Integer eng;
	private Integer math;
	
	private Integer total;
	private Integer avg;
	
	public ScoreVO() { // default 생성자
	}
	public ScoreVO(String strNum, Integer kor, Integer eng, Integer math) {  
		// 매개변수를 활용한 생성자, 생성할때 값을 넣어줘야
		super(); //부모클래스의 생성자 호출
		this.strNum = strNum; 
		// this.strNum 는 strNum 로 써도 무관
		// 쉽게 구별하기 위해 멤버변수인 strNum 을 this.strNum으로 
		this.kor =kor;
		this.eng = eng;
		this.math = math;
		this.avg = avg;
		this.total = total;
	}
	@Override
	public String toString() {
		return "ScoreVO [strNum=" + strNum + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", total=" + total
				+ ", avg=" + avg + "]";
	}
	public String getStrNum() {
		return strNum;
	}
	public void setStrNum(String strNum) {
		this.strNum = strNum;
	}
	public Integer getKor() {
		return kor;
	}
	public void setKor(Integer kor) {
		this.kor = kor;
	}
	public Integer getEng() {
		return eng;
	}
	public void setEng(Integer eng) {
		this.eng = eng;
	}
	public Integer getMath() {
		return math;
	}
	public void setMath(Integer math) {
		this.math = math;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public Integer getAvg() {
		return avg;
	}
	public void setAvg(Integer avg) {
		this.avg = avg;
	}
}
