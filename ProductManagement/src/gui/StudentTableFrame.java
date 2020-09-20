package gui;

import java.util.List;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.border.TitledBorder;

import entity.Student;

public class StudentTableFrame extends JFrame {
	public StudentTableFrame(List<Student> list) {
		Vector<Vector<Object>> vectordate = new Vector<>();
		for (Student student : list) {
			Vector<Object> objs = new Vector<>();
			objs.add(new Integer(student.getId()));
			objs.add(student.getName());
			objs.add(new Integer(student.getClass1()));
			objs.add(new Integer(student.getStudynum()));
			vectordate.add(objs);
		}
		String[] labels = { "序号", "姓名", "班级", "学号" };
		Vector<String> columNames = new Vector<>();
		for (String label : labels) {
			columNames.add(label);
		}

		JTable table = new JTable(vectordate, columNames);

		JScrollPane scrollPane = new JScrollPane(table);
		this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

		JPanel panel = new JPanel();

		panel.setLayout(null);
		panel.setBorder(new TitledBorder(null, "总面板", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.getContentPane().add(panel);
		panel.add(scrollPane);
		scrollPane.setBounds(15, 15, 300, 200);
		scrollPane.setBorder(new TitledBorder(null, "分数面板", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.setSize(420, 300);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

}
