package swingdemo;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Demo_03BorderLayout extends JFrame{

	JTextField jtf=null;
	JButton jbgo=null;
	JTextArea jta=null;
	
	
	
	
	
	public Demo_03BorderLayout() throws HeadlessException {
		super();
		// TODO Auto-generated constructor stub
	}

	public Demo_03BorderLayout(String title) throws HeadlessException {
		super(title);
		// TODO Auto-generated constructor stub
		jtf=new JTextField(20);
		jtf.setText("上面的输入框：");
		jta=new JTextArea(20,30);
		jta.setText("中间的输入框可以多行输入：");
		jbgo=new JButton("计算结果");
		
		Container jp=this.getContentPane();
		jp.setLayout(new BorderLayout());
		
		jp.add(jtf,BorderLayout.NORTH);
		jp.add(jta,BorderLayout.CENTER);
//		jp.add(jbgo,BorderLayout.SOUTH);
		jp.add(jbgo,BorderLayout.EAST);
	    jp.add(new JButton("西边按钮"),BorderLayout.WEST);
		
		this.setSize(400,400);
		
		this.setLocation(200,100);
		
		this.setVisible(true);
		
	}

	public static void main(String[] args) {
		
		new Demo_03BorderLayout("边界布局");
	}
	
	
	
	
	
	
	
	
	
}
