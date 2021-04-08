package com.yublee.standard;
/*
 * Interface
 * 
 * Java언어를 사용하는 프로젝트를 구현할때
 * 모든 코드는 클래스를 기초로 만들어 진다
 * 클래스를 만들기 위해서는 여러가지 조건에 맞도록 설계해야 함
 * 설계를 하고 설계된 내용으로 문서화 하는데 실제 개발현장에서 문서화 된 
 * 설계 내용은 잘 지켜지지 않는 경우가 많음
 * > 여러클래스가 연동되는 프로젝트의 겅우 특히 method의 이름을 잘못(다르게)지어
 * 코드 연결(연동)이 어려워짐
 * 
 * 인터페이스는 여러개발자들이 협업을 할 때 
 * 클래스, method 규칙을 코드로 구현하여 클래스를 만들때 반드시
 * implements하도록 강제 함
 * 인터페이스를 impl한 클래스는 인터페이서에 설계된
 * 추상메서드를 반드시 자식이 만들 클래스에서 구현해야 함
 * 그러한 규칙을 강제함으로써 연결, 연동의 혼란을 최소화 함
 * 
 * 키보드로 정수를 입력받기 위한 클래스
 * 
 * 키보드로 정수를 입력받으면서 QUIT 입력받으면 취소하고 null 값 return
 * 								정수를 입력받으면 정수값 return
 */
public interface InputService {
	//명명방식은 class랑 똑같음
	//한개의 파일에 한개의 인터페이스만
	//메서드의 구체적인 내용이 없음 >> 이런 메서드를 만들겠다 설계도
	
	
	
	public Integer inputValue(String title);
	public Integer inputValue(String title, int start);
	public Integer inputValue(String title, int start , int end);

}
