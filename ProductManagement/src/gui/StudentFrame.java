package gui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import dao.StudentDao;
import daoimpl.StudentDaolmpl;
import entity.Student;

public class StudentFrame extends JFrame implements ActionListener {
	JLabel jId = new JLabel("id：");
	JLabel jName = new JLabel("名字：");
	JLabel jClass = new JLabel("班级：");
	JLabel jNum = new JLabel("学号：");

	JTextField jtfId = new JTextField("", 40);
	JTextField jtfName = new JTextField("", 40);
	JTextField jtfClass = new JTextField("", 40);
	JTextField jtfNum = new JTextField("", 40);

	JButton jButtonInsert = new JButton("添加学生信息");
	JButton jButtonDelete = new JButton("删除学生信息");
	JButton jButtonSearch = new JButton("查询学生信息");

	public StudentFrame(String title) {
		super(title);
		Container container = this.getContentPane();

		container.setLayout(null);
		jId.setBounds(10, 20, 40, 30);
		jtfId.setBounds(60, 20, 100, 30);

		jName.setBounds(10, 60, 40, 30);
		jtfName.setBounds(60, 60, 100, 30);

		jClass.setBounds(10, 100, 40, 30);
		jtfClass.setBounds(60, 100, 100, 30);

		jNum.setBounds(10, 140, 40, 30);
		jtfNum.setBounds(60, 140, 100, 30);

		jButtonInsert.setBounds(10, 230, 100, 30);
		jButtonDelete.setBounds(120, 230, 100, 30);
		jButtonSearch.setBounds(230, 230, 100, 30);

		container.add(jId);
		container.add(jtfId);

		container.add(jName);
		container.add(jtfName);

		container.add(jClass);
		container.add(jtfClass);

		container.add(jNum);
		container.add(jtfNum);

		container.add(jButtonInsert);
		container.add(jButtonDelete);
		container.add(jButtonSearch);
		jButtonInsert.addActionListener(this);
		jButtonDelete.addActionListener(this);
		jButtonSearch.addActionListener(this);

		this.setSize(400, 360);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		StudentDao dao = new StudentDaolmpl();
		// TODO Auto-generated method stub
		System.out.println(e.getActionCommand());
		if ("添加学生信息".equals(e.getActionCommand())) {

			Student student = new Student();
			student.setId(Integer.parseInt(jtfId.getText()));
			student.setName(jtfName.getText());
			student.setClass1(Integer.parseInt(jtfClass.getText()));
			student.setStudynum(Integer.parseInt(jtfNum.getText()));

			int code = dao.add(student);

			System.out.println(code);
		} else if ("删除学生信息".equals(e.getActionCommand())) {

			Student student = new Student();
			student.setId(Integer.parseInt(jtfId.getText()));
			int code = dao.delete(student);
			System.out.println(code);

		} else if ("查询学生信息".equals(e.getActionCommand())) {
			Student student = new Student();
			List<Student> code = dao.getAll();
			System.out.println(code);

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new StudentFrame("学生信息管理");

	}
}
