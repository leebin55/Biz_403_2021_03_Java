# 나의 JDK

* 프로젝트를 수행하는 과정에서 생성한 클래스 중에 다른 프로젝트에서도 활용할 수 있는 코드 생성

* 직접 만든 클래스를 JDK처럼 만들어 두고 다른 프로젝트에서도 활용할 수 있도록 구현

* "라이브러리" : JDK처럼 클래스 모음을 만들어 두고, 다른 프로젝트에서 연결하여 사용할 수 있도록 만든 프로젝트

## InputService

* since 2021.04
* 키보드(Scanner)를 사용하여 정수를 입력받는 JDK
* 문자열 prompt 를 보여주고 정수 입력박기
* 입력중 QUIT 를 누르면 입력 취소 (return null)
* 범위를 지정하여 입력받는 정수 유효성 검사

## InputServiceImplV1

* since 2021.04
* InputServic interface 구현체 