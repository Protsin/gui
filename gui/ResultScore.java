package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ResultScore extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	
	public ResultScore(int op[]) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		//根据op数组计算得到分数并展示
		int score=0;//调用方法
		JTextArea textArea = new JTextArea("您最后得分为:"+score);
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 30));
		textArea.setBounds(83, 61, 239, 44);
		contentPane.add(textArea);
		
		JButton btnNewButton = new JButton("退出登录");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new LogSystem();				
			}
		});
		btnNewButton.setBounds(109, 188, 93, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("重新做题");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new selectType1();
				
			}
		});
		btnNewButton_1.setBounds(229, 188, 93, 23);
		contentPane.add(btnNewButton_1);
	}


	

}
