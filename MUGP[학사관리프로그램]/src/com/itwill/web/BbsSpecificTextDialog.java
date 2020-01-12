package com.itwill.web;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import com.itwill.manager.BbsManager;
import com.itwill.vo.BbsVo;

@SuppressWarnings("serial")
public class BbsSpecificTextDialog extends JDialog {

	MainFrame mainFrame;
	BbsManager bbsManager;
	BbsListPanel bbsListPanel;
	BbsVo bbsVo;
	private final JPanel contentPanel = new JPanel();
	private JTextField titleTF;
	private JTextArea textA;
	String no;

	/**
	 * Create the dialog.
	 * 
	 * @throws Exception
	 */
	public BbsSpecificTextDialog(MainFrame mainFrame, BbsVo bbsVo) throws Exception {
		this.mainFrame = mainFrame;
		this.bbsVo = bbsVo;
		bbsManager = new BbsManager();
		setBounds(100, 100, 309, 431);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			{
				JLabel titleL = new JLabel("\uC81C\uBAA9");
				titleL.setBounds(12, 40, 37, 18);
				panel.add(titleL);
			}
			{
				JLabel textL = new JLabel("\uB0B4\uC6A9");
				textL.setBounds(12, 75, 37, 15);
				panel.add(textL);
			}
			{
				titleTF = new JTextField();
				titleTF.setBounds(61, 39, 196, 21);

				panel.add(titleTF);
				titleTF.setColumns(10);
			}
			{
				textA = new JTextArea();
				textA.setBounds(60, 71, 197, 254);
				textA.setLineWrap(true);
				Border lineBorder = BorderFactory.createLineBorder(Color.black);
				Border emptyBorder = BorderFactory.createEmptyBorder(7, 7, 7, 7);
				textA.setBorder(BorderFactory.createCompoundBorder(lineBorder, emptyBorder));
				panel.add(textA);
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton update = new JButton("\uC218\uC815");
				update.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						SimpleDateFormat formatter = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss", Locale.KOREA);
						Date currentTime = new Date();
						String dTime = formatter.format(currentTime);

						if (!mainFrame.getNowLogin().equals("������")) {
							JOptionPane.showMessageDialog(null, "������ �̿ܿ��� ������ �Ұ����մϴ�.");
						} else if (mainFrame.getNowLogin().equals("������")) {
							BbsVo temp = new BbsVo(bbsVo.getNo(), titleTF.getText(), bbsVo.getWriter(), dTime + "(����)",
									textA.getText());

							try {
								bbsManager.updateMessage(temp);

								dispose();
							} catch (Exception e1) {
								e1.printStackTrace();
							}
						}
					}

				});
				update.setActionCommand("update");
				buttonPane.add(update);
				getRootPane().setDefaultButton(update);
			}
			{
				JButton delete = new JButton("\uC0AD\uC81C");
				delete.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (!mainFrame.getNowLogin().equals("������")) {
							JOptionPane.showMessageDialog(null, "������ �̿ܿ��� ������ �Ұ����մϴ�.");
						} else if (mainFrame.getNowLogin().equals("������")) {
							try {
								bbsManager.deleteMessage(bbsVo.getNo());
								dispose();
							} catch (Exception e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}
					}
				});
				delete.setActionCommand("delete");
				buttonPane.add(delete);

			}
			{
				JButton cancle = new JButton("\uD655\uC778");
				cancle.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				buttonPane.add(cancle);
			}
		}

		titleTF.setText(bbsVo.getTitle());
		textA.setText(bbsVo.getText());

	}

	public JTextArea getTextA() {
		return textA;
	}

	public void setTextA(JTextArea textA) {
		this.textA = textA;
	}

	public JTextField getTitleTF() {
		return titleTF;
	}

	public void setTitleTF(JTextField titleTF) {
		this.titleTF = titleTF;
	}

}
