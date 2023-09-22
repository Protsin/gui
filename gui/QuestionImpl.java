package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.GroupLayout.Group;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class QuestionImpl extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
    static int i;
    int []x=new int[41];
  static String questions[];
  static String answers[][];
  
	public QuestionImpl(int num) {
		questions=new String[num];
		answers=new String[num][4];
		for(int i = 0 ; i < num ;i++) {
			questions[i]=new String("x"+i);			
			answers[i][0]=new String("a"+i);
			answers[i][1]=new String("a"+i);
			answers[i][2]=new String("a"+i);
			answers[i][3]=new String("a"+i);
		}
	}
	

	public void manage(int num) {//生成前端对应的页面和用户交互
		//this.generateQuestion(num);

			//生成对应的页面,传入的参数依次为题目，选项1-4
			//DisaplayQuestion page=new DisplayQuestion(String question,String selections[i][0],String selections[i][1],String selections[i][2],String selections[i][3];
			
			/*调用DisplayQuestion的函数得到order（返回值为1表示下一题，-1表示上一题），answer（1-4表示选择abcd四个选项）
			int order=page.getOrder();
			answers[i]=page.getAnswer();
			
			if(order==-1) {
				i-=2;//
			}*/
		    int op[] = null;
			DisplayQuestion page=new DisplayQuestion(questions,answers,0,num,op);
			page.setVisible(true);				
			
			
	}
	
	
}
