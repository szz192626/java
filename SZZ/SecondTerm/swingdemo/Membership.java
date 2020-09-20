package swingdemo;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.HeadlessException;

import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Membership extends JFrame {
	private JLabel jl1 = null; 
	private JLabel jl2 = null;
	private JTextField jtf = null;
	private JComboBox jcb = null;

	public Membership() throws HeadlessException {
		super();
		// TODO Auto-generated constructor stub
	}

	public Membership(String title) throws HeadlessException {
		super(title);
		// TODO Auto-generated constructor stub
		Container jp = this.getContentPane();
		jp.setLayout(new BoxLayout(jp, BoxLayout.Y_AXIS));

		JLabel jl1 = new JLabel("��Ա�Ǽ�¼��");
        jp.add(jl1, BorderLayout.NORTH);
		JLabel jl2 = new JLabel("������λ");
		jp.add(jl2, BorderLayout.SOUTH);
		JTextField jtf = new JTextField("�Ϻ���ͨ���乫˾");
		jp.add(jtf, BorderLayout.SOUTH);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		
		JPanel jp1 = new JPanel();
		jp1.setLayout(new BoxLayout(jp1, BoxLayout.X_AXIS));
		jp1.add(new JLabel("����"));
		jp1.add(new JTextField("������"));

		jp1.add(new JLabel("��ϵ�绰"));
		jp1.add(new JTextField("0635-567890"));
		jp1.add(new JLabel("�ۿ�"));
		jp1.add(new JTextField("0.8"));

		JPanel jp2 = new JPanel();
		jp2.setLayout(new BoxLayout(jp2, BoxLayout.X_AXIS));
		jp2.add(new JLabel("�Ա�"));
		jp2.add(new JTextField("Ů"));
		jp2.add(new JLabel("����"));
		jp2.add(new JTextField("��ͨ��Ա"));
		jp2.add(new JLabel("�Ƿ��ʧ"));
		String[] string = { "��", "��" };
		jcb = new JComboBox(string);
		jp2.add(jcb);

		jp.add(jp1);
		jp.add(jp2);

		this.setSize(300, 300);

		this.setLocation(200, 300);

		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Membership("��Ա�Ǽ�¼�����");
	}

}
