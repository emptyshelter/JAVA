package com.itwill.web;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import com.itwill.manager.ProfessorManager;
import com.itwill.vo.ProfessorVo;

import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JFileChooser;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

@SuppressWarnings("serial")
public class PlanP2 extends JPanel {

	private JTextField subject1F;
	private JTextField Pname1F;
	private JTextField pRoom1F;
	private JTextField bookName1F;
	private JTextField bookManker1F;
	private JTextField bookWriter1F;
	private JTextField subject2F;
	private JTextField Pname2F;
	private JTextField pRoom2F;
	private JTextField bookName2F;
	private JTextField bookManker2F;
	private JTextField bookWriter2F;
	private JTextField subject3F;
	private JTextField Pname3F;
	private JTextField pRoom3F;
	private JTextField bookName3F;
	private JTextField bookManker3F;
	private JTextField bookWriter3F;

	TabProfessorPanel tabProfessorPanel;
	ProfessorManager professorManager;
	ProfessorVo professorVo;
	ProfessorVo professorVo1;
	ProfessorVo professorVo2;

	/**
	 * @wbp.nonvisual location=183,319
	 */
	private final JFileChooser fileChooser = new JFileChooser();
	private JLabel label5;
	private JLabel label6;
	private JLabel label3;
	private JLabel label4;
	private JLabel label1;
	private JLabel label2;
	File file = new File("C:\\JAVAIOT\\workspaceSE\\MUGP[학사관리프로그램]\\image");
	// File file = new File("D:\\java\\souce\\MUGP");
	Image inImage;
	Image inresizedImage;
	private JButton book1;
	private JButton button;
	private JButton pic1;
	private JButton pic2;
	private JButton book2;
	private JButton button_1;
	private JButton pic3;
	private JButton book3;
	private JButton button_2;

	/**
	 * Create the panel.
	 */
	public PlanP2(TabProfessorPanel tabProfessorPanel) {

		this.tabProfessorPanel = tabProfessorPanel;
		try {
			professorManager = tabProfessorPanel.professorManager;
		} catch (Exception e1) {

			e1.printStackTrace();
		}

		setLayout(new BorderLayout(0, 0));

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.BOTTOM);

		add(tabbedPane);

		JPanel panel = new JPanel();

		tabbedPane.addTab("\uAC15\uD638\uB3D9 \uAD50\uC218", null, panel, null);
		panel.setLayout(null);

		label2 = new JLabel("");
		label2.setBounds(12, 121, 105, 96);
		panel.add(label2);
		try {

			professorVo = professorManager.findSubjectPlan(1);
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "찾는 교수가 없습니다.");
		}
		subject1F = new JTextField();
		subject1F.setText(professorVo.getSubject());
		subject1F.setColumns(10);
		subject1F.setBounds(231, 54, 116, 21);
		panel.add(subject1F);

		Pname1F = new JTextField();
		Pname1F.setText(professorVo.getpName());
		Pname1F.setColumns(10);
		Pname1F.setBounds(231, 22, 116, 21);
		panel.add(Pname1F);

		pRoom1F = new JTextField();
		pRoom1F.setText(professorVo.getpRoom());
		pRoom1F.setColumns(10);
		pRoom1F.setBounds(231, 87, 116, 21);
		panel.add(pRoom1F);

		bookName1F = new JTextField();
		bookName1F.setText(professorVo.getBookName());
		bookName1F.setColumns(10);
		bookName1F.setBounds(232, 129, 116, 21);
		panel.add(bookName1F);

		bookManker1F = new JTextField();
		bookManker1F.setText(professorVo.getBookMaker());
		bookManker1F.setColumns(10);
		bookManker1F.setBounds(232, 159, 116, 21);
		panel.add(bookManker1F);

		bookWriter1F = new JTextField();
		bookWriter1F.setText(professorVo.getBookWriter());
		bookWriter1F.setColumns(10);
		bookWriter1F.setBounds(232, 187, 116, 21);
		panel.add(bookWriter1F);
		JLabel label_1 = new JLabel("\uAD50\uC218 \uC774\uB984:");
		label_1.setBounds(144, 25, 68, 15);
		panel.add(label_1);

		JLabel label_2 = new JLabel("\uACFC\uBAA9:");
		label_2.setBounds(144, 56, 56, 15);
		panel.add(label_2);

		JLabel label_3 = new JLabel("\uAD50\uC218\uBC29:");
		label_3.setBounds(144, 91, 56, 15);
		panel.add(label_3);

		label1 = new JLabel("");
		label1.setBounds(12, 16, 105, 96);
		panel.add(label1);

		JLabel label_5 = new JLabel("\uAC15\uC758 \uAD50\uC7AC:");
		label_5.setBounds(144, 132, 68, 15);
		panel.add(label_5);

		JLabel label_6 = new JLabel("\uAD50\uC7AC \uC800\uC790:");
		label_6.setBounds(144, 190, 68, 15);
		panel.add(label_6);

		JLabel label_7 = new JLabel("\uAD50\uC7AC \uCD9C\uD310\uC0AC:");
		label_7.setBounds(144, 161, 80, 15);
		panel.add(label_7);

		JTextArea textArea = new JTextArea();
		textArea.setText(professorVo.getSubjectP());
		textArea.setBounds(28, 224, 367, 37);
		panel.add(textArea);

		button = new JButton("\uC218\uC815");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProfessorVo updateProfessor = new ProfessorVo(1, Pname1F.getText(), subject1F.getText(),
						textArea.getText(), pRoom1F.getText(), bookName1F.getText(), bookWriter1F.getText(),
						bookManker1F.getText());
				try {
					professorManager.professorSujung(updateProfessor);
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "수정 오류");
					e1.printStackTrace();
				}

			}
		});
		button.setBounds(361, 189, 72, 23);
		panel.add(button);

		pic1 = new JButton("\uC0AC\uC9C4");
		pic1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fileChooser.setCurrentDirectory(file);
				fileChooser.setFileSelectionMode(JFileChooser.OPEN_DIALOG);
				int result = fileChooser.showOpenDialog(PlanP2.this);

				if (result == JFileChooser.APPROVE_OPTION) {
					// 파일 선택
					File selectedFile = fileChooser.getSelectedFile();
					try {
						inImage = ImageIO.read(new File(selectedFile.getAbsolutePath()));
						inresizedImage = inImage.getScaledInstance(label1.getWidth(), label1.getHeight(), 0);

					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					label1.setIcon(new ImageIcon(inresizedImage));
				} else if (result == JFileChooser.CANCEL_OPTION) {
					// 취소
				}

			}
		});
		pic1.setBounds(359, 55, 74, 21);
		panel.add(pic1);

		book1 = new JButton("\uCC45");
		book1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fileChooser.setCurrentDirectory(file);
				fileChooser.setFileSelectionMode(JFileChooser.OPEN_DIALOG);
				int result = fileChooser.showOpenDialog(PlanP2.this);
				if (result == JFileChooser.APPROVE_OPTION) {
					// 파일 선택
					File selectedFile = fileChooser.getSelectedFile();
					try {
						inImage = ImageIO.read(new File(selectedFile.getAbsolutePath()));
						inresizedImage = inImage.getScaledInstance(label2.getWidth(), label2.getHeight(), 0);

					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					label2.setIcon(new ImageIcon(inresizedImage));
				} else if (result == JFileChooser.CANCEL_OPTION) {
					// 취소
				}
			}
		});
		book1.setBounds(360, 157, 73, 23);
		panel.add(book1);

		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		tabbedPane.addTab("\uC720\uC7AC\uC11D \uAD50\uC218", null, panel_3, null);

		label4 = new JLabel("");
		label4.setBounds(12, 118, 105, 96);
		panel_3.add(label4);
		try {

			professorVo1 = professorManager.findSubjectPlan(2);
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "찾는 교수가 없습니다.");
		}
		subject2F = new JTextField();
		subject2F.setText(professorVo1.getSubject());
		subject2F.setColumns(10);
		subject2F.setBounds(231, 54, 116, 21);
		panel_3.add(subject2F);

		Pname2F = new JTextField();
		Pname2F.setText(professorVo1.getpName());
		Pname2F.setColumns(10);
		Pname2F.setBounds(231, 22, 116, 21);
		panel_3.add(Pname2F);

		pRoom2F = new JTextField();
		pRoom2F.setText(professorVo1.getpRoom());
		pRoom2F.setColumns(10);
		pRoom2F.setBounds(231, 87, 116, 21);
		panel_3.add(pRoom2F);

		JLabel label_9 = new JLabel("\uAD50\uC218 \uC774\uB984:");
		label_9.setBounds(144, 25, 68, 15);
		panel_3.add(label_9);

		JLabel label_10 = new JLabel("\uACFC\uBAA9:");
		label_10.setBounds(144, 56, 56, 15);
		panel_3.add(label_10);

		JLabel label_11 = new JLabel("\uAD50\uC218\uBC29:");
		label_11.setBounds(144, 91, 56, 15);
		panel_3.add(label_11);

		label3 = new JLabel("");
		label3.setBounds(12, 10, 105, 96);
		panel_3.add(label3);

		JLabel label_13 = new JLabel("\uAC15\uC758 \uAD50\uC7AC:");
		label_13.setBounds(144, 132, 68, 15);
		panel_3.add(label_13);

		JLabel label_14 = new JLabel("\uAD50\uC7AC \uC800\uC790:");
		label_14.setBounds(144, 190, 68, 15);
		panel_3.add(label_14);

		JLabel label_15 = new JLabel("\uAD50\uC7AC \uCD9C\uD310\uC0AC:");
		label_15.setBounds(144, 161, 80, 15);
		panel_3.add(label_15);

		bookName2F = new JTextField();
		bookName2F.setText(professorVo1.getBookName());
		bookName2F.setColumns(10);
		bookName2F.setBounds(232, 129, 116, 21);
		panel_3.add(bookName2F);

		bookManker2F = new JTextField();
		bookManker2F.setText(professorVo1.getBookMaker());
		bookManker2F.setColumns(10);
		bookManker2F.setBounds(232, 159, 116, 21);
		panel_3.add(bookManker2F);

		bookWriter2F = new JTextField();
		bookWriter2F.setText(professorVo1.getBookWriter());
		bookWriter2F.setColumns(10);
		bookWriter2F.setBounds(232, 187, 116, 21);
		panel_3.add(bookWriter2F);

		JTextArea textArea_1 = new JTextArea();
		textArea_1.setText(professorVo1.getSubjectP());
		textArea_1.setBounds(28, 224, 367, 37);
		panel_3.add(textArea_1);

		button_1 = new JButton("\uC218\uC815");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProfessorVo updateProfessor = new ProfessorVo(2, Pname2F.getText(), subject2F.getText(),
						textArea.getText(), pRoom2F.getText(), bookName2F.getText(), bookWriter2F.getText(),
						bookManker2F.getText());
				try {
					professorManager.professorSujung(updateProfessor);
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "수정 오류");
					e1.printStackTrace();
				}
			}
		});
		button_1.setBounds(361, 189, 72, 23);
		panel_3.add(button_1);

		pic2 = new JButton("\uC0AC\uC9C4");
		pic2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fileChooser.setCurrentDirectory(file);
				fileChooser.setFileSelectionMode(JFileChooser.OPEN_DIALOG);
				int result = fileChooser.showOpenDialog(PlanP2.this);
				if (result == JFileChooser.APPROVE_OPTION) {
					// 파일 선택
					File selectedFile = fileChooser.getSelectedFile();
					try {
						inImage = ImageIO.read(new File(selectedFile.getAbsolutePath()));
						inresizedImage = inImage.getScaledInstance(label3.getWidth(), label3.getHeight(), 0);

					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					label3.setIcon(new ImageIcon(inresizedImage));
				}
			}
		});
		pic2.setBounds(359, 54, 74, 21);
		panel_3.add(pic2);

		book2 = new JButton("\uCC45");
		book2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fileChooser.setCurrentDirectory(file);
				fileChooser.setFileSelectionMode(JFileChooser.OPEN_DIALOG);
				int result = fileChooser.showOpenDialog(PlanP2.this);
				if (result == JFileChooser.APPROVE_OPTION) {
					// 파일 선택
					File selectedFile = fileChooser.getSelectedFile();
					try {
						inImage = ImageIO.read(new File(selectedFile.getAbsolutePath()));
						inresizedImage = inImage.getScaledInstance(label4.getWidth(), label4.getHeight(), 0);

					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					label4.setIcon(new ImageIcon(inresizedImage));
				}

			}
		});
		book2.setBounds(360, 156, 73, 23);
		panel_3.add(book2);

		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		tabbedPane.addTab("\uC774\uACBD\uADDC \uAD50\uC218", null, panel_4, null);

		label6 = new JLabel("");
		label6.setBounds(12, 118, 105, 96);
		panel_4.add(label6);
		try {

			professorVo2 = professorManager.findSubjectPlan(3);
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "찾는 교수가 없습니다.");
		}
		subject3F = new JTextField();
		subject3F.setText(professorVo2.getSubject());
		subject3F.setColumns(10);
		subject3F.setBounds(231, 54, 116, 21);
		panel_4.add(subject3F);

		Pname3F = new JTextField();
		Pname3F.setText(professorVo2.getpName());
		Pname3F.setColumns(10);
		Pname3F.setBounds(231, 22, 116, 21);
		panel_4.add(Pname3F);

		pRoom3F = new JTextField();
		pRoom3F.setText(professorVo2.getpRoom());
		pRoom3F.setColumns(10);
		pRoom3F.setBounds(231, 87, 116, 21);
		panel_4.add(pRoom3F);

		JLabel label_17 = new JLabel("\uAD50\uC218 \uC774\uB984:");
		label_17.setBounds(144, 25, 68, 15);
		panel_4.add(label_17);

		JLabel label_18 = new JLabel("\uACFC\uBAA9:");
		label_18.setBounds(144, 56, 56, 15);
		panel_4.add(label_18);

		JLabel label_19 = new JLabel("\uAD50\uC218\uBC29:");
		label_19.setBounds(144, 91, 56, 15);
		panel_4.add(label_19);

		label5 = new JLabel("");
		label5.setBounds(12, 10, 105, 96);
		panel_4.add(label5);

		JLabel label_21 = new JLabel("\uAC15\uC758 \uAD50\uC7AC:");
		label_21.setBounds(144, 132, 68, 15);
		panel_4.add(label_21);

		JLabel label_22 = new JLabel("\uAD50\uC7AC \uC800\uC790:");
		label_22.setBounds(144, 190, 68, 15);
		panel_4.add(label_22);

		JLabel label_23 = new JLabel("\uAD50\uC7AC \uCD9C\uD310\uC0AC:");
		label_23.setBounds(144, 161, 80, 15);
		panel_4.add(label_23);

		bookName3F = new JTextField();
		bookName3F.setText(professorVo2.getBookName());
		bookName3F.setColumns(10);
		bookName3F.setBounds(232, 129, 116, 21);
		panel_4.add(bookName3F);

		bookManker3F = new JTextField();
		bookManker3F.setText(professorVo2.getBookMaker());
		bookManker3F.setColumns(10);
		bookManker3F.setBounds(232, 159, 116, 21);
		panel_4.add(bookManker3F);

		bookWriter3F = new JTextField();
		bookWriter3F.setText(professorVo2.getBookWriter());
		bookWriter3F.setColumns(10);
		bookWriter3F.setBounds(232, 187, 116, 21);
		panel_4.add(bookWriter3F);

		JTextArea textArea_2 = new JTextArea();
		textArea_2.setText(professorVo2.getSubjectP());
		textArea_2.setBounds(28, 224, 367, 37);
		panel_4.add(textArea_2);

		button_2 = new JButton("\uC218\uC815");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProfessorVo updateProfessor = new ProfessorVo(3, Pname3F.getText(), subject3F.getText(),
						textArea.getText(), pRoom3F.getText(), bookName3F.getText(), bookWriter3F.getText(),
						bookManker3F.getText());
				try {
					professorManager.professorSujung(updateProfessor);
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "수정 오류");
					e1.printStackTrace();
				}
			}
		});
		button_2.setBounds(361, 189, 72, 23);
		panel_4.add(button_2);

		pic3 = new JButton("\uC0AC\uC9C4");
		pic3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fileChooser.setCurrentDirectory(file);
				fileChooser.setFileSelectionMode(JFileChooser.OPEN_DIALOG);
				int result = fileChooser.showOpenDialog(PlanP2.this);
				if (result == JFileChooser.APPROVE_OPTION) {
					// 파일 선택
					File selectedFile = fileChooser.getSelectedFile();
					try {
						inImage = ImageIO.read(new File(selectedFile.getAbsolutePath()));
						inresizedImage = inImage.getScaledInstance(label5.getWidth(), label5.getHeight(), 0);

					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					label5.setIcon(new ImageIcon(inresizedImage));
				}

			}
		});
		pic3.setBounds(359, 51, 74, 21);
		panel_4.add(pic3);

		book3 = new JButton("\uCC45");
		book3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fileChooser.setCurrentDirectory(file);
				fileChooser.setFileSelectionMode(JFileChooser.OPEN_DIALOG);
				int result = fileChooser.showOpenDialog(PlanP2.this);
				if (result == JFileChooser.APPROVE_OPTION) {
					// 파일 선택
					File selectedFile = fileChooser.getSelectedFile();
					try {
						inImage = ImageIO.read(new File(selectedFile.getAbsolutePath()));
						inresizedImage = inImage.getScaledInstance(label6.getWidth(), label6.getHeight(), 0);

					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					label6.setIcon(new ImageIcon(inresizedImage));
				}
			}
		});
		book3.setBounds(360, 153, 73, 23);
		panel_4.add(book3);
		loadImage();
		tabbedPane.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {

				exist();

			}
		});

	}

	private void loadImage() {
		Image img;
		Image img1;
		Image img2;
		Image img3;
		try {
			img = ImageIO.read(new File(file + "\\AlbumArtSmall.jpg"));
			Image resizedImage = img.getScaledInstance(label1.getWidth(), label1.getHeight(), 0);
			img1 = ImageIO.read(new File(file + "\\3.jpg"));
			Image resizedImage1 = img1.getScaledInstance(label2.getWidth(), label2.getHeight(), 0);
			img2 = ImageIO.read(new File(file + "\\2.jpg"));
			Image resizedImage2 = img2.getScaledInstance(label4.getWidth(), label4.getHeight(), 0);
			img3 = ImageIO.read(new File(file + "\\1.jpg"));
			Image resizedImage3 = img3.getScaledInstance(label6.getWidth(), label6.getHeight(), 0);

			label1.setIcon(new ImageIcon(resizedImage));
			label2.setIcon(new ImageIcon(resizedImage1));
			label3.setIcon(new ImageIcon(resizedImage));
			label4.setIcon(new ImageIcon(resizedImage2));
			label5.setIcon(new ImageIcon(resizedImage));
			label6.setIcon(new ImageIcon(resizedImage3));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		book1.setEnabled(false);
		book2.setEnabled(false);
		book3.setEnabled(false);
		pic1.setEnabled(false);
		pic2.setEnabled(false);
		pic3.setEnabled(false);
		button.setEnabled(false);
		button_1.setEnabled(false);
		button_2.setEnabled(false);

	}

	public void exist() {

		try {
			professorVo = professorManager.findSubjectPlan(1);
			professorVo1 = professorManager.findSubjectPlan(2);
			professorVo2 = professorManager.findSubjectPlan(3);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean is = false;
		boolean is1 = false;
		boolean is2 = false;

		String str1 = tabProfessorPanel.getProStr();

		if (str1.equals(professorVo.getpName())) {
			is = true;
		} else if (str1.equals(professorVo1.getpName())) {
			is1 = true;
		} else if (str1.equals(professorVo2.getpName())) {
			is2 = true;
		}
		if (is) {

			book1.setEnabled(true);
			book2.setEnabled(false);
			book3.setEnabled(false);
			pic1.setEnabled(true);
			pic2.setEnabled(false);
			pic3.setEnabled(false);
			button.setEnabled(true);
			button_1.setEnabled(false);
			button_2.setEnabled(false);

		} else if (is1) {
			book1.setEnabled(false);
			book2.setEnabled(true);
			book3.setEnabled(false);
			pic1.setEnabled(false);
			pic2.setEnabled(true);
			pic3.setEnabled(false);
			button.setEnabled(false);
			button_1.setEnabled(true);
			button_2.setEnabled(false);
		} else if (is2) {
			book1.setEnabled(false);
			book2.setEnabled(false);
			book3.setEnabled(true);
			pic1.setEnabled(false);
			pic2.setEnabled(false);
			pic3.setEnabled(true);
			button.setEnabled(false);
			button_1.setEnabled(false);
			button_2.setEnabled(true);
		}

	}

}
