package HomeAssignment_0128;

import java.awt.Font;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

@SuppressWarnings("serial")
public class FontDialog extends JDialog {
	private JList<String> jlFont;
	private JList<String> jlStyle;
	private JList<Integer> jlSize;
	
	private JLabel jlblPreview;
	private JTextField jtfFont, jtfStyle, jtfSize;
	
	private JButton jbtnConfirm, jbtnCancel;
	 
	
	public FontDialog(MemoPad mp) {
		super(mp, "�۲�", true);
		
		//��
		JLabel jlbl=new JLabel("�۲� (F):");
		JLabel jlblStyle=new JLabel("�۲� ��Ÿ��(Y):");
		JLabel jlblSize=new JLabel("ũ��(S):");
		jlblPreview = new JLabel("������AaBbYyZz");
		
		//TextField
		jtfFont=new JTextField();
		jtfStyle=new JTextField();
		jtfSize=new JTextField();
				
		//��ư
		jbtnConfirm=new JButton("Ȯ��");
		jbtnCancel=new JButton("���");
		
		//JList
		DefaultListModel<String> fontList = new DefaultListModel<>();
		DefaultListModel<String> styleList = new DefaultListModel<>();
		DefaultListModel<Integer> sizeList = new DefaultListModel<>();
				
		jlFont=new JList<String>(fontList);
		jlStyle=new JList<String>(styleList);
		jlSize=new JList<Integer>(sizeList);
				
		JScrollPane jsp=new JScrollPane(jlFont);
		JScrollPane jsp2=new JScrollPane(jlStyle);
		JScrollPane jsp3=new JScrollPane(jlSize);
		
		fontList.addElement("����");
		fontList.addElement("���� ���");
		fontList.addElement("�ü�ü");
		fontList.addElement("Serif");
		fontList.addElement("SansSerif");

		styleList.addElement("�Ϲ�");
		styleList.addElement("����");
		styleList.addElement("����Ӳ�");
		styleList.addElement("���� ����Ӳ�");
		
		for(int i=8; i<81 ; i++) {
			if(i>7&&i<11) {
			sizeList.addElement(i);
			}else {
			sizeList.addElement(i+1);
			i++;
			}//else
		}//end for
		
		jlFont.setSelectedIndex(0);
		jlStyle.setSelectedIndex(0);
		jlSize.setSelectedIndex(0);
		
		jlFont.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				
				if(e.getValueIsAdjusting()){
					jtfFont.setText(jlFont.getSelectedValue().toString());
					jlblPreview.setText(jlFont.getSelectedValue().toString());
					
					switch(jtfFont.getText()) {
					case "����": jlblPreview.setFont(new Font("����",Font.PLAIN,15)); break;
					case "���� ���" :jlblPreview.setFont(new Font("���� ���",Font.PLAIN,15));break; 
					case "�ü�ü" : jlblPreview.setFont(new Font("�ü�ü",Font.PLAIN,15));break; 
					case "Serif" : jlblPreview.setFont(new Font("Serif",Font.PLAIN,15));break; 
					case "SansSerif" :jlblPreview.setFont(new Font("SansSerif",Font.PLAIN,15));break; 
									
					}//end switch
				}
			}
		});
		
		jlStyle.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				
				
				if(e.getValueIsAdjusting()) {
					jtfStyle.setText(jlStyle.getSelectedValue().toString());	
					
					switch(jtfStyle.getText()) {
					case "�Ϲ�": jlblPreview.setFont(new Font(jtfFont.getText(),Font.PLAIN,15)); break;
					case "����" :jlblPreview.setFont(new Font(jtfFont.getText(),Font.BOLD,15));break; 
					case "����Ӳ�" : jlblPreview.setFont(new Font(jtfFont.getText(),Font.ITALIC,15));break; 
					case "���� ����Ӳ�" : jlblPreview.setFont(new Font(jtfFont.getText(),Font.ITALIC|Font.BOLD,15));break; 
					}//end switch
				}
			}
		});
		
		
		jlSize.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				
				
				if(e.getValueIsAdjusting()) {
					jtfSize.setText(jlSize.getSelectedValue().toString());
					int size=Integer.parseInt(jtfSize.getText());
					
					
					switch(jtfStyle.getText()) {
					case "�Ϲ�": jlblPreview.setFont(new Font(jtfFont.getText(),Font.PLAIN,size)); break; 
					case "����" :jlblPreview.setFont(new Font(jtfFont.getText(),Font.BOLD,size));break; 
					case "����Ӳ�" : jlblPreview.setFont(new Font(jtfFont.getText(),Font.ITALIC,size));break; 
					case "���� ����Ӳ�" : jlblPreview.setFont(new Font(jtfFont.getText(),Font.ITALIC|Font.BOLD,size));break; 
					}
				}
				
			}
		});
		
		
		
		FontDialogEvt fde=new FontDialogEvt(this);
		jbtnConfirm.addActionListener(fde);
		jbtnCancel.addActionListener(fde);
		
		
		//preview Border
		TitledBorder tb = new TitledBorder("����");
		jlblPreview.setBorder(tb);
		
		
		//Font ����
		jlbl.setFont(new Font("���� ���", Font.BOLD, 13)); //�۲� ��Ʈ
		jlblStyle.setFont(new Font("���� ���", Font.BOLD, 13)); //�۲� ��Ʈ
		jlblSize.setFont(new Font("���� ���", Font.BOLD, 13)); //�۲� ��Ʈ
		
		
		setLayout(null);
		
		
		//��ġ
		add(jlbl);
		add(jlblStyle);
		add(jlblSize);
		add(jlblPreview);
		
		add(jsp);
		add(jsp2);
		add(jsp3);
		
		
		add(jtfFont);
		add(jtfStyle);
		add(jtfSize);

		add(jbtnConfirm);
		add(jbtnCancel);
		
		//��ġ ����
		jlbl.setBounds(40,2,100,100); //�۲� ��ġ
		jlblStyle.setBounds(220,2,100,100); //�۲ý�Ÿ�� ��ġ
		jlblSize.setBounds(400,2,100,100); //�۲�ũ�� ��ġ
		jlblPreview.setBounds(220,200,260,100); //preview ��ġ
	
		jsp.setBounds(40,100,150,70); //�۲ø���Ʈ ��ġ
		jtfFont.setBounds(40,70,150,30); //�۲� �ؽ�Ʈ �ʵ� ��ġ
		
		jsp2.setBounds(220,100,150,70); //�۲ý�Ÿ�� ����Ʈ ��ġ
		jtfStyle.setBounds(220,70,150,30); //�۲ý�Ÿ�� �ؽ�Ʈ �ʵ� ��ġ
		
		jsp3.setBounds(400,100,80,70); //�۲�ũ�� ����Ʈ��ġ
		jtfSize.setBounds(400,70,80,30); //�۲�ũ�� �ؽ�Ʈ �ʵ� ��ġ
		
		jbtnConfirm.setBounds(300,400,80,25);
		jbtnCancel.setBounds(400,400,80,25);
		
		
		
		setBounds(mp.getX()+50,mp.getY()+50,550,500);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
	}//FontDialog


	public JList<String> getJlFont() {
		return jlFont;
	}


	public JList<String> getJlStyle() {
		return jlStyle;
	}


	public JList<Integer> getJlSize() {
		return jlSize;
	}


	public JLabel getJlblPreview() {
		return jlblPreview;
	}


	public JTextField getJtfFont() {
		return jtfFont;
	}


	public JTextField getJtfStyle() {
		return jtfStyle;
	}


	public JTextField getJtfSize() {
		return jtfSize;
	}


	public JButton getJbtnConfirm() {
		return jbtnConfirm;
	}


	public JButton getJbtnCancel() {
		return jbtnCancel;
	}
		
	
}//class
