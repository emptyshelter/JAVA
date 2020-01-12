package com.itwill04.array;

import javax.sound.midi.Soundbank;

public class CarArrayMain {
	public static void main(String[] args) {
		Car[] carArray= {
				null,null,null,null,null,
				new Car("9991", 8),null,null,new Car("4567", 7),null,
				null,new Car("2134", 6),null,null,null,
				null,null,null,null,null,
				new Car("3434", 9),null,null,null,null,
				new Car("7891", 6),null,null,null,null
			};
			/*
			NullPointerException
			 */
			System.out.println("1.전체차량출력");
			for (int i = 0; i < carArray.length; i++) {
				if (carArray[i]!=null) {
					carArray[i].print();					
				}
				
			}
			System.out.println("2.주차구획수:"+carArray.length);	
			int count = 0;
			for (int i = 0; i < carArray.length; i++) {
				if (carArray[i] != null) {
					count++;
				}
			}			
			System.out.print("3.주차가능주차구획수:"+(carArray.length-count));
			System.out.println();
			System.out.println("4.입차");
			/*		 	
			 *	1.차량객체생성  
			 */
		 	 		
			Car ncar = new Car("1987", 12);					
			/*
			 * 2.빈자리찾아서대입
			 */
			for (int i = 0; i <carArray.length; i++) {
				if (carArray[i] == null) {
					carArray[i] = ncar;
					carArray[i].print();
					break;
				}
			}					
			System.out.println("5.차량번호 4567번  차   한대 정보출력");
			for (int i = 0; i < carArray.length; i++) {				
				if (carArray[i]!=null && carArray[i].getNo().equals("4567")) {
					carArray[i].print();
				}		
				
			}			
			/*
			String carNo="3456";
			boolean isEqual=carNo.equals("3456");
			if (isEqual) {
				System.out.println("값이 동일하다");
			}
			if (carNo=="3456") {
				System.out.println("주소값이 동일하다");				
			}
			*/
			System.out.println("6.입차시간 8시이후 차 여러대 정보출력");
			for (int i = 0; i < carArray.length; i++) {
				if (carArray[i]!=null && carArray[i].getInTime()>=8) {					
						carArray[i].print();
						
				}	
				
			}
			System.out.println("7.7891번차량 12시 출차(합)");
			/*
			 * 1 . 7891번차량찾기
			 * 2 . 출차
			 * 3 . 영수증출력
			 * 4 . 주소값 --> null 
			 */
			carArray[0].headerPrint();
			for (int i = 0; i < carArray.length; i++) {
				if (carArray[i]!= null && carArray[i].getNo().equals("7891")) {				
						carArray[i].chulCha(12);
						carArray[i]= null;
					}					
			}
			/*
			System.out.println("7.7891번차량 12시 출차(단계별)");			
			
			/*
			 *  1 . 7891번차량찾기
			 */
			for (int i = 0; i < carArray.length; i++) {
				if (carArray[i]!= null && carArray[i].getNo().equals("7891")) {					
				}
			}
			/*
			 *  2 . 출차
			 */
			for (int i = 0; i < carArray.length; i++) {
				if (carArray[i]!= null && carArray[i].getNo().equals("7891")) {
					carArray[i].setOutTime(12);
				}
				
				
			}
			/*
			 *  3 . 영수증출력
			 */
			for (int i = 0; i < carArray.length; i++) {
				if (carArray[i]!= null && carArray[i].getNo().equals("7891")) {
					carArray[i].calculateFee();
					carArray[i].headerPrint();
					carArray[i].print();
					//carArray[i]= null;
					
				}
			}

			
			
			
	}

}
