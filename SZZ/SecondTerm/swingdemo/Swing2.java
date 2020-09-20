package swingdemo;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
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

public class Swing2 extends JFrame implements ActionListener {
	
	 JComboBox<Phone> phones = null;
	 JTextArea jta ;
	 JButton btnExit;
	 JList<String> listLesson;
	 private ButtonGroup bg = new ButtonGroup();

	 public Swing2()throws HeadlessException{
		// TODO Auto-generated constructor stub
	 }
	 
	 public Swing2(String title)throws HeadlessException{

		 GraphicsEnvironment g = GraphicsEnvironment.getLocalGraphicsEnvironment();
		 
		 Box boxv1 = Box.createVerticalBox();
		 
		 boxv1.add(new JLabel("��ѡ�񼮹�"));
	     JRadioButton jrb1 = new JRadioButton("����");
	     jrb1.setActionCommand("����");
	     JRadioButton jrb2 = new JRadioButton("����");
	     jrb2.setActionCommand("����");
	     
	     boxv1.add(jrb1);
	     boxv1.add(jrb2);
	     boxv1.add(Box.createVerticalStrut(200));
	     bg.add(jrb1);
	     bg.add(jrb2);
	     jrb1.addItemListener(new ItemListener() {
	        @Override
	        public void itemStateChanged(ItemEvent e) {
	           jta.setText(jta.getText() + "\n��ѡ��ļ���Ϊ��" + bg.getSelection().getActionCommand());
	            }
	        });
	     
	      Box boxv2 = Box.createVerticalBox();
	      boxv2.add(new JLabel("��ѡ��ѡ�޵Ŀγ̣�"));
	     
	      String[] strLesson = new String[]{"�ߵ���ѧ                        ", "java�������               ",
	                "H5��ҳ���                            ", " ��ְҵӢ��                                 ", 
	                "����                                  ", "���ݿ⼼��                                  "};
	      listLesson = new JList(strLesson);
	      List<String> list =listLesson.getSelectedValuesList();
	      boxv2.add(new JScrollPane(listLesson));
	      listLesson.addListSelectionListener(new ListSelectionListener() {
	         @Override
	          public void valueChanged(ListSelectionEvent e) {
	              int[] indices = listLesson.getSelectedIndices();
	              List<String> list = listLesson.getSelectedValuesList();
	              for (int i = 0; i < list.size(); i++) {
	                    jta.setText(jta.getText() + "\n��ѡ��Ŀγ�Ϊ:" + list.get(i));
	              }
	            }
	        });
	        boxv2.add(Box.createVerticalStrut(100));
	        Box boxv3 = Box.createVerticalBox();
	        Phone[] ph = new Phone[]{new Phone("��Ϊ", 4200),
	                new Phone("С��", 3200),
	                new Phone("vivo", 3750),
	                new Phone("iPhone", 4800)};
	        phones = new JComboBox<Phone>(ph);
	        phones.addItemListener(new ItemListener() {
	            @Override
	            public void itemStateChanged(ItemEvent e) {
	                // TODO Auto-generated method stub
	                jta.setText(jta.getText() + "\n��ѡ����ֻ�Ϊ"  + phones.getSelectedItem());
	            }
	        });
	        boxv3.add(phones);
	        phones.setBorder(BorderFactory.createTitledBorder("��ѡ���ֻ�Ʒ�ƣ�"));
	        boxv3.add(Box.createVerticalStrut(200));

	        Box boxH1 = Box.createHorizontalBox();
	        boxH1.add(boxv1);
	        boxH1.add(boxv2);
	        boxH1.add(boxv3);

	        Box boxH2 = Box.createHorizontalBox();
	        jta = new JTextArea("�뿪ʼѡ��", 30, 50);
	        boxH2.add(jta);

	        Box boxv4 = Box.createVerticalBox();
	        btnExit = new JButton("�˳�");
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        boxv4.add(btnExit);

	        boxH2.add(boxv4);

	        btnExit.addActionListener(this);

	        Box baseBox = Box.createVerticalBox();
	        baseBox.add(boxH1);
	        baseBox.add(boxH2);
	        this.setContentPane(baseBox);

	        setBounds(100, 100, 600, 600);
	        setVisible(true);
	        
	    }

	    @Override
	    public void actionPerformed(ActionEvent e) {
	        if (e.getSource() == btnExit) {
	            dispose();
	        }
	    }


	    public static void main(String[] args) {
	        new Swing2("ͼ�ν������");
	    }
}
