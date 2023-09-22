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

public class SelectType extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SelectType frame = new SelectType();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SelectType() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 450, 300);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JButton btnNewButton = new JButton("小学");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
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
			btnNewButton.setBounds(166, 39, 93, 23);
			contentPane.add(btnNewButton);
			
			JButton btnNewButton_1 = new JButton("初中");
			btnNewButton_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					String num=JOptionPane.showInputDialog(contentPane, "请输入出题数量，10-30", "准备生成初中题目",JOptionPane.QUESTION_MESSAGE);
					int NUM=Integer.parseInt(num);
					if(NUM>=10&&NUM<=30) {
						
						
					}else {
						JOptionPane.showMessageDialog(contentPane,"ERROR", "请输入10-30", JOptionPane.ERROR_MESSAGE);
					}
				}
			});
			btnNewButton_1.setBounds(166, 107, 93, 23);
			contentPane.add(btnNewButton_1);
			
			JButton btnNewButton_2 = new JButton("高中");
			btnNewButton_2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					String num=JOptionPane.showInputDialog(contentPane, "请输入出题数量，10-30", "准备生成高中题目",JOptionPane.QUESTION_MESSAGE);
					int NUM=Integer.parseInt(num);
					if(NUM>=10&&NUM<=30) {
						
					}else {
						JOptionPane.showMessageDialog(contentPane,"ERROR", "请输入10-30", JOptionPane.ERROR_MESSAGE);
					}
				}
			});
			btnNewButton_2.setBounds(166, 178, 93, 23);
			contentPane.add(btnNewButton_2);
		
		setContentPane(contentPane);
	}

}
