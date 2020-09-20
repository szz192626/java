package swingdemo;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Demo05_NullLayout extends JFrame{

	JTextField jtf=null;
	JButton jbgo=null;
	JTextArea jta=null;
	
	
	
	
	
	public Demo05_NullLayout() throws HeadlessException {
		super();
		// TODO Auto-generated constructor stub
	}

	public Demo05_NullLayout(String title) throws HeadlessException {
		super(title);
		// TODO Auto-generated constructor stub
		jtf=new JTextField(20);
		jtf.setText("上面的输入框：");
		jta=new JTextArea(20,30);
		jta.setText("中间的输入框可以多行输入：");
		jbgo=new JButton("计算结果");
		
		Container jp=this.getContentPane();
		jp.setLayout(null);//如果不显示null布局，那么缺省的是BorderLayout
		
		jp.add(jtf);
		jtf.setBounds(50,20,100,50);
		jp.add(jta);
		jta.setBounds(50,100,200,180);
	    jp.add(jbgo);
	    jbgo.setBounds(50,300,100,60);
		
		this.setSize(400,400);
		
		this.setLocation(200,100);
		
		this.setVisible(true);
		
	}

	public static void main(String[] args) {
		
		new Demo05_NullLayout("边界布局");
	}
	}
