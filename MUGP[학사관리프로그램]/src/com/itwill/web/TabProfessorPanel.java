package com.itwill.web;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;


import javax.swing.JSplitPane;

import javax.swing.JButton;


import com.itwill.manager.ProfessorManager;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.SystemColor;


@SuppressWarnings("serial")
public class TabProfessorPanel extends JPanel{
	public static final int STUDENTSTATE_PANEL = 0;
	public static final int PLAN_PANEL = 1;
	public static final int INPUTSCORE_PANEL = 2;
	public static final int SCORE_PANEL = 3;
		
	ProfessorManager professorManager ;
	
	JPanel currentPanel;
	private JPanel RootP;
	private JPanel panel_left;
	private StuentStateP stuentStateP;
	private InputScoreP inputScoreP;
	private ScoreP scoreP;
	private PlanP2 PlanP2;
	private JButton studentSB;
	private JButton planB;
	private JButton inputSB;
	MainFrame mainFrame;
	
	private boolean isEx;
	private String proStr;
	
	
	


	/**
	 * Create the panel.
	 */
	public TabProfessorPanel(MainFrame mainFrame) {
		this.mainFrame = mainFrame;

		

		
		setLayout(new BorderLayout(0, 0));
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				try {
					if(professorManager.findPro(mainFrame.getNowLogin())){
									
						studentSB.setEnabled(true);
						inputSB.setEnabled(true);
						
					}else{
						studentSB.setEnabled(false);
						inputSB.setEnabled(false);
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				isEx =true ;
				proStr = mainFrame.getNowLogin();
				try {
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
			
		});
		
	
		
		
		splitPane.setResizeWeight(0.25);
		splitPane.setForeground(Color.WHITE);
		add(splitPane);
		
		studentSB = new JButton("\uD559\uC0DD\uD604\uD669");
		inputSB = new JButton("\uC131\uC801\uC785\uB825");
		RootP = new JPanel();
		
		splitPane.setRightComponent(RootP);
		RootP.setLayout(new BorderLayout(0, 0));
		try {
			professorManager = new ProfessorManager();
			
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
	
		
	
		
	
		stuentStateP = new StuentStateP(this);
		inputScoreP = new InputScoreP(this);
		scoreP = new ScoreP();
		PlanP2 = new PlanP2(this);
		RootP.add(PlanP2, BorderLayout.CENTER);
		currentPanel = PlanP2;
		
		
		panel_left = new JPanel();
		
		panel_left.setBackground(SystemColor.window);
		splitPane.setLeftComponent(panel_left);
		
		
		studentSB.setBounds(5, 37, 97, 23);
		studentSB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changePanel(STUDENTSTATE_PANEL);
			}
		});
		panel_left.setLayout(null);
		panel_left.add(studentSB);
		
		planB = new JButton("\uAC15\uC758\uACC4\uD68D");
		planB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changePanel(PLAN_PANEL);
			}
		});
		planB.setBounds(5, 87, 97, 23);
		panel_left.add(planB);
		
		
		inputSB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changePanel(INPUTSCORE_PANEL);
			}
		});
		inputSB.setBounds(5, 133, 97, 23);
		panel_left.add(inputSB);
	
		

	}
	
	public void changePanel(int changePanel) {
		/*
		 * 현재패널제거
		 */
		RootP.remove(currentPanel);
		RootP.repaint();
		/*
		 * 새로운패널부치기
		 */
		
		switch (changePanel) {
		case STUDENTSTATE_PANEL:
			RootP.add(stuentStateP, BorderLayout.CENTER);
			currentPanel =stuentStateP;
			stuentStateP.getStudentList();
			break;
		case PLAN_PANEL:
			RootP.add(PlanP2, BorderLayout.CENTER);
			currentPanel = PlanP2;
			break;
		case INPUTSCORE_PANEL:
			RootP.add(inputScoreP, BorderLayout.CENTER);
			currentPanel=inputScoreP;
			
			break;
		case SCORE_PANEL:
			RootP.add(scoreP, BorderLayout.CENTER);
			currentPanel = scoreP;
			break;
		}
		RootP.validate();
		
	}


	public boolean isEx() {
		return isEx;
	}

	public void setEx(boolean isEx) {
		this.isEx = isEx;
	}

	public String getProStr() {
		return proStr;
	}

	public void setProStr(String proStr) {
		this.proStr = proStr;
	}
	

	
	


	
}
