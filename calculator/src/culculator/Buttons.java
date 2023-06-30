package culculator;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class Buttons implements ActionListener{
	JButton[] buttons;
	JButton buttoneq;
	JButton buttondec;
	JButton buttonadd;
	JButton buttonmi;
	JButton buttonac;
	JButton buttonmul;
	JButton buttondiv;
	JLabel label;

	Buttons(){
		creatButtons();
	}
	private void creatButtons() {
		buttons =new JButton[9];
		for(int i=0;i<9;i++) {
			buttons[i] = new JButton(String.valueOf(i));
			buttons[i].setForeground(Color.WHITE);
			buttons[i].setBounds(50, 310, 80, 50);
			buttons[i].setVisible(true);
			buttons[i].addActionListener(this);	
			buttons[i].setBackground(new Color(0x434343));
			buttons[i].setBorderPainted(false);
			buttons[i].setFocusable(false);
		}
		// TODO Auto-generated method stub

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
