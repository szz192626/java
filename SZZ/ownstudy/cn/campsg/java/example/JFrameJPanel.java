package cn.campsg.java.example;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JFrameJPanel {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Frame with Panel");// �������-����
		frame.getContentPane().setBackground(Color.CYAN);// ���÷����������ı�����ɫ
		JPanel panel = new JPanel();// ����һ��JPanel����-���
		panel.setBackground(Color.yellow);// �������ı�����ɫ
		JButton button = new JButton("Press me");// ����һ����ť����
		panel.add(button);// ����ť����panel��
		frame.getContentPane().add(panel, BorderLayout.SOUTH);
		// �������������������ϲ���Ҳ���ǵͶ�
		frame.setSize(300, 200);// ������������ĳߴ�
		frame.setVisible(true);// ������øô���Ŀɼ���Ϊ��
	}

}
