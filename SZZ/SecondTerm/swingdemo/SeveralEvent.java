package swingdemo;

import java.awt.Container;
import java.awt.HeadlessException;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class SeveralEvent extends JFrame implements FocusListener, MouseListener {
	JTextField jtf = null;
	JTextArea jta = null;
	JButton jbgo = null;

	public SeveralEvent() throws HeadlessException {
		super();
	}

	public SeveralEvent(String title) throws HeadlessException {
		super(title);
		jtf = new JTextField(20);
		jtf.setText("鼠标坐标值：");
		jta = new JTextArea(20, 30);
		jbgo = new JButton("按钮");

		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		Container jp = this.getContentPane();

		jp.setLayout(null);

		jp.add(jtf);
		jtf.setBounds(80, 70, 180, 150);

		jp.add(jbgo);

		jbgo.setBounds(265, 80, 60, 30);

		jtf.addMouseListener(this);
		jtf.addFocusListener(this);

		this.setSize(500, 250);
		this.setLocation(250, 100);
		this.setVisible(true);

	}
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}
    @Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}
    @Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}
    @Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}
    @Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		jtf.setText("\n鼠标位置：(" + e.getX() + "," + e.getY() + ")");
	}
    @Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub
		jtf.setText("JTextField 失去焦点");
	}
    @Override
	public void focusGained(FocusEvent arg0) {
		// TODO Auto-generated method stub
	}
    public static void main(String[] args) {
		new SeveralEvent("鼠标移动与点击");
	}

	

}
