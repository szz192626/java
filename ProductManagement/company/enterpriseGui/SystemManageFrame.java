package enterpriseGui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class SystemManageFrame extends JFrame implements ActionListener {

	JButton jButtonManage = new JButton("用户密码管理");

	public SystemManageFrame(String title) {
		super(title);
		Container container = this.getContentPane();

		container.setLayout(null);

		jButtonManage.setBounds(80, 80, 120, 80);

		container.add(jButtonManage);

		this.setLocation(400, 200);
		this.setSize(300, 300);
		this.setVisible(true);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SystemManageFrame("系统管理");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}