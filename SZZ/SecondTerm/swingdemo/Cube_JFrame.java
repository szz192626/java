package swingdemo;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Cube_JFrame extends JFrame implements ActionListener {
	private JLabel jl1 = null;
	private JTextField jtf1 = null;

	private JButton jb1 = null;
	private JLabel jl2 = null;

	public Cube_JFrame() throws HeadlessException {
		super();
	}

	public Cube_JFrame(String title) throws HeadlessException {
		super(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container container = this.getContentPane();
		container.setLayout(new FlowLayout());
		jl1 = new JLabel("数字");
		jtf1 = new JTextField(10);

		jb1 = new JButton("计算立方次幂");
		jl2 = new JLabel("结果为：");

		jb1.addActionListener(this);

		container.add(jl1);
		container.add(jtf1);
		container.add(jb1);
		container.add(jl2);

		this.setSize(300, 200);
		this.setLocation(200, 200);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		double num = Double.parseDouble(jtf1.getText());
		double bearfruit = num * num * num;
		jl2.setText("结果为：" + bearfruit);

	}

	public static void main(String[] args) {
		new Cube_JFrame("运算立次方幂结果");

	}

}
