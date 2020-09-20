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
		 
		 boxv1.add(new JLabel("请选择籍贯"));
	     JRadioButton jrb1 = new JRadioButton("江苏");
	     jrb1.setActionCommand("江苏");
	     JRadioButton jrb2 = new JRadioButton("贵州");
	     jrb2.setActionCommand("贵州");
	     
	     boxv1.add(jrb1);
	     boxv1.add(jrb2);
	     boxv1.add(Box.createVerticalStrut(200));
	     bg.add(jrb1);
	     bg.add(jrb2);
	     jrb1.addItemListener(new ItemListener() {
	        @Override
	        public void itemStateChanged(ItemEvent e) {
	           jta.setText(jta.getText() + "\n您选择的籍贯为：" + bg.getSelection().getActionCommand());
	            }
	        });
	     
	      Box boxv2 = Box.createVerticalBox();
	      boxv2.add(new JLabel("请选择选修的课程："));
	     
	      String[] strLesson = new String[]{"高等数学                        ", "java程序设计               ",
	                "H5网页设计                            ", " 新职业英语                                 ", 
	                "体育                                  ", "数据库技术                                  "};
	      listLesson = new JList(strLesson);
	      List<String> list =listLesson.getSelectedValuesList();
	      boxv2.add(new JScrollPane(listLesson));
	      listLesson.addListSelectionListener(new ListSelectionListener() {
	         @Override
	          public void valueChanged(ListSelectionEvent e) {
	              int[] indices = listLesson.getSelectedIndices();
	              List<String> list = listLesson.getSelectedValuesList();
	              for (int i = 0; i < list.size(); i++) {
	                    jta.setText(jta.getText() + "\n您选择的课程为:" + list.get(i));
	              }
	            }
	        });
	        boxv2.add(Box.createVerticalStrut(100));
	        Box boxv3 = Box.createVerticalBox();
	        Phone[] ph = new Phone[]{new Phone("华为", 4200),
	                new Phone("小米", 3200),
	                new Phone("vivo", 3750),
	                new Phone("iPhone", 4800)};
	        phones = new JComboBox<Phone>(ph);
	        phones.addItemListener(new ItemListener() {
	            @Override
	            public void itemStateChanged(ItemEvent e) {
	                // TODO Auto-generated method stub
	                jta.setText(jta.getText() + "\n您选择的手机为"  + phones.getSelectedItem());
	            }
	        });
	        boxv3.add(phones);
	        phones.setBorder(BorderFactory.createTitledBorder("请选择手机品牌："));
	        boxv3.add(Box.createVerticalStrut(200));

	        Box boxH1 = Box.createHorizontalBox();
	        boxH1.add(boxv1);
	        boxH1.add(boxv2);
	        boxH1.add(boxv3);

	        Box boxH2 = Box.createHorizontalBox();
	        jta = new JTextArea("请开始选择", 30, 50);
	        boxH2.add(jta);

	        Box boxv4 = Box.createVerticalBox();
	        btnExit = new JButton("退出");
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
	        new Swing2("图形界面程序");
	    }
}
