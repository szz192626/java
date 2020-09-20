package enterpriseGui;


import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;


import enterprisedao.EnterpriseTpasswordDao;
import enterprisedaoimpl.*;
import enterprisedaoimpl.TpasswordDaolmpl;
import enterpriseEntity.EnterpriseTpassword;;

public class UserPasswordFrame extends JFrame implements ActionListener {
	JLabel jId = new JLabel("工号：");
	JLabel jUser = new JLabel("用户名：");
	JLabel jPassword = new JLabel("密码：");

	JTextField jtfId = new JTextField("", 10);
	JTextField jtfUser = new JTextField("", 10);
	JTextField jtfPassword = new JTextField("", 10);
	
	JButton jButton1 = new JButton("查询");
	JButton jButton2 = new JButton("增加");
	JButton jButton3 = new JButton("删除");

	public UserPasswordFrame(String title) {
		super(title);
		Container container = this.getContentPane();

		container.setLayout(null);
		jId.setBounds(200, 150, 80, 50);
		jtfId.setBounds(250, 150, 175, 45);
		
		jUser.setBounds(200, 200, 80, 50);
		jtfUser.setBounds(250, 200, 175, 45);
		
		jPassword.setBounds(200, 250, 80, 50);
		jtfPassword.setBounds(250, 250, 175, 45);

		jButton1.setBounds(200, 50, 220, 80);
		jButton2.setBounds(80, 320, 200, 80);
		jButton3.setBounds(380, 320, 200, 80);

		container.add(jId);
		container.add(jtfId);
		container.add(jUser);
		container.add(jtfUser);
		container.add(jPassword);
		container.add(jtfPassword);
		
		container.add(jButton1);
		container.add(jButton2);
		container.add(jButton3);
		jButton1.addActionListener(this);
		jButton2.addActionListener(this);
		jButton3.addActionListener(this);

		this.setLocation(600, 200);
		this.setSize(650, 520);
		this.setVisible(true);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		EnterpriseTpasswordDao dao = new TpasswordDaolmpl();
		System.out.println(e.getActionCommand());
		if("查询".equals(e.getActionCommand())){
			List<EnterpriseTpassword> enterpriseTpasswordlist=null;
			enterpriseTpasswordlist=dao.getById(Integer.parseInt(jtfId.getText()));
			new TpasswordTableFrame(enterpriseTpasswordlist);
			
		}
		else if("增加".equals(e.getActionCommand())){
			EnterpriseTpassword tpassword = new EnterpriseTpassword();
			tpassword.setId(Integer.parseInt(jtfId.getText()));
			tpassword.setUser(jtfUser.getText());
			tpassword.setPassword(jtfPassword.getText());
			
			
			int code= dao.add(tpassword);
	            System.out.println(code);
		

		}else if("删除".equals(e.getActionCommand())){
			EnterpriseTpassword tpassword = new EnterpriseTpassword();
			tpassword.setId(Integer.parseInt(jtfId.getText()));
			int code= dao.delete(tpassword);
            System.out.println(code);
		}
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new UserPasswordFrame("用户密码管理");
	}
}