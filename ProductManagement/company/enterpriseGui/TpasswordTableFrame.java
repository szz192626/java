package enterpriseGui;

import java.util.List;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.border.TitledBorder;

import enterpriseEntity.EnterpriseTpassword;

public class TpasswordTableFrame extends JFrame{
public TpasswordTableFrame(List<EnterpriseTpassword>list) {
		
		
		//如何由list来生成数据和表头
		Vector<Vector<Object>> vectordata=new Vector<>(); 
		for(EnterpriseTpassword tpassword:list) {
			Vector<Object> objs=new Vector<>();
			objs.add(new Integer(tpassword.getId()));
			objs.add(tpassword.getUser());
			objs.add(tpassword.getPassword());
			
			vectordata.add(objs);//objs是一条记录对应的多个字段的vector列表
		}
		
		String[] labels= {"工号","用户名","密码"};
		Vector<String> columnNames=new Vector<>();
		for(String label:labels) {
			columnNames.add(label);
		}
		/**
		 * 当JTable使用vector作为入参时，需要明确第一个参数，
		 * 要是嵌套了Vector<Object>(里面的每个元素对应一条数据记录的每个字段值）的一个Vector
		 */
		
		JTable table=new JTable(vectordata,columnNames);
		
		//JTable table=new JTable(rowDate,columnNames);
		
		JScrollPane scrollPane=new JScrollPane(table);
		
		this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		//创建内容面板
		JPanel panel=new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(null,"用户密码表",TitledBorder.LEADING,
				TitledBorder.TOP,null,null));
		this.getContentPane().add(panel);
		
		panel.add(scrollPane);
		scrollPane.setBounds(15,15,300,200);
		scrollPane.setBorder(new TitledBorder(null,"",
				TitledBorder.LEADING,TitledBorder.TOP,null,null));
		this.setSize(420,300);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
