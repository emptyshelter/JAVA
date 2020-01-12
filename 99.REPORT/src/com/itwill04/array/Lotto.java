package com.itwill04.array;

public class Lotto {
	private int[] numberArray;
	
	public Lotto() {
		numberArray=new int[6];
		this.generateNumber();
	}	
	private void generateNumber() {
		for (int i = 0; i < numberArray.length; i++) {			
			numberArray[i] =(int)(Math.random()*45)+1;
			for (int j = 0; j < i; j++) {
				if(numberArray[i]==numberArray[j]) {
					i--;
					break;
				}
			}
		}
	}
	public void print() {
		for (int i = 0; i < numberArray.length; i++) {
			System.out.print(numberArray[i]+" ");
		}
		System.out.println();
	}
	
}
