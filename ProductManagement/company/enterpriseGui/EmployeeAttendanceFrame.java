package enterpriseGui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class EmployeeAttendanceFrame extends JFrame implements ActionListener {

	JButton jButton1 = new JButton("查询");
	JButton jButton2 = new JButton("增加");
	JButton jButton3 = new JButton("删除");

	public EmployeeAttendanceFrame(String title) {
		super(title);
		Container container = this.getContentPane();

		container.setLayout(null);

		jButton1.setBounds(120, 30, 200, 80);
		jButton2.setBounds(120, 130, 200, 80);
		jButton3.setBounds(120, 230, 200, 80);

		container.add(jButton1);
		container.add(jButton2);
		container.add(jButton3);

		this.setLocation(400, 200);
		this.setSize(450, 400);
		this.setVisible(true);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new EmployeeAttendanceFrame("员工基本信息");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}
