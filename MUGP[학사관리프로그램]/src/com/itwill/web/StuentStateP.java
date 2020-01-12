package com.itwill.web;

import javax.swing.JPanel;
import javax.swing.JTable;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;

import com.itwill.manager.ProfessorManager;
import com.itwill.vo.ProfessorVo;
import com.itwill.vo.RecordVo;
import java.awt.SystemColor;
import javax.swing.JScrollPane;


@SuppressWarnings("serial")
public class StuentStateP extends JPanel {
	private JTable table;
	
	private DefaultTableModel defaultTableModel;
	
	private Vector<String> headerNameVertor;
	@SuppressWarnings("rawtypes")
	private Vector<Vector> recordVector;
	
	ProfessorManager professorManager;
	
	TabProfessorPanel tabProfessorPanel;
	
	ArrayList<RecordVo> recordList;
	
	ProfessorVo professorVo;
	ProfessorVo professorVo1;
	ProfessorVo professorVo2;
	
	
	/**
	 * Create the panel.
	 */
	public StuentStateP(TabProfessorPanel tabProfessorPanel) {
		this.tabProfessorPanel = tabProfessorPanel;
		try {
			professorManager = tabProfessorPanel.professorManager;
			
		} catch (Exception e1) {
			
			e1.printStackTrace();
		}
		table = new JTable();
		setBackground(SystemColor.activeCaption);
		
		
		setLayout(new BorderLayout(0, 0));
		
		
		JScrollPane scrollPane=new JScrollPane();
		scrollPane.setViewportView(table);
		add(scrollPane);
		getStudentList();

		
		
		

	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void getStudentList(){
		
		
		
		headerNameVertor = new Vector<String>();
		headerNameVertor.add("이름");
		headerNameVertor.add("생년");
		headerNameVertor.add("핸드폰");
		headerNameVertor.add("과목");
		headerNameVertor.add("점수");
		String str = tabProfessorPanel.getProStr();
		String subject = returnSub(str);
		try {
			
			recordList = new ArrayList<RecordVo>();
			recordList = professorManager.findSubjectStudent("ㅇ");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		;
		recordVector = new Vector<Vector>();

		for(int i = 0; i < recordList.size(); i++){
			Vector rowVector = new Vector();

			if(recordList.get(i).getSubject1Name().equals(subject)){
				rowVector.add(recordList.get(i).getNameStudent());
				rowVector.add(recordList.get(i).getBirth());
				rowVector.add(recordList.get(i).getPhoneNum());
				rowVector.add(recordList.get(i).getSubject1Name());
				rowVector.add(recordList.get(i).getsubjectScore1());
			}else if(recordList.get(i).getSubject2Name().equals(subject)){
				rowVector.add(recordList.get(i).getNameStudent());
				rowVector.add(recordList.get(i).getBirth());
				rowVector.add(recordList.get(i).getPhoneNum());
				rowVector.add(recordList.get(i).getSubject2Name());
				rowVector.add(recordList.get(i).getsubjectScore2());
				
			}else if(recordList.get(i).getSubject3Name().equals(subject)){
				rowVector.add(recordList.get(i).getNameStudent());
				rowVector.add(recordList.get(i).getBirth());
				rowVector.add(recordList.get(i).getPhoneNum());
				rowVector.add(recordList.get(i).getSubject3Name());
				rowVector.add(recordList.get(i).getsubjectScore3());
			}
			
			recordVector.add(rowVector);
			
		}
		defaultTableModel = new DefaultTableModel(recordVector, headerNameVertor);
		table.setModel(defaultTableModel);
		
		
		
	}
	private String returnSub(String str){
		String temp= "";
		try {
			professorVo= new ProfessorVo();
			professorVo1= new ProfessorVo();
			professorVo2= new ProfessorVo();
			professorVo = professorManager.findSubjectPlan(1);
			professorVo1 = professorManager.findSubjectPlan(2);
			professorVo2 = professorManager.findSubjectPlan(3);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		if(str != null){
			if(str.equals(professorVo.getpName())){
				temp = professorVo.getSubject();
			}else if(str.equals(professorVo1.getpName())){
				temp = professorVo1.getSubject();
			}else if(str.equals(professorVo2.getpName() )){
				temp = professorVo2.getSubject();
			}
		}
		
		return temp;
	}
	
}
