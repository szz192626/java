package enterpriseGui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

public class RegisterFrame extends JFrame implements ActionListener {

	JButton jb1 = new JButton("普通员工登录");
	JButton jb2 = new JButton("管理员登录");
	JLabel jl = new JLabel("请输入密码：");
	JTextArea jta = new JTextArea();

	public RegisterFrame(String title) {
		super(title);
		Container container = this.getContentPane();

		container.setLayout(null);
		jb1.setBounds(170, 80, 150, 50);
		jl.setBounds(120, 160, 150, 50);
		jta.setBounds(200, 170, 160, 30);
		jb2.setBounds(170, 240, 150, 50);

		container.add(jb1);
		container.add(jl);
		container.add(jta);
		container.add(jb2);

		this.setSize(500, 400);
		this.setLocation(400, 150);
		this.setVisible(true);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RegisterFrame("职位登录界面");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
