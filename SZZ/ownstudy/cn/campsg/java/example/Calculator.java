package cn.campsg.java.example;

import java.awt.BorderLayout;
import java.awt.GridLayout;

/**
 * 计算器类
 */
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


	class CalculatorFrame extends JFrame {
		// CalculatorFrame类为计算机面体类
		private JButton keys[];// 用来存放数字及运算符按钮
		private JPanel keyPadJPanel;// 该面板用来存放所有的按钮对象
		private JTextField lcdTextField;// 用来显示计算的结果

		public CalculatorFrame()// 窗体构造方法
		{// 设置窗体的标题
			setTitle("Calculator");
			// 创建一个单行文本，长度为20
			lcdTextField = new JTextField(20);
			// 创建一个按钮类型的数组，大小为16
			keys = new JButton[16];
			// 0号按钮到9号按钮都为数字
			for (int i = 0; i <= 9; i++) {
				keys[i] = new JButton(String.valueOf(i));
				// String.valueof()方法是将括号里的参数转化为相应的字符串，即把数字1转化成字符串1
			}
			// 10号按钮到15号按钮都为符号按钮
			keys[10] = new JButton("/");
			keys[11] = new JButton("*");
			keys[12] = new JButton("-");
			keys[13] = new JButton("+");
			keys[14] = new JButton("=");
			keys[15] = new JButton(".");
			// 创建用于装载各按钮组件的面板组件，并设置4行4列的网络布局管理器
			keyPadJPanel = new JPanel();
			keyPadJPanel.setLayout(new GridLayout(4, 4));
			// 加载各按钮
			for (int i = 7; i <= 10; i++) 
				// 先把7,8,9,除四个按钮排在面板第一行
				keyPadJPanel.add(keys[i]);
			
			for (int i = 4; i <= 6; i++) 
				// 把4,5,6,乘四个按钮排在面板第二行
				keyPadJPanel.add(keys[i]);
			
			for (int i = 1; i <= 3; i++) 
				// 把1,2,3，减四个按钮排在面板第三行
				keyPadJPanel.add(keys[i]);
				keyPadJPanel.add(keys[12]);
			
			    
				keyPadJPanel.add(keys[0]);
			for (int i = 15; i >= 13; i--) 
				
				// 把0，. ,=,加四个按钮排在面板第四行
				keyPadJPanel.add(keys[i]);
				
			
			// 面体加载文本框和按钮面板
			add(lcdTextField, BorderLayout.NORTH);// 放在北部
			add(keyPadJPanel, BorderLayout.SOUTH);
		}

	}


     public   class Calculator {
	// Calcolator 类为应用程序启动类
	public static void main(String args[]) {
		// 定义CalculatorFrame窗体对象
		CalculatorFrame calculatorFrame = new CalculatorFrame();
		// 设置窗体相关属性
		calculatorFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//设置窗体关闭操作
		calculatorFrame.setSize(200, 200);//设置窗体的大小
		calculatorFrame.setVisible(true);
	}
   }
