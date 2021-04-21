package com.callor.app.service;

import java.util.List;
import java.util.Random;

import com.callor.app.model.DeckVO;

public class DeckServiceV1 {

	protected List<DeckVO> deckList;
	String strSuit = "다이아:하트:스페:클로버";
	String strDenomi = "A234567890KQJ";

	public DeckVO getDeck() {
		Random rnd = new Random();
		int nSize = deckList.size();
		int deckIndex = rnd.nextInt(nSize);

		DeckVO vo = new DeckVO();
		deckList.remove(deckIndex);
		// random으로 뽑힌 index자리의 값을 지우고
		// return
		return vo;
	}

	public void makeDeck() {
		// 하나하나를 배열에 저장
		String[] denoms = strDenomi.split("");
		String[] suits = strSuit.split(":");

		// 4번 반복
		for (String suit : suits) {
			// String 형 suit에 suits배열을 을 하나하나 담음
			for (String denom : denoms) {
				Integer intValue = 0;
				try {
					intValue = Integer.valueOf(denom);
					if (intValue == 0)
						intValue = 10;
				} catch (NumberFormatException e) {
					if (denom.equals("A"))
						intValue = 0;
					else
						intValue = 10;
				}
				DeckVO deckVO = new DeckVO();
				deckVO.setSuit(suit);
				deckVO.setDenomination(denom);
				deckVO.setValue(intValue);
				deckList.add(deckVO);
			}
		}

	}
}
