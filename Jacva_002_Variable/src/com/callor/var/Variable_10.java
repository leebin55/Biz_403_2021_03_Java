package com.callor.var;

public class Variable_10 {

	public static void main(String[] args) {
		
		//명령이 실행될때마다 1씩증가하는 값으로 설정
		
		int intNum = 1; // 시작하는 값
		intNum++; // 시작하는 값 + 1
		intNum++ ; // 시작하는 값 + 1 + 2
		
		int intNum1 = 100;
		intNum1++; //101
		intNum1++; //102
		
		intNum1 = 99;
		intNum1 ++ ; //100
		
		intNum1 =0;
		intNum1 ++; //1
		
		intNum1 = 1;
		intNum1 += 2; // 1+ 2
		intNum1 += 2; //1 + 2+ 2
		intNum1 += 2; // 1+ 2 + 2 + 2
		
		intNum1 = 0;
		int intSum = 0;
		
		//intSum = intSum + intNum1
		//		 =   0    +   0
		intSum += intNum1 ; //intSum ==?
		
		//intNum1을 1 증가하고 ==1 이된다
		//intNum1 에 저장된 1을
		//intSum 에 저장하라
		//intSum = 0 + 1
		intSum += ( ++intNum1) ;
	
		//intNum 을 1증가 == 2 
		//intNum1 에 저장된 2를 더하여 
		//intSum에 저장하라
		//intSum = intSum + intNum1;
		//intSum =    1   +    2
		
		//intNum1을 1증가 intNum1 == 3
		//ntSum에 intNum1에 저장된 3을 더하여
		//intSum = intSum + intNum1
		//
		intSum += ++intNum1;
		
		intSum += ++intNum1;
		
		intNum = 0;
		intSum = 0;
		
		// 1씩 증가(변화)되는 intNum 변수의 값을  
		//intSum 변수에 누적한다(싼는다)
		intSum += ++intNum; // 0 + 1 을 intSum 에 저장
		intSum += ++intNum; // 1 + 2  intSum에 저장
		intSum += ++intNum; // 3 + 3 intSum에 저장
		intSum += ++intNum; // 6 + 4 intSum 에 저장
	
		intNum = 1;
		intSum = 0 ;
		
		// 처음에 만들어진 intNum값 (1)을
		// intSum 변수에 누적하고
		// 다음줄 코드를 위하여
		// intNum를 1증가
		intSum += intNum++; // 0 + 1 (아직 intNum의 값에서 1이 증가XX >>++가 뒤에 있기때문)	
		intSum += intNum++; // 1 + 2
	}
}
