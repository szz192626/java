package YS;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

public class Demo01 extends JFrame implements ActionListener{

	JTextArea txtDemo=new JTextArea("姓名：",10,30);
    JMenuBar jmb=new JMenuBar();
    
    JMenu  firstMenu=new JMenu("首页");
	JMenu  informationMenu=new JMenu("信息");
	JMenu  moreMenu=new JMenu("更多");
	
	JMenuItem Item1=new JMenuItem("员工工资");
	JMenuItem Item2=new JMenuItem("员工考核");
	JMenuItem Item3=new JMenuItem("员工信息");
	JMenuItem Item4=new JMenuItem("职业管理");
	JMenuItem Item5=new JMenuItem("系统管理");
	
	 public Demo01(String title) {
		super(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container container=this.getContentPane();
		
		container.add(new Label(""),BorderLayout.NORTH);
		
		container.add(txtDemo,BorderLayout.CENTER);
		
		this.setJMenuBar(jmb);
		jmb.add(firstMenu);
		jmb.add(informationMenu);
        jmb.add(moreMenu);  		
		
        informationMenu.setMnemonic(KeyEvent.VK_F);
        
        Item1.addActionListener(this);
        Item2.addActionListener(this);
        Item3.addActionListener(this);
        Item4.addActionListener(this);
        Item5.addActionListener(this);
        
        this.pack();
        this.setLocation(200,200);
        this.setVisible(true);
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		new Demo01("企业人事管理系统");
	}
	
	
	
	
	
}
