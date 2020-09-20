package cn.campsg.java.example;

import java.awt.BorderLayout;
import java.awt.GridLayout;

/**
 * ��������
 */
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


	class CalculatorFrame extends JFrame {
		// CalculatorFrame��Ϊ�����������
		private JButton keys[];// ����������ּ��������ť
		private JPanel keyPadJPanel;// ���������������еİ�ť����
		private JTextField lcdTextField;// ������ʾ����Ľ��

		public CalculatorFrame()// ���幹�췽��
		{// ���ô���ı���
			setTitle("Calculator");
			// ����һ�������ı�������Ϊ20
			lcdTextField = new JTextField(20);
			// ����һ����ť���͵����飬��СΪ16
			keys = new JButton[16];
			// 0�Ű�ť��9�Ű�ť��Ϊ����
			for (int i = 0; i <= 9; i++) {
				keys[i] = new JButton(String.valueOf(i));
				// String.valueof()�����ǽ�������Ĳ���ת��Ϊ��Ӧ���ַ�������������1ת�����ַ���1
			}
			// 10�Ű�ť��15�Ű�ť��Ϊ���Ű�ť
			keys[10] = new JButton("/");
			keys[11] = new JButton("*");
			keys[12] = new JButton("-");
			keys[13] = new JButton("+");
			keys[14] = new JButton("=");
			keys[15] = new JButton(".");
			// ��������װ�ظ���ť�������������������4��4�е����粼�ֹ�����
			keyPadJPanel = new JPanel();
			keyPadJPanel.setLayout(new GridLayout(4, 4));
			// ���ظ���ť
			for (int i = 7; i <= 10; i++) 
				// �Ȱ�7,8,9,���ĸ���ť��������һ��
				keyPadJPanel.add(keys[i]);
			
			for (int i = 4; i <= 6; i++) 
				// ��4,5,6,���ĸ���ť�������ڶ���
				keyPadJPanel.add(keys[i]);
			
			for (int i = 1; i <= 3; i++) 
				// ��1,2,3�����ĸ���ť������������
				keyPadJPanel.add(keys[i]);
				keyPadJPanel.add(keys[12]);
			
			    
				keyPadJPanel.add(keys[0]);
			for (int i = 15; i >= 13; i--) 
				
				// ��0��. ,=,���ĸ���ť������������
				keyPadJPanel.add(keys[i]);
				
			
			// ��������ı���Ͱ�ť���
			add(lcdTextField, BorderLayout.NORTH);// ���ڱ���
			add(keyPadJPanel, BorderLayout.SOUTH);
		}

	}


     public   class Calculator {
	// Calcolator ��ΪӦ�ó���������
	public static void main(String args[]) {
		// ����CalculatorFrame�������
		CalculatorFrame calculatorFrame = new CalculatorFrame();
		// ���ô����������
		calculatorFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//���ô���رղ���
		calculatorFrame.setSize(200, 200);//���ô���Ĵ�С
		calculatorFrame.setVisible(true);
	}
   }
