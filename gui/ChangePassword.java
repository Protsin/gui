package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ChangePassword extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 */
	public ChangePassword() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("邮箱");
		lblNewLabel.setBounds(38, 39, 54, 15);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(137, 36, 148, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("验证码");
		lblNewLabel_1.setBounds(38, 82, 54, 15);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(137, 79, 148, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("发送");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//发送验证码
			}
		});
		btnNewButton.setBounds(313, 35, 93, 23);
		contentPane.add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(137, 123, 148, 21);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel_2 = new JLabel("输入密码");
		lblNewLabel_2.setBounds(38, 126, 54, 15);
		contentPane.add(lblNewLabel_2);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(137, 164, 148, 21);
		contentPane.add(passwordField_1);
		
		JLabel lblNewLabel_3 = new JLabel("再次输入密码");
		lblNewLabel_3.setBounds(38, 167, 72, 15);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton_1 = new JButton("确定");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//比对是否正确
				//textField_1为验证码
				//passwordField_1和passwordField为两次密码
				//判断验证码是否正确
//				if(textField==  &&passwordField==passwordField_1) {
//					new selectType1();
//				}
//				if(textField_1) {验证码不正确
//					JOptionPane.showMessageDialog(null, "错误", "验证码错误", JOptionPane.ERROR_MESSAGE);
//				}
//				if(passwordField_1！=passwordField) {  两次密码不匹配
//					JOptionPane.showMessageDialog(null, "错误", "两次密码不匹配", JOptionPane.ERROR_MESSAGE);
//				}
			}
		});
		btnNewButton_1.setBounds(313, 211, 93, 23);
		contentPane.add(btnNewButton_1);
		setVisible(true);
	}
}
