package com.itwill.web;



import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;


import com.itwill.manager.RecordManager;
import com.itwill.vo.RecordVo;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.SystemColor;

@SuppressWarnings("serial")
public class TabRecordPanel extends JPanel {
	private JTable recordTB;
	private JScrollPane menuScrollPane;
	@SuppressWarnings("rawtypes")
	private JList menuList;

	private DefaultTableModel recordTableModel;
	@SuppressWarnings("rawtypes")
	private DefaultListModel menuListModel;

	private Vector<String> headerNameVector;
	private Vector<String> headerResultNameVector;
	private ArrayList<RecordVo> recordList;
	@SuppressWarnings("rawtypes")
	private Vector<Vector> recordTBVector;
	private JLabel totalResultL;

	/**
	 * Create the panel.
	 * 
	 * @throws Exception
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public TabRecordPanel(MainFrame mainFrame) throws Exception {
		// AdminManager adminManager = new AdminManager();
		RecordManager recordManager = new RecordManager();
		

		setLayout(new BorderLayout(0, 0));
		setBounds(0, 0, 600, 400);

		JSplitPane splitPane = new JSplitPane();
		splitPane.setResizeWeight(0.15);
		add(splitPane);

		menuScrollPane = new JScrollPane();
		splitPane.setLeftComponent(menuScrollPane);
		// splitPane.set

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "성적조회", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		splitPane.setRightComponent(panel);
		panel.setLayout(new BorderLayout(0, 0));

		JScrollPane scrollPane = new JScrollPane();
		panel.add(scrollPane);

		totalResultL = new JLabel("");
		panel.add(totalResultL, BorderLayout.SOUTH);


		/*
		 * View
		 */
		menuList = new JList();
		menuList.setBackground(SystemColor.menu);
		recordTB = new JTable();
		recordTB.setBackground(Color.WHITE);

		/*
		 * Model
		 */
		menuListModel = new DefaultListModel<String>();
		menuListModel.addElement("성적조회");
		menuListModel.addElement("");

		headerNameVector = new Vector<String>();
		headerNameVector.add("과목명");
		headerNameVector.add("점수");
		headerNameVector.add("평균");
		headerNameVector.add("석차");

		headerResultNameVector = new Vector<String>();
		headerResultNameVector.add("총점");
		headerResultNameVector.add("평균");
		headerResultNameVector.add("석차");

		recordTableModel = new DefaultTableModel(null, headerNameVector);
		menuList.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				boolean isViewRecord = e.getValueIsAdjusting();
				if (isViewRecord) {
					try {
						recordList = new ArrayList<RecordVo>();
						RecordVo selectRecord = recordManager.printRecord(mainFrame.getNowLogin());
						String calTotal = recordManager.printCalResult(mainFrame.getNowLogin());
						if (selectRecord.getAvgT() != 0) {
							recordList.add(selectRecord);
							
							Vector rowVector1 = new Vector<>();
							Vector rowVector2 = new Vector<>();
							Vector rowVector3 = new Vector<>();
							
							recordTBVector = new Vector<Vector>();

							rowVector1.add(selectRecord.getSubject1Name());
							rowVector1.add(selectRecord.getsubjectScore1());
							rowVector1.add(selectRecord.getSubject1Avg());
							rowVector1.add(selectRecord.getSubject1Rank());
							recordTBVector.add(rowVector1);
							recordTableModel = new DefaultTableModel(recordTBVector, headerNameVector);
							recordTB.setModel(recordTableModel);

							rowVector2.add(selectRecord.getSubject2Name());
							rowVector2.add(selectRecord.getsubjectScore2());
							rowVector2.add(selectRecord.getSubject2Avg());
							rowVector2.add(selectRecord.getSubject2Rank());
							recordTBVector.add(rowVector2);
							recordTableModel = new DefaultTableModel(recordTBVector, headerNameVector);
							recordTB.setModel(recordTableModel);

							rowVector3.add(selectRecord.getSubject3Name());
							rowVector3.add(selectRecord.getsubjectScore3());
							rowVector3.add(selectRecord.getSubject3Avg());
							rowVector3.add(selectRecord.getSubject3Rank());

							recordTBVector.add(rowVector3);
							
							recordTableModel = new DefaultTableModel(recordTBVector, headerNameVector);
							
							recordTB.setModel(recordTableModel);

							totalResultL.setText(calTotal);
						} else if (selectRecord.getAvgT() == 0) {
							JOptionPane.showMessageDialog(null, "성적이 아직 입력되지 않았습니다.", "경고", JOptionPane.OK_OPTION);
						}
					} catch (Exception e1) {
					}
				}
			}
		});

		/*
		 * View.setModel(Model)
		 */
		menuList.setModel(menuListModel);
		menuScrollPane.setViewportView(menuList);

		scrollPane.setViewportView(recordTB);
		recordTableModel = new DefaultTableModel(null, headerNameVector);

		recordTB.setModel(recordTableModel);

		/*
		 * View
		 */

		scrollPane.setViewportView(recordTB);

	}

}