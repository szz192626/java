package enterpriseGui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class InquireFrame extends JFrame implements ActionListener {
	JLabel jId = new JLabel("工号：");

	JTextField jtfId = new JTextField("", 10);

	JButton jButtonInsert = new JButton("考勤查询");
	JButton jButtonDelete = new JButton("工资查询");
	JButton jButtonSearch = new JButton("返回");

	public InquireFrame(String title) {
		super(title);
		Container container = this.getContentPane();

		container.setLayout(null);
		jId.setBounds(130, 20, 80, 50);
		jtfId.setBounds(180, 20, 150, 50);

		jButtonInsert.setBounds(175, 125, 165, 60);
		jButtonDelete.setBounds(175, 225, 165, 60);
		jButtonSearch.setBounds(175, 325, 165, 60);

		container.add(jId);
		container.add(jtfId);

		container.add(jButtonInsert);
		container.add(jButtonDelete);
		container.add(jButtonSearch);
		jButtonInsert.addActionListener(this);
		jButtonDelete.addActionListener(this);
		jButtonSearch.addActionListener(this);

		this.setLocation(350, 350);
		this.setSize(500, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new InquireFrame("员工考勤管理");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}
