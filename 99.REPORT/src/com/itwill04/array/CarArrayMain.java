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
			System.out.println("1.��ü�������");
			for (int i = 0; i < carArray.length; i++) {
				if (carArray[i]!=null) {
					carArray[i].print();					
				}
				
			}
			System.out.println("2.������ȹ��:"+carArray.length);	
			int count = 0;
			for (int i = 0; i < carArray.length; i++) {
				if (carArray[i] != null) {
					count++;
				}
			}			
			System.out.print("3.��������������ȹ��:"+(carArray.length-count));
			System.out.println();
			System.out.println("4.����");
			/*		 	
			 *	1.������ü����  
			 */
		 	 		
			Car ncar = new Car("1987", 12);					
			/*
			 * 2.���ڸ�ã�Ƽ�����
			 */
			for (int i = 0; i <carArray.length; i++) {
				if (carArray[i] == null) {
					carArray[i] = ncar;
					carArray[i].print();
					break;
				}
			}					
			System.out.println("5.������ȣ 4567��  ��   �Ѵ� �������");
			for (int i = 0; i < carArray.length; i++) {				
				if (carArray[i]!=null && carArray[i].getNo().equals("4567")) {
					carArray[i].print();
				}		
				
			}			
			/*
			String carNo="3456";
			boolean isEqual=carNo.equals("3456");
			if (isEqual) {
				System.out.println("���� �����ϴ�");
			}
			if (carNo=="3456") {
				System.out.println("�ּҰ��� �����ϴ�");				
			}
			*/
			System.out.println("6.�����ð� 8������ �� ������ �������");
			for (int i = 0; i < carArray.length; i++) {
				if (carArray[i]!=null && carArray[i].getInTime()>=8) {					
						carArray[i].print();
						
				}	
				
			}
			System.out.println("7.7891������ 12�� ����(��)");
			/*
			 * 1 . 7891������ã��
			 * 2 . ����
			 * 3 . ���������
			 * 4 . �ּҰ� --> null 
			 */
			carArray[0].headerPrint();
			for (int i = 0; i < carArray.length; i++) {
				if (carArray[i]!= null && carArray[i].getNo().equals("7891")) {				
						carArray[i].chulCha(12);
						carArray[i]= null;
					}					
			}
			/*
			System.out.println("7.7891������ 12�� ����(�ܰ躰)");			
			
			/*
			 *  1 . 7891������ã��
			 */
			for (int i = 0; i < carArray.length; i++) {
				if (carArray[i]!= null && carArray[i].getNo().equals("7891")) {					
				}
			}
			/*
			 *  2 . ����
			 */
			for (int i = 0; i < carArray.length; i++) {
				if (carArray[i]!= null && carArray[i].getNo().equals("7891")) {
					carArray[i].setOutTime(12);
				}
				
				
			}
			/*
			 *  3 . ���������
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
