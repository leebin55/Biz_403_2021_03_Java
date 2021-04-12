package com.callor.app.service.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.app.model.ScoreVO;
import com.callor.app.service.ScoreService;
import com.yublee.standard.InputService;
import com.yublee.standard.MenuService;
import com.yublee.standard.impl.InputServiceImplV1;
import com.yublee.standard.impl.MenuServiceImplV1;

public class ScoreServiceImplV2 implements ScoreService {

	protected MenuService menuSer;
	protected List<ScoreVO> scoreList;
	protected Scanner scan;
	protected InputService inService;

	public ScoreServiceImplV2() {
		scan = new Scanner(System.in);
		scoreList = new ArrayList<ScoreVO>();
		inService = new InputServiceImplV1();
	}

	@Override
	public void selectMenu() {
		/*
		 * 보통 멤버변수 (클래스 영역에 선언된 변수들 ) 객체는 이 클래스의 생성자에서 만드는 것이 좋다
		 * 
		 * 하지만 객체를 생성할 때 전달해야할 매개변수(파라메터) 에 대하여 수행해야할 연산코드가 있을 경우는 객체를 사용하기 전에 객체를 생성하는
		 * 코드를 작성하여도 된다
		 */
		List<String> scoreMenu = new ArrayList<String>();
		scoreMenu.add("성적입력");
		scoreMenu.add("성적리스트 출력");
		scoreMenu.add("성적저장");

		menuSer = new MenuServiceImplV1("빛고을 고교 성적처리", scoreMenu);

		while (true) {
			Integer menu = menuSer.selectMenu();
			if (menu == null) {
				System.out.println("업무종료");
				break;
			}
			if (menu == 1) {
				this.inputScore();
			} else if (menu == 2) {
				this.printScore();
			} else if (menu == 3) {
				this.saveScore();
			}
		}
	}

	public String inputNum() {

		String strNum = null;
		Integer intNum = inService.inputValue("학번", 1);
		// inputValue 는 정수값과 QUIT값만 return
		// 정수일때는 두번째 매개변수 이상
		if (intNum != null) {
			strNum = String.format("2021%03d", intNum);
		}
		return strNum;
	}

	public String inputName() {

		while (true) {
			System.out.print("이름 입력 (종료 : QUIT) >>");
			String strName = scan.nextLine();
			if (strName.equals("QUIT")) {
				return null;
			} else if (strName.trim().equals("")) {
				System.out.println("이름을 입력하세요");
				continue;
			}
			return strName;
		}
	}

	@Override
	public void inputScore() {
		// 학번 입력, 이름입력, 과목별 성적 입력
		// ScoreVO객체에 담고 , list 에 추가
		// ScoreVO 에 담고 == ScoreVO 클래스를 사용하여 생성한 객체에 담고

		String strNum = this.inputNum();
		if (strNum == null) {
			return;
		}
		String strName = this.inputName();
		if (strName == null) {
			return;
		}
		// inputValue 는 정수값 (첫번째 매개변수 ~ 두번째 매개변수) 의 값과
		// null값을 return 하는 method
		Integer intKor = inService.inputValue("국어", 0, 100);
		if (intKor == null) {
			return;
		}
		Integer intEng = inService.inputValue("영어", 0, 100);
		if (intEng == null) {
			return;
		}
		Integer intMath = inService.inputValue("수학", 0, 100);
		if (intMath == null) {
			return;
		}

		ScoreVO scoreVO = new ScoreVO();
		scoreVO.setKor(intKor);
		scoreVO.setEng(intEng);
		scoreVO.setMath(intMath);
		scoreVO.setNum(strNum);
		scoreVO.setName(strName);

		scoreList.add(scoreVO);

	}

	@Override
	public void saveScore() {
		while (true) {
			System.out.println("성적리스트 저장");
			System.out.println("저장할 파일 이름을 입력하세요");
			System.out.print(">>  ");
			String strFileName = scan.nextLine();
			if (strFileName.equals("")) {
				System.out.println("파일이름을 입력해야 합니다");
				continue;
			}
			FileWriter fileWriter = null;
			PrintWriter out = null;
			
			strFileName = "src/com/callor/app/" + strFileName + ".txt"; 
			//방금저장한 파일이름으로 저장하겠다
			//.csv로 확장자 > ,를 기준으로 엑셀가능
			try {
				fileWriter = new FileWriter(strFileName);
				out = new PrintWriter(fileWriter);
				int nSize = scoreList.size();
				/* 
				 * 파일에 저장할때
				 * 각 데이터를 컴마(,)로 구분하여 입력하고 
				 * 파일 이름을 *.csv로 저장하면
				 * exel 파일에서 읽을 수 있음
				 * 
				 * csv : comma - separated - variables
				 * 컴마를 기준으로 값을 구분
				 * 
				 * 
				 */
				for(int i = 0; i < nSize ; i++) {
					ScoreVO vo = scoreList.get(i);
					out.print(vo.getNum() + ", ");
					out.print(vo.getName() + ", ");
					out.print(vo.getKor() + ", ");
					out.print(vo.getEng() + ", ");
					out.println(vo.getMath());
					
				}
				out.flush();
				out.close();
			} catch (IOException e) {
				System.out.println("파일을 생성할 수 없습니다.");
				System.out.println("파일 이름을 다시 입력해 주세요");
				continue;
			}
			return;//while문에서빠져나오도록
		}
	}

	@Override
	public void readScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public Integer checkScore() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void printScore() {
		// TODO Auto-generated method stub

	}

}
