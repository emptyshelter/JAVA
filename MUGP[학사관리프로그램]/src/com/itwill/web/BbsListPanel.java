package com.itwill.web;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.itwill.manager.BbsFreeManager;
import com.itwill.manager.BbsManager;
import com.itwill.vo.BbsVo;

@SuppressWarnings("serial")
public class BbsListPanel extends JPanel {

	private int bbsState = 0;

	private JTable bbsListTable;
	private DefaultTableModel defaultTableModel;
	private Vector<String> headerNameVector;
	ArrayList<BbsVo> bbsList;
	@SuppressWarnings("rawtypes")
	private Vector bbsDataVector;

	private BbsSpecificTextDialog bbsSpecificTextDialog;
	private BbsSpecificWriteDialog bbsSpecificWriteDialog;
	private BbsFreeSpecificTextDialog bbsFreeSpecificTextDialog;
	private BbsFreeSpecificWriteDialog bbsFreeSpecificWriteDialog;
	BbsManager bbsManager;
	BbsFreeManager bbsFreeManager;
	MainFrame mainFrame;

	private JScrollPane bbsScrollPain;

	/**
	 * Create the panel.
	 * 
	 * @throws Exception
	 */
	public BbsListPanel(MainFrame mainFrame) throws Exception {
		this.mainFrame = mainFrame;
		bbsManager = mainFrame.bbsManager;
		bbsFreeManager = mainFrame.bbsFreeManager;
		setLayout(null);

		bbsScrollPain = new JScrollPane();
		bbsScrollPain.setBounds(132, 10, 460, 309);
		add(bbsScrollPain);

		bbsListTable = new JTable();

		bbsListTable.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("unused")
			@Override
			public void mouseClicked(MouseEvent e) {
				int selectedRow = bbsListTable.getSelectedRow();
				BbsVo bbsVo = bbsList.get(selectedRow);
				String no = bbsVo.getNo();
				if (bbsState == 0) {
					try {
						bbsSpecificTextDialog = new BbsSpecificTextDialog(mainFrame, bbsVo);
					} catch (Exception e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}

					bbsSpecificTextDialog.setModal(true);
					bbsSpecificTextDialog.setVisible(true);

					try {
						changeTable();
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				} else if (bbsState == 1) {
					try {
						bbsFreeSpecificTextDialog = new BbsFreeSpecificTextDialog(mainFrame, bbsVo);
					} catch (Exception e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}
					bbsFreeSpecificTextDialog.setModal(true);
					bbsFreeSpecificTextDialog.setVisible(true);

					try {
						changeTableToFree();
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}

			}
		});
		bbsScrollPain.setViewportView(bbsListTable);

		JButton button = new JButton("\uAE00\uC791\uC131");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (bbsState == 0) {

					if (!BbsListPanel.this.mainFrame.getNowLogin().equals("관리자")) {
						JOptionPane.showMessageDialog(null, "관리자 이외에는 작성이 불가능합니다.");
					} else if (BbsListPanel.this.mainFrame.getNowLogin().equals("관리자")) {

						writeOfficialDialogView();
					}

					try {
						changeTable();
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				} else if (bbsState == 1) {
					writeFreeDialogView();
					try {
						changeTableToFree();
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}

			}
		});
		button.setBounds(495, 329, 97, 23);
		add(button);

		JButton officeB = new JButton("\uACF5\uC9C0\uC0AC\uD56D");
		officeB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					changeTable();
					bbsState = 0;
				} catch (Exception e1) {
					e1.printStackTrace();
				}

			}
		});
		officeB.setBounds(12, 10, 108, 23);
		add(officeB);

		JButton freeB = new JButton("\uC790\uC720\uAC8C\uC2DC\uD310");
		freeB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					changeTableToFree();
					bbsState = 1;
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		freeB.setBounds(12, 43, 108, 23);
		add(freeB);

		// 테이블에 데이타입력
		if (bbsState == 0) {
			changeTable();
		} else if (bbsState == 1) {
			changeTableToFree();
		}
		setTableWidth();

	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void changeTable() throws Exception {
		bbsManager = new BbsManager();
		bbsList = bbsManager.getBbsList();

		headerNameVector = new Vector();
		headerNameVector.add("번호");
		headerNameVector.add("제목");
		headerNameVector.add("작성자");
		headerNameVector.add("작성시간");

		bbsDataVector = null;
		bbsDataVector = new Vector();

		for (BbsVo message : bbsList) {
			Vector rowVetor = new Vector();
			rowVetor.add(message.getNo());
			rowVetor.add(message.getTitle());
			rowVetor.add(message.getWriter());
			rowVetor.add(message.getTime());

			bbsDataVector.add(rowVetor);

		}
		defaultTableModel = new DefaultTableModel(bbsDataVector, headerNameVector);
		setTableWidth();

	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void changeTableToFree() throws Exception {
		bbsFreeManager = new BbsFreeManager();
		bbsList = bbsFreeManager.getBbsList();

		headerNameVector = new Vector();
		headerNameVector.add("번호");
		headerNameVector.add("제목");
		headerNameVector.add("작성자");
		headerNameVector.add("작성시간");

		bbsDataVector = null;
		bbsDataVector = new Vector();

		for (BbsVo message : bbsList) {
			Vector rowVetor = new Vector();
			rowVetor.add(message.getNo());
			rowVetor.add(message.getTitle());
			rowVetor.add(message.getWriter());
			rowVetor.add(message.getTime());

			bbsDataVector.add(rowVetor);

		}
		defaultTableModel = new DefaultTableModel(bbsDataVector, headerNameVector);

		bbsListTable.setModel(defaultTableModel);
		setTableWidth();
	}

	public void writeOfficialDialogView() {
		bbsSpecificWriteDialog = new BbsSpecificWriteDialog(mainFrame);
		bbsSpecificWriteDialog.setModal(true);
		bbsSpecificWriteDialog.setVisible(true);
	}

	public void writeFreeDialogView() {
		bbsFreeSpecificWriteDialog = new BbsFreeSpecificWriteDialog(mainFrame);
		bbsFreeSpecificWriteDialog.setModal(true);
		bbsFreeSpecificWriteDialog.setVisible(true);
	}

	public void setTableWidth() {
		bbsListTable.setModel(defaultTableModel);
		bbsListTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		bbsListTable.getColumnModel().getColumn(0).setPreferredWidth(35);
		bbsListTable.getColumnModel().getColumn(1).setPreferredWidth(222);
		bbsListTable.getColumnModel().getColumn(2).setPreferredWidth(50);
		bbsListTable.getColumnModel().getColumn(3).setPreferredWidth(150);
	}
}
