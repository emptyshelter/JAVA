package com.itwill.web;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import com.itwill.manager.AdminManager;
import com.itwill.manager.BbsFreeManager;
import com.itwill.vo.BbsVo;

@SuppressWarnings("serial")
public class BbsFreeSpecificWriteDialog extends JDialog {

	MainFrame mainFrame;
	BbsFreeManager bbsManager;
	AdminManager adminManager;
	BbsListPanel bbsListPanel;
	BbsVo bbsVo;

	private final JPanel contentPanel = new JPanel();
	private JTextField titleTF;
	private JTextArea textA;

	/**
	 * Create the dialog.
	 */
	public BbsFreeSpecificWriteDialog(MainFrame frame) {

		SimpleDateFormat formatter = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss", Locale.KOREA);
		Date currentTime = new Date();
		String dTime = formatter.format(currentTime);

		this.mainFrame = frame;
		setBounds(100, 100, 296, 434);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel titleL = new JLabel("\uC81C\uBAA9");
			titleL.setBounds(12, 40, 37, 18);
			contentPanel.add(titleL);
		}
		{
			JLabel textL = new JLabel("\uB0B4\uC6A9");
			textL.setBounds(12, 75, 37, 15);
			contentPanel.add(textL);
		}
		{
			titleTF = new JTextField();
			titleTF.setBounds(61, 39, 196, 21);
			contentPanel.add(titleTF);
			titleTF.setColumns(10);
		}
		{
			textA = new JTextArea();
			textA.setBounds(60, 71, 197, 254);
			textA.setLineWrap(true);
			Border lineBorder = BorderFactory.createLineBorder(Color.black);
			Border emptyBorder = BorderFactory.createEmptyBorder(7, 7, 7, 7);
			textA.setBorder(BorderFactory.createCompoundBorder(lineBorder, emptyBorder));
			contentPanel.add(textA);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton writeB = new JButton("\uC791\uC131");
				writeB.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						try {
							bbsManager = new BbsFreeManager();
							adminManager = new AdminManager();

						} catch (Exception e2) {
							// TODO Auto-generated catch block
							e2.printStackTrace();
						}
						ArrayList<BbsVo> bbsList = null;
						try {
							bbsList = bbsManager.getBbsList();
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						String no = String.valueOf(bbsList.size() + 1);

						BbsVo temp = new BbsVo(no, titleTF.getText(), mainFrame.getNowLogin(), dTime, textA.getText());
						try {
							bbsManager.write(temp);
							dispose();
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}

					}
				});
				writeB.setActionCommand("write");
				buttonPane.add(writeB);
				getRootPane().setDefaultButton(writeB);

			}
			{
				JButton cancelB = new JButton("\uCDE8\uC18C");
				cancelB.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelB.setActionCommand("Cancel");
				buttonPane.add(cancelB);
			}

		}
	}

}
