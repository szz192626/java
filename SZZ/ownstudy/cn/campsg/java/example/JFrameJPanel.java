package cn.campsg.java.example;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JFrameJPanel {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Frame with Panel");// 定义对象-窗体
		frame.getContentPane().setBackground(Color.CYAN);// 利用方法设置它的背景颜色
		JPanel panel = new JPanel();// 定义一个JPanel对象-面板
		panel.setBackground(Color.yellow);// 设置它的背景颜色
		JButton button = new JButton("Press me");// 定义一个按钮对象
		panel.add(button);// 将按钮放入panel中
		frame.getContentPane().add(panel, BorderLayout.SOUTH);
		// 将面板置于整个窗体的南部，也就是低端
		frame.setSize(300, 200);// 设置整个窗体的尺寸
		frame.setVisible(true);// 最后设置该窗体的可见性为真
	}

}
