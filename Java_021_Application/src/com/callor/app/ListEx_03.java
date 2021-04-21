package com.callor.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.callor.app.model.ScoreVO;

public class ListEx_03 {

	public static void main(String[] args) {

		//랜덤으로 국영수 과목의 점수를 020 형식으로 
		// List 에 저장 >> 10번 반복
		Random rnd = new Random();
		List<ScoreVO> scoreList = new ArrayList<ScoreVO>();
		for( int i = 0; i <10 ; i++) {
			
			String strNum = String.format("%03d",i+1);
			Integer  intKor =  rnd.nextInt(100)+1;
			Integer  intEng =  rnd.nextInt(100)+1;
			Integer  intMath =  rnd.nextInt(100)+1;
			
			/*
			 * ScoreVO scoreVO = new ScoreVO();
			 * scoreVO.setstrNum(strNum);
			 * scoreVO.setKor(intKor);
			 * scoreVO.setEng(intEng);
			 * scoreVO.setMath(intMath);
			 * 
			 * 이과정을 밑에 두줄로 >>ScoreVO  클래스에서
			 * 생성자(매개변수......){  } 로 작성했으니 
			 */
			
			ScoreVO scoreVO = 
					new ScoreVO(strNum,intKor,intEng,intMath);
			
			scoreList.add(scoreVO);//List에 저장
		} //end for 
		
		//static method 는 객체와 무관하게 그냥 메소드 이름으로 부를수 있음
		//평균 총점 정렬 없이 그냥 출력
		//메소드를 부르기 전에는 실행이 되지 않음
		printScore(scoreList);
		
		
		totalAndAvg(scoreList);
		//합과 평균을 계산에서 scoreList에 담고 출력
		printScore(scoreList);
		
		
		sort(scoreList);
		//합계 + 평균 오름차순(합계기준) 정렬 
		printScore(scoreList);
		
	
	}//end main
	/*
	 * non-static 메소드(인스턴스 메소드) 
	 * 	> 클래스를 이용하여  생성된 객체 변수를 통해 호출
	 * 
	 * static method (클래스 메소드)
	 * 	> 객체와 무관하게 클래스 이름만으로 호출 가능 
	 *		즉, 클래스를 참조할 수 있는 곳이면 어드든 객체와 무관하게
	 *				호출 가능
	 *	> non-static method 호출 non-static field참조불가
	 *	> static 필드만 참조 가능
	 * 
	 */
	
	public static void totalAndAvg(List<ScoreVO> scList) {
		
		for(ScoreVO scoreVO : scList) { 
			//ScoreVO 형 scoreVO 객체를 선언하고
			// 거기에 scList를 하나씩 반복해서 값을 넣음
			Integer total = scoreVO.getKor();
			total += scoreVO.getEng();
			total += scoreVO.getMath();
			
			Integer avg = total / 3;
			scoreVO.setTotal(total);
			scoreVO.setAvg(avg);
			
			
		}
	}// end totlaAndAvg
	
	//scList 데이터중 total 변수를 기준으로 정렬하기
	
	public static void sort(List<ScoreVO> scList) {
		
		int nSize = scList.size();
		for( int i = 0; i < nSize ; i++) {
			for (int j = i+1 ; j < nSize ; j++) {
				//i번째 담긴 total값을 iTotal
				//j번째 담긴 total 값을 jTotal >> 그냥 변수에 담음
				Integer iTotal = scList.get(i).getTotal();
				Integer jTotal = scList.get(j).getTotal();
				
				if(iTotal > jTotal) {
					ScoreVO v = scList.get(i);
					//ScoreVO 자료형 변수 v는 scoreList i번째 담긴값 
					scList.set(i, scList.get(j));
					scList.set(j, v);
				}
			}
			
		}
	}//end sort
	
	public static void printScore(List<ScoreVO> scList) {
		System.out.println("=".repeat(50));
		for(ScoreVO vo : scList) {
			System.out.print(vo.getStrNum() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMath() + "\t");
			System.out.print(vo.getTotal() + "\t");
			System.out.print(vo.getAvg() + "\n");
			
		}
		System.out.println("=".repeat(50));
	}
}
