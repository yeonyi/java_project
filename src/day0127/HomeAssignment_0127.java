package day0127;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class HomeAssignment_0127 extends JFrame implements ActionListener {
	String[] subject = {"Java", "Oracle", "JDBC", "HTML"};
	JComboBox jcb;
	JTextField jtf;
	
	public HomeAssignment_0127() {
		super("과목 선택");
		
		jcb = new JComboBox(subject);
		setLayout(null);
		add(jcb);
		jcb.setBounds(30, 30, 100, 40);
		
		JLabel jl = new JLabel("선택한 과목");
		add(jl);
		jl.setBounds(170, 30, 100, 40);
		
		jtf = new JTextField();
		add(jtf);
		jtf.setBounds(250, 30, 100, 40);
		
		jcb.addActionListener(this);
		
		
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//HomeAssignment_1027
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		
		String selecSub = jcb.getSelectedItem().toString();
		jtf.setText(selecSub);
		
	}//actionPerformed

	public static void main(String[] args) {
		new HomeAssignment_0127();
	}//main

}//class
