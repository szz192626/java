package jdbcdemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Frame extends JFrame implements ActionListener {
    JLabel jID = new JLabel(" I  D：");
    JLabel jName = new JLabel("姓名:");
    JLabel jAge = new JLabel("年龄:");
    JLabel jMoney = new JLabel("工资:");

    JTextField jtfID = new JTextField("", 20);
    JTextField jtfName = new JTextField("", 20);
    JTextField jtfAge = new JTextField("", 20);
    JTextField jtfMoney = new JTextField("", 20);

    JButton jButtonInsert = new JButton("Insert");
    JButton jButtonUpdate = new JButton("Update");
    JButton jButtonDelete = new JButton("Delete");

    public Frame(String title) {
        super(title);
        Container container = this.getContentPane();

        container.setLayout(null);
        jID.setBounds(10, 20, 40, 30);
        jtfID.setBounds(60, 20, 100, 30);

        jName.setBounds(10, 60, 40, 30);
        jtfName.setBounds(60, 60, 100, 30);

        jAge.setBounds(10, 100, 40, 30);
        jtfAge.setBounds(60, 100, 100, 30);

        jMoney.setBounds(10, 140, 40, 30);
        jtfMoney.setBounds(60, 140, 100, 30);

        jButtonInsert.setBounds(10, 200, 80, 30);
        jButtonUpdate.setBounds(100, 200, 80, 30);
        jButtonDelete.setBounds(190, 200, 80, 30);

        container.add(jID);
        container.add(jtfID);

        container.add(jName);
        container.add(jtfName);

        container.add(jAge);
        container.add(jtfAge);

        container.add(jMoney);
        container.add(jtfMoney);

        container.add(jButtonInsert);
        container.add(jButtonUpdate);
        container.add(jButtonDelete);
        jButtonInsert.addActionListener(this);
        jButtonUpdate.addActionListener(this);
        jButtonDelete.addActionListener(this);

        this.setSize(300, 300);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
        if ("Insert".equals(e.getActionCommand())) {
            String sql = "insert into company (ID,姓名,年龄,工资) values(?,?,?,?)";
            Integer id = Integer.parseInt(jtfID.getText());
            String 姓名 = jtfName.getText();
            Integer 年龄 = Integer.parseInt(jtfAge.getText());
            Integer 工资 = Integer.parseInt(jtfMoney.getText());

            int code = DBUtils.update(sql, id, 姓名, 年龄, 工资);
            System.out.println(code + "\n已加入" + 姓名 + "的基本资料");
            

        } else if ("Delete".equals(e.getActionCommand())) {
            String sql = "delete from company where id=?";

            int code = DBUtils.update(sql, new Integer(4));
            System.out.println(code + "\n已删除4号职员基本资料");
            

        } else if ("Update".equals(e.getActionCommand())) {
            String sql = "Update company set 工资=工资*1.1 where ID=2";
            Integer id = Integer.parseInt(jtfID.getText());

            int code = DBUtils.update(sql);
            System.out.println(code + "\n已将2号职员工资增加10%");
            
        }
    }
}

    public class TestCompany01 {
    public static void main(String[] args) {
        new Frame("企业管理");
       
    }
}
