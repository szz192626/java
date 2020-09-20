package enterpriseGui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;



public class ManageFrame extends JFrame implements ActionListener{
	
	
	JButton jButtonSalary=new JButton("员工工资管理");
	JButton jButtonTime=new JButton("员工考勤管理");
	JButton jButtonInformation=new JButton("员工基本信息");
	JButton jButtonPeopleManage=new JButton("人 事 管 理");
	JButton jButtonSystemManage=new JButton("系 统 管 理");
	
	public ManageFrame(String title){
		super(title);
		Container container=this.getContentPane();
		
		container.setLayout(null);
		
		jButtonSalary.setBounds(150, 30, 180,65);
		jButtonTime.setBounds(150,110,180, 65);
		jButtonInformation.setBounds(150, 190, 180, 65);
		jButtonPeopleManage.setBounds(150, 270, 180, 65);
		jButtonSystemManage.setBounds(150, 350, 180, 65);
		
		container.add(jButtonSalary);
		container.add(jButtonTime);
		container.add(jButtonInformation);
		container.add(jButtonPeopleManage);
		container.add(jButtonSystemManage);
		
	    this.setLocation(400,200);
		this.setSize(500, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ManageFrame("系统管理");
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if("员工基本信息".equals(e.getActionCommand())) {
		  new EmployeeAttendanceFrame(getTitle());
		}
		if("系 统 管 理".equals(e.getActionCommand())){
			new SystemManageFrame(getTitle());
		}
		
	}
}