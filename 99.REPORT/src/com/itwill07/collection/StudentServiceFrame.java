package com.itwill07.collection;


import java.awt.Frame;

public class StudentServiceFrame  extends Frame{
	private StudentServiceArrayList studentService;
	public StudentServiceFrame() {
		super("�л����� ���α׷�");
		studentService=new StudentServiceArrayList();
		setSize(400, 450);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new StudentServiceFrame();
	}

}
