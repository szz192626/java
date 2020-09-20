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

		boxv1.add(new JLabel("��ѡ�񼮹�"));
		JRadioButton jrb1 = new JRadioButton("����ʡ��Ǩ��");
		jrb1.setActionCommand("����ʡ��Ǩ��");
		JRadioButton jrb2 = new JRadioButton("����ʡ������");
		jrb2.setActionCommand("����ʡ������");

		boxv1.add(jrb1);
		boxv1.add(jrb2);
		boxv1.add(Box.createVerticalStrut(200));
		ButtonGroup bg = new ButtonGroup();
		bg.add(jrb1);
		bg.add(jrb2);
		jrb1.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				jta.setText(jta.getText() + "\n��ѡ��ļ���Ϊ��" + bg.getSelection().getActionCommand());
			}
		});

		Box boxv2 = Box.createVerticalBox();

		String[] strs = new String[] { "����                        ", "Ӣ��                      ", "java          ",
				"HTML5           ", "���ݿ⼼��                          " };
		JList<String> jl1 = new JList(strs);
		List<String> list = jl1.getSelectedValuesList();
		boxv2.add(new JScrollPane(jl1));
		jl1.setBorder(BorderFactory.createTitledBorder("��ѡ����Ŀγ�:"));
		jl1.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				int[] indices = jl1.getSelectedIndices();
				List<String> list = jl1.getSelectedValuesList();
				for (int i = 0; i < list.size(); i++) {
					jta.setText(jta.getText() + "\n��ѡ��Ŀγ�Ϊ:" + list.get(i));
				}
			}
		});
		boxv2.add(Box.createVerticalStrut(100));

		Box boxv3 = Box.createVerticalBox();
		Phone[] phs = new Phone[] { new Phone("С��", 1800), new Phone("��Ϊ", 3000), new Phone("iphone", 5800),
				new Phone("oppo", 1500) };
		phones = new JComboBox<Phone>(phs);
		phones.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				jta.setText(jta.getText() + "\n��ѡ����ֻ�Ϊ" + phones.getSelectedItem());
			}
		});
		boxv3.add(phones);
		phones.setBorder(BorderFactory.createTitledBorder("��ѡ���ֻ�Ʒ�ƣ�"));
		boxv3.add(Box.createVerticalStrut(100));

		Box boxH1 = Box.createHorizontalBox();
		boxH1.add(boxv1);
		boxH1.add(boxv2);
		boxH1.add(boxv3);

		Box boxH2 = Box.createHorizontalBox();
		jta = new JTextArea("���Կ�ʼѡ����", 100, 100);
		boxH2.add(jta);

		Box boxH3 = Box.createVerticalBox();
		boxH3.add(boxH1);
		boxH3.add(boxH2);
		this.setContentPane(boxH3);
		setBounds(100, 100, 600, 600);
		setVisible(true);

	}

	public static void main(String[] args) {
		new Swing("ͼ�ν������");
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}
}
