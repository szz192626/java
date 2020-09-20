package enterpriseGui;

import java.util.List;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.border.TitledBorder;

import enterpriseEntity.EnterprisePastic;

public class PasticTableFrame extends JFrame{
public PasticTableFrame(List<EnterprisePastic>list) {
		
		
		
		Vector<Vector<Object>> vectordata=new Vector<>(); 
		for(EnterprisePastic pastic:list) {
			Vector<Object> objs=new Vector<>();
			objs.add(new Integer(pastic.getId()));
			objs.add(new Integer(pastic.getWeeklate()));
			objs.add(new Integer(pastic.getMouthlate()));
            objs.add(pastic.getYearprize());
			vectordata.add(objs);
		}
		
		String[] labels= {"周迟","月迟","年终奖"};
		Vector<String> columnNames=new Vector<>();
		for(String label:labels) {
			columnNames.add(label);
		}
		
		
		JTable table=new JTable(vectordata,columnNames);
		
		//JTable table=new JTable(rowDate,columnNames);
		
		JScrollPane scrollPane=new JScrollPane(table);
		this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);;
		
		
		JPanel panel=new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(null,"迟到考勤表",TitledBorder.LEADING,
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
