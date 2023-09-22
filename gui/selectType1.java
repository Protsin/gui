package gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class selectType1 extends JFrame {
	

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					selectType1 frame = new selectType1();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */

		public selectType1( ) {
			
			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 450, 300);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			
		//getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("小学");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String num=JOptionPane.showInputDialog(contentPane, "请输入出题数量，10-30", "准备生成小学题目",JOptionPane.QUESTION_MESSAGE);
				int NUM=Integer.parseInt(num);
				if(NUM>=10&&NUM<=30) {
					//交给QuestionImpl，
					QuestionImpl question1=new QuestionImpl(NUM);
					question1.manage(NUM);
				}else {
					JOptionPane.showMessageDialog(contentPane,"ERROR", "请输入10-30", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnNewButton.setBounds(158, 25, 93, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("初中");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String num=JOptionPane.showInputDialog(contentPane, "请输入出题数量，10-30", "准备生成初中题目",JOptionPane.QUESTION_MESSAGE);
				int NUM=Integer.parseInt(num);
				if(NUM>=10&&NUM<=30) {
					//交给QuestionImpl，
					QuestionImpl question1=new QuestionImpl(NUM);
					question1.manage(NUM);
				}else {
					JOptionPane.showMessageDialog(contentPane,"ERROR", "请输入10-30", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnNewButton_1.setBounds(158, 74, 93, 23);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("高中");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String num=JOptionPane.showInputDialog(contentPane, "请输入出题数量，10-30", "准备生成高中题目",JOptionPane.QUESTION_MESSAGE);
				int NUM=Integer.parseInt(num);
				if(NUM>=10&&NUM<=30) {
					//交给QuestionImpl，
					QuestionImpl question1=new QuestionImpl(NUM);
					question1.manage(NUM);
				}else {
					JOptionPane.showMessageDialog(contentPane,"ERROR", "请输入10-30", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnNewButton_2.setBounds(158, 125, 93, 23);
		getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("修改密码");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new ChangePassword();
			}
		});
		btnNewButton_3.setBounds(158, 180, 93, 23);
		getContentPane().add(btnNewButton_3);
	
	}
	

}
