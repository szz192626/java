package swingdemo;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.List;

public class Swing extends JFrame implements ActionListener {

	JComboBox<Phone> phones = null;
	JTextArea jta = null;

	public Swing() throws HeadlessException {
		// TODO Auto-generated constructor stub
	}

	public Swing(String title) throws HeadlessException {

		Box boxv1 = Box.createVerticalBox();

		boxv1.add(new JLabel("请选择籍贯"));
		JRadioButton jrb1 = new JRadioButton("江苏省宿迁市");
		jrb1.setActionCommand("江苏省宿迁市");
		JRadioButton jrb2 = new JRadioButton("江苏省苏州市");
		jrb2.setActionCommand("江苏省苏州市");

		boxv1.add(jrb1);
		boxv1.add(jrb2);
		boxv1.add(Box.createVerticalStrut(200));
		ButtonGroup bg = new ButtonGroup();
		bg.add(jrb1);
		bg.add(jrb2);
		jrb1.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				jta.setText(jta.getText() + "\n您选择的籍贯为：" + bg.getSelection().getActionCommand());
			}
		});

		Box boxv2 = Box.createVerticalBox();

		String[] strs = new String[] { "高数                        ", "英语                      ", "java          ",
				"HTML5           ", "数据库技术                          " };
		JList<String> jl1 = new JList(strs);
		List<String> list = jl1.getSelectedValuesList();
		boxv2.add(new JScrollPane(jl1));
		jl1.setBorder(BorderFactory.createTitledBorder("请选择你的课程:"));
		jl1.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				int[] indices = jl1.getSelectedIndices();
				List<String> list = jl1.getSelectedValuesList();
				for (int i = 0; i < list.size(); i++) {
					jta.setText(jta.getText() + "\n你选择的课程为:" + list.get(i));
				}
			}
		});
		boxv2.add(Box.createVerticalStrut(100));

		Box boxv3 = Box.createVerticalBox();
		Phone[] phs = new Phone[] { new Phone("小米", 1800), new Phone("华为", 3000), new Phone("iphone", 5800),
				new Phone("oppo", 1500) };
		phones = new JComboBox<Phone>(phs);
		phones.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				jta.setText(jta.getText() + "\n您选择的手机为" + phones.getSelectedItem());
			}
		});
		boxv3.add(phones);
		phones.setBorder(BorderFactory.createTitledBorder("请选择手机品牌："));
		boxv3.add(Box.createVerticalStrut(100));

		Box boxH1 = Box.createHorizontalBox();
		boxH1.add(boxv1);
		boxH1.add(boxv2);
		boxH1.add(boxv3);

		Box boxH2 = Box.createHorizontalBox();
		jta = new JTextArea("可以开始选择了", 100, 100);
		boxH2.add(jta);

		Box boxH3 = Box.createVerticalBox();
		boxH3.add(boxH1);
		boxH3.add(boxH2);
		this.setContentPane(boxH3);
		setBounds(100, 100, 600, 600);
		setVisible(true);

	}

	public static void main(String[] args) {
		new Swing("图形界面程序");
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}
}
