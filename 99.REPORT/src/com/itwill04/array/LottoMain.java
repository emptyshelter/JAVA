package com.itwill04.array;

import java.util.Random;

public class LottoMain {

	public static void main(String[] args) {
		System.out.println("------------Lotto---------------------");
		Lotto lotto=new Lotto();
		lotto.print();
		System.out.println("------------Lotto[]---------------------");
		Lotto[] lottoArray = new Lotto[12];
		lottoArray[0] = new Lotto();
		lottoArray[1] = new Lotto();
		lottoArray[2] = new Lotto();
		lottoArray[3] = new Lotto();
		lottoArray[4] = new Lotto();
		lottoArray[5] = new Lotto();		
		lottoArray[6] = new Lotto();		
		lottoArray[7] = new Lotto();		
		lottoArray[8] = new Lotto();		
		lottoArray[9] = new Lotto();		
		lottoArray[10] = new Lotto();		
		lottoArray[11] = new Lotto();		
		for (int i = 0; i < lottoArray.length; i++) {		
			lottoArray[i].print();
		}
				
	
		
		

	}

}
