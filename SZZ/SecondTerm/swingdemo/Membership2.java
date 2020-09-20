package swingdemo;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class Membership2 extends JFrame {
	private JTextField jtf = null;
	private JLabel jl1 = null;
	private JComboBox jcb = null;

	public Membership2() throws HeadlessException {
		super();
	}

	public Membership2(String title) throws HeadlessException {
		super(title);

		Container jp = this.getContentPane();
		jp.setLayout(new BorderLayout());
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		jl1 = new JLabel("会员登记录入");
		jp.add(jl1, BorderLayout.NORTH);
		jl1.setHorizontalAlignment(SwingConstants.CENTER);
		jl1.setFont(new java.awt.Font("宋体", 1, 18));

		JPanel jp1 = new JPanel();
		jp1.setLayout(new GridLayout(3, 3, 5, 5));

		jp1.add(new JLabel("姓        名："));
		jp1.add(new JTextField("方方"));
		jp1.add(new JLabel("性        别："));
		jp1.add(new JTextField("女"));
		jp1.add(new JLabel("联系电话："));
		jp1.add(new JTextField("17327711875"));
		jp1.add(new JLabel("类        型："));
		jp1.add(new JTextField("高级会员"));
		jp1.add(new JLabel("折        扣："));
		jp1.add(new JTextField("0.65"));
		jp1.add(new JLabel("是否挂失："));
		String[] string = { "否", "是" };
		jcb = new JComboBox(string);
		jp1.add(jcb);

		JPanel jp2 = new JPanel();
		jp2.setLayout(new GridLayout(1, 1, 5, 5));
		jp2.add(new JLabel("工作单位:"));
		jp2.add(new JTextField("龙腾国际集团"));

		jp.add(jp1, BorderLayout.CENTER);
		jp.add(jp2, BorderLayout.SOUTH);

		this.setSize(400, 250);
		this.setLocation(200, 100);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Membership2("会员登记录入界面");
	}
}
