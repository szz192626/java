package enterpriseGui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import enterpriseEntity.EnterpriseUser;
import enterprisedao.EnterpriseUserDao;
import enterprisedaoimpl.Userdaolmpl;

public class FirstPanelFrame extends JFrame implements ActionListener{
	
	JLabel jl1=new JLabel("企业人事管理登录界面");
	JLabel jl2=new JLabel("用户名：");
	JLabel jl3=new JLabel("密码：");
	JTextField jtf1 = new JTextField("",40);
	JTextField jtf2 = new JPasswordField("",40);
	JButton jb1=new JButton("注册");
	JButton jb2=new JButton("登录");
	JButton jb3=new JButton("注销");
	
	 public FirstPanelFrame(String title) {
		 super(title);
	     Container container = this.getContentPane();
	
	     container.setLayout(null);
	     jl1.setBounds(180,20,150,30);
	     jl2.setBounds(140,100,150,40);
	     jl3.setBounds(140,160,150,40);
	     jtf1.setBounds(200,100,150,30);
	     jtf2.setBounds(200,160,150,30);
	     jb1.setBounds(100,250,100,40);
	     jb2.setBounds(200,250,100,40);
	     jb3.setBounds(300,250,100,40);
	
	
	     container.add(jl1);
	     container.add(jl2);
	     container.add(jl3);
	     container.add(jtf1);
	     container.add(jtf2);
	     container.add(jb1);
	     container.add(jb2);
	     container.add(jb3);
	     
	    this.setSize(500, 400);
	    this.setLocation(400, 150);
		this.setVisible(true);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

}
	 

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
             EnterpriseUserDao dao=new Userdaolmpl();
			System.out.println(e.getActionCommand());
			if("注册".equals(e.getActionCommand())) {
				EnterpriseUser user=new EnterpriseUser();
				user.setName(jtf1.getText());
				user.setPassword(jtf2.getText());
				int code=dao.add(user);
				System.out.println(code);
			}else if("登录".equals(e.getActionCommand())){
				List<EnterpriseUser> userlist=null;
				EnterpriseUser user=new EnterpriseUser();
				user.setName(jtf1.getText());
				user.setPassword(jtf2.getText());
				userlist=dao.getEnterpriseUser(user);
				if(userlist.size()!=0) {
					new RegisterFrame("登录");
					this.setVisible(false);
				}
				
			}
			
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			new FirstPanelFrame("企业人事管理系统");
		}
	
}