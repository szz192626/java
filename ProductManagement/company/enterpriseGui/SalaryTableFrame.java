package enterpriseGui;

import java.util.List;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.border.TitledBorder;

import enterpriseEntity.EnterpriseSalary;

public class SalaryTableFrame extends JFrame{
public SalaryTableFrame(List<EnterpriseSalary>list) {
		
		
		
		Vector<Vector<Object>> vectordata=new Vector<>(); 
		for(EnterpriseSalary enerprise:list) {
			Vector<Object> objs=new Vector<>();
			objs.add((Double)enerprise.getCommonsalary());
			objs.add((Double)enerprise.getExtrasalary());
			objs.add((Double)enerprise.getPositionsalary());
			objs.add((Double)enerprise.getStocksalary());

			vectordata.add(objs);
		}
		
		String[] labels= {"基本工资","加成工资","职位加成","股份加成"};
		Vector<String> columnNames=new Vector<>();
		for(String label:labels) {
			columnNames.add(label);
		}
		
		
		JTable table=new JTable(vectordata,columnNames);
		
		//JTable table=new JTable(rowDate,columnNames);
		
		JScrollPane scrollPane=new JScrollPane(table);
		
		this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		
		JPanel panel=new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(null,"工资表",TitledBorder.LEADING,
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
