package com.itwill.web;

import javax.swing.JPanel;

import com.itwill.manager.ProfessorManager;
import com.itwill.vo.ProfessorVo;
import com.itwill.vo.RecordVo;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class InputScoreP extends JPanel {
	
	
	TabProfessorPanel tabProfessorPanel;
	ProfessorManager professorManager;
	private JTextField nameF;
	private JTextField birthF;
	private JTextField phoneF;
	private JTextField score1F;
	ProfessorVo professorVo;
	ProfessorVo professorVo1;
	ProfessorVo professorVo2;
	
	/* 수정 */
	private JLabel Renuc;
	private JLabel CLan;
	private JLabel JALan;
	private int a = 0;
	private int b = 0;
	/**
	 * Create the panel.
	 */
	public InputScoreP(TabProfessorPanel tabProfessorPanel) {
		
		setBackground(SystemColor.menu);
		this.tabProfessorPanel = tabProfessorPanel;
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uC774\uB984:");
		lblNewLabel.setBounds(92, 52, 57, 15);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uC0DD\uB144");
		lblNewLabel_1.setBounds(92, 87, 57, 15);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("phone");
		lblNewLabel_2.setBounds(92, 122, 57, 15);
		add(lblNewLabel_2);
		
		Renuc = new JLabel("\uB9AC\uB205\uC2A4");
		Renuc.setBounds(92, 158, 91, 15);
		add(Renuc);
		
		CLan = new JLabel("C\uC5B8\uC5B4");
		CLan.setBounds(92, 158, 57, 15);
		add(CLan);
		
		JALan = new JLabel("\uC790\uBC14");
		JALan.setBounds(92, 158, 57, 15);
		add(JALan);
		
		nameF = new JTextField();
		nameF.setBounds(161, 49, 116, 21);
		add(nameF);
		nameF.setColumns(10);
		
		birthF = new JTextField();
		birthF.setBounds(161, 84, 116, 21);
		add(birthF);
		birthF.setColumns(10);
		
		phoneF = new JTextField();
		phoneF.setBounds(161, 119, 116, 21);
		add(phoneF);
		phoneF.setColumns(10);
		
		score1F = new JTextField();
		score1F.setBounds(161, 155, 116, 21);
		add(score1F);
		score1F.setColumns(10);
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				try {
					professorVo = professorManager.findSubjectPlan(1);
					professorVo1 = professorManager.findSubjectPlan(2);
					professorVo2 = professorManager.findSubjectPlan(3);
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				System.out.println(professorVo.getpName());
				System.out.println(tabProfessorPanel.getProStr());
				if(professorVo.getpName().equals(tabProfessorPanel.getProStr())){
					
					Renuc.setVisible(false);
					CLan.setVisible(true);
					JALan.setVisible(false);
					
				}else if(professorVo1.getpName().equals(tabProfessorPanel.getProStr())){
					
					Renuc.setVisible(false);
					CLan.setVisible(false);
					JALan.setVisible(true);
					
				}else if(professorVo2.getpName().equals(tabProfessorPanel.getProStr())){
					
					Renuc.setVisible(true);
					CLan.setVisible(false);
					JALan.setVisible(false);
				}
				
			}
		});
		
		JButton button = new JButton("\uC785\uB825");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = nameF.getText();
				String birth = birthF.getText();
				String phone = phoneF.getText();
				String score1 = score1F.getText();
				boolean inputSuccess = false;
				try {
					professorManager = new ProfessorManager();
					ArrayList<RecordVo> recordList = professorManager.findSubjectStudent("0");
					for (int i = 0; i < recordList.size(); i++) {
						if(recordList.get(i).getNameStudent().equals(name)&& professorVo2.getpName().equals(tabProfessorPanel.getProStr())){
							a = recordList.get(i).getsubjectScore3();//J
							b = recordList.get(i).getsubjectScore2();//C
						
						}else if(recordList.get(i).getNameStudent().equals(name)&& professorVo1.getpName().equals(tabProfessorPanel.getProStr())){
							a = recordList.get(i).getsubjectScore1();//L
							b = recordList.get(i).getsubjectScore2();//J
						
						}else if(recordList.get(i).getNameStudent().equals(name)&& professorVo.getpName().equals(tabProfessorPanel.getProStr())){
							a = recordList.get(i).getsubjectScore1();//L
							b = recordList.get(i).getsubjectScore3();//C
						
						}
					}
				} catch (Exception e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				

				
				if(name.equals("")|| birth.equals("")||phone.equals("")){
					JOptionPane.showMessageDialog(null, "이름,생년,전화번호를 입력하세요");
					nameF.requestFocus();
					return;
				}
				try {
					professorManager = new ProfessorManager();
					professorVo = professorManager.findSubjectPlan(1);
					professorVo1 = professorManager.findSubjectPlan(2);
					professorVo2 = professorManager.findSubjectPlan(3);
					System.out.println("a: "+ a + "b: "+b);
					if(professorVo.getpName().equals(tabProfessorPanel.getProStr())){
						inputSuccess = professorManager.inputScore(new RecordVo(name, birth, phone, a , Integer.parseInt(score1), b));
						
					}else if(professorVo1.getpName().equals(tabProfessorPanel.getProStr())){
						
						inputSuccess = professorManager.inputScore(new RecordVo(name, birth, phone, a, b, Integer.parseInt(score1)));
						
					}else if(professorVo2.getpName().equals(tabProfessorPanel.getProStr())){
					
						inputSuccess = professorManager.inputScore(new RecordVo(name, birth, phone, Integer.parseInt(score1), a, b));
						
					}
					
					if(!inputSuccess){
						JOptionPane.showMessageDialog(null, "학생이 존재하지 않습니다 다시 입력하세요");
					}
				} catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(null, "숫자로 입력하세요");
					score1F.requestFocus();
					e1.printStackTrace();
				} catch (Exception e1) {
					
					e1.printStackTrace();
				}
				
				nameF.setText("");
				birthF.setText("");
				phoneF.setText("");
				score1F.setText("");
				
			}
		});
		button.setBounds(92, 267, 97, 23);
		add(button);
		
		JButton btnNewButton = new JButton("\uCDE8\uC18C");
		btnNewButton.setBounds(219, 267, 97, 23);
		add(btnNewButton);
		try {
			professorManager = tabProfessorPanel.professorManager;
		} catch (Exception e1) {
			
			e1.printStackTrace();
		}
		

	}

}
