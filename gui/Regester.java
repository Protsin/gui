package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Regester extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Regester() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(108, 36, 149, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(108, 83, 149, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(108, 127, 149, 21);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(108, 167, 149, 21);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(108, 208, 149, 21);
		contentPane.add(passwordField_1);
		
		JLabel lblNewLabel = new JLabel("邮箱");
		lblNewLabel.setBounds(29, 39, 54, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("验证码");
		lblNewLabel_1.setBounds(29, 86, 54, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("username\r\n");
		lblNewLabel_2.setBounds(29, 130, 54, 15);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("输入密码");
		lblNewLabel_3.setBounds(29, 170, 54, 15);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("再次输入密码");
		lblNewLabel_4.setBounds(29, 211, 98, 15);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("发送");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//发送验证码
			}
		});
		btnNewButton.setBounds(298, 35, 93, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("确认");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//比对是否正确
				//textField_1为验证码
				//passwordField_1和passwordField为两次密码
				//判断验证码是否正确
//				if(textField==  &&passwordField==passwordField_1) {      修改成功 密码符合规定，且两次密码相等，验证码正确
//					new selectType1();
//				}
//				if(textField_1) {验证码不正确
//					JOptionPane.showMessageDialog(null, "错误", "验证码错误", JOptionPane.ERROR_MESSAGE);
//				}
//				if(passwordField_1 !=passwordField) {  两次密码不匹配
//					JOptionPane.showMessageDialog(null, "错误", "两次密码不匹配", JOptionPane.ERROR_MESSAGE);
//				}
//				if() {  两次密码相等但不符合规定在6-10位
//					JOptionPane.showMessageDialog(null, "错误", "密码设置不符合规定，请设置6-10位", JOptionPane.ERROR_MESSAGE);
//				}
			}
		});
		btnNewButton_1.setBounds(298, 207, 93, 23);
		contentPane.add(btnNewButton_1);
		setVisible(true);
	}

}
