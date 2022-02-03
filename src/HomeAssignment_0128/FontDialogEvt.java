package HomeAssignment_0128;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FontDialogEvt implements ActionListener {
	
private FontDialog fd;
	
	public FontDialogEvt(FontDialog fd) {
		this.fd=fd;
	}//FontDialogEvt

	@Override
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource()==fd.getJbtnConfirm()) {
			
			fd.dispose();
			
			MemoPad mp = new MemoPad();
			
			String fontName= fd.getJtfFont().getText();
			int style = 0;
			
			switch(fd.getJtfStyle().getText()) {
			case "일반" : style= Font.PLAIN; break;
			case "굵게" : style= Font.BOLD;break;
			case "기울임꼴" : style= Font.ITALIC;break;
			case "굵은 기울임꼴" : style= Font.ITALIC|Font.BOLD;break;
			}
			int size=Integer.parseInt(fd.getJtfSize().getText());
			
			mp.getWriteField().setFont(new Font(fontName,style,size));
		}
		
		if(ae.getSource()==fd.getJbtnCancel()) {
			fd.dispose();
		}

	}//actionPerformed

}//class
