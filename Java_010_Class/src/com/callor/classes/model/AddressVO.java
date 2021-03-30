package com.callor.classes.model;

public class AddressVO {
	/* 
	 * 가급적 VO에 private으로 만들고 유효성 검사가 필요한 항목은
	 * 아예 저장못하게 막는게 좋음 >정보의 은닉
	 */

	private String name; //private : 밖에서 접근 불가
	private String addr;
	private String tel;
	private Integer age;
	
	public void setAge(Integer age) {
		if(age > 1 && age <120) {
			this.age = age;	
		}else {
			this.age =null;
		}
	
	}
	public Integer getAge() {
		return this.age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAddr(String addr) {
		this.addr=addr;
	}
	public void setTel(String Tel) {
		this.tel=tel; 
	}
	//private 으로 선언된 변수를 외부에서 읽을수 있도록
	//일부 제한적으로 개방하기
	public String getName() {
		return this.name;
		
	}
	public String getAddr() {
		return this.addr;
	}
	public String getTel(){
		return this.tel;
	}
	
}
