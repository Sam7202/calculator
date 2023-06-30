package culculator;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public  class Calculator extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton[] buttons;
	JButton buttoneq;
	JButton buttondec;
	JButton buttonadd;
	JButton buttonmi;
	JButton buttonac;
	JButton buttonmul;
	JButton buttondiv;
	JButton buttonsign;
	JButton buttonper;
	JButton buttonDelete;


	String num ="0";
	JLabel label;
	JPanel paneltop;
	JPanel panelbottom;
	double num1;
	double num2;
	String operator;
	double tempnum1;
	double subnum2;
	String tempoperator="";
	Font font = new Font("MV Boli",Font.CENTER_BASELINE, 20);
	Calculator() {
		creatButtons();

		buttoneq = new JButton("=");
		buttoneq.setBounds(50, 310, 100, 50);
		buttoneq.setVisible(true);
		buttoneq.addActionListener(this);
		buttoneq.setFont(font);
		setButtonColor(buttoneq);

		buttonadd = new JButton("+");
		buttonadd.setBounds(50, 310, 80, 50);
		buttonadd.setVisible(true);
		buttonadd.setFont(font);
		buttonadd.addActionListener(this);
		setButtonColor(buttonadd);

		buttonmi = new JButton("-");
		buttonmi.setBounds(50, 310, 80, 50);
		buttonmi.setVisible(true);
		buttonmi.addActionListener(this);
		buttonmi.setFont(font);
		setButtonColor(buttonmi);

		buttondec = new JButton(".");
		buttondec.setVisible(true);
		buttondec.addActionListener(this);
		buttondec.setFont(font);
		buttondec.setBackground(new Color(0x656765));
		buttondec.setForeground(Color.WHITE);
		buttondec.setFocusable(false);
		buttondec.setBorderPainted(false);

		buttonmul = new JButton("×");
		buttonmul.setVisible(true);
		buttonmul.addActionListener(this);
		buttonmul.setFont(font);
		setButtonColor(buttonmul);

		buttondiv = new JButton("÷");
		buttondiv.setVisible(true);
		buttondiv.addActionListener(this);
		buttondiv.setFont(font);
		setButtonColor(buttondiv);

		buttonac = new JButton("AC");
		buttonac.setVisible(true);
		buttonac.addActionListener(this);
		buttonac.setFont(font);
		buttonac.setForeground(Color.WHITE);
		buttonac.setBackground(new Color(0x656765));
		buttonac.setFocusable(false);
		buttonac.setBorderPainted(false);
		
		buttonsign = new JButton("+/-");
		buttonsign.addActionListener(this);
		buttonsign.setFont(font);
		buttonsign.setForeground(Color.WHITE);
		buttonsign.setBackground(new Color(0x656765));
		buttonsign.setFocusable(false);
		buttonsign.setBorderPainted(false);
		
		buttonDelete = new JButton("DEL");
		buttonDelete.addActionListener(this);
		buttonDelete.setFont(font);
		buttonDelete.setBackground(new Color(0x656765));
		buttonDelete.setForeground(Color.WHITE);
		buttonDelete.setFocusable(false);
		buttonDelete.setBorderPainted(false);

		buttonper = new JButton("%");
		buttonper.addActionListener(this);
		buttonper.setFont(font);
		buttonper.setBackground(new Color(0x656765));
		buttonper.setForeground(Color.WHITE);
		buttonper.setFocusable(false);
		buttonper.setBorderPainted(false);
		
		label = new JLabel("0",SwingConstants.RIGHT);
		label.setBounds(0, 30, 380, 250);
		label.setFont(new Font("MV Boli",Font.CENTER_BASELINE, 40));
		label.setForeground(Color.white);

		paneltop = new JPanel();
		paneltop.setBounds(0, 0, 400, 200);
		paneltop.setBackground(Color.BLACK);
		paneltop.setLayout(null);
		paneltop.add(label);
		panelbottom = new JPanel();
		panelbottom.setBounds(0, 200, 400, 350);
		panelbottom.setLayout(new GridLayout(5,4,5,5));
		panelbottom.setBackground(Color.black);
		addButtons();

		this.add(paneltop);
		this.add(panelbottom);
		this.setSize(410, 585);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setResizable(false);
		this.setVisible(true);
	}

	private void addButtons() {
		panelbottom.add(buttonac);
		panelbottom.add(buttonsign);
		panelbottom.add(buttonper);
		panelbottom.add(buttondiv);
		for(int i=7;i<10;i++) {
			panelbottom.add(buttons[i]);
		}
		panelbottom.add(buttonmul);
		for(int i=4;i<7;i++) {
			panelbottom.add(buttons[i]);
		}
		panelbottom.add(buttonmi);
		for(int i=1;i<4;i++) {
			panelbottom.add(buttons[i]);
		}
		panelbottom.add(buttonadd);
		panelbottom.add(buttonDelete);
		panelbottom.add(buttons[0]);
		panelbottom.add(buttondec);
		panelbottom.add(buttoneq);

	}
	private void setButtonColor(JButton button) {
		button.setBackground(new Color(0xFFB11B));
		button.setBorderPainted(false);
		button.setFocusable(false);
	}

	private void creatButtons() {
		buttons =new JButton[10];
		for(int i=0;i<10;i++) {
			buttons[i] = new JButton(String.valueOf(i));
			buttons[i].setForeground(Color.WHITE);
			buttons[i].setBounds(50, 310, 80, 50);
			buttons[i].setVisible(true);
			buttons[i].addActionListener(this);	
			buttons[i].setBackground(new Color(0x434343));
			buttons[i].setBorderPainted(false);
			buttons[i].setFocusable(false);
			buttons[i].setFont(font);
		}
		// TODO Auto-generated method stub

	}

	double result=0;
	double operation(double num1,double num2, String operator) {
		switch(operator) {
		case"+":
			result=num1+num2;
			break;
		case"-":
			result=num1-num2;
			break;
		case"=":
			break;
		case"x":
			result=num1*num2;
			break;
		case"/":
			result=num1/num2;
			break;
		}
		return result;
	}
	@Override
	public void actionPerformed(ActionEvent e) {

		for(int i=0;i<10;i++) {
			if(e.getSource()==buttons[i]) {
				num=num+String.valueOf(i);
				label.setText(num);
			}
		}
		//"="
		if(e.getSource()==buttoneq) {
			//get what num is now
			num2=Double.parseDouble(num);
			if(operator == null) {
				operator = "=";
			}
			//add operation();
			num1 = operation(num1,num2,operator);
			if(tempoperator!="") {
				num1=operation(tempnum1,num1,tempoperator);
				tempoperator="";
				System.out.println("yes");
			}
			//and switch(operator)
			operator="=";
			System.out.println(num1);
			num="0";
			label.setText(format(num1));
		}
		//"+"
		else if(e.getSource()==buttonadd) {
			if(num!="") {
				if(num1==0) {
					num1=Double.parseDouble(num);
				}
				else {
					num2 = Double.parseDouble(num);
					num1=operation(num1, num2, operator);
					if(tempoperator!="") {
						num1=operation(tempnum1,num1,tempoperator);
						tempoperator="";
						System.out.println("yes");
					}
					label.setText(format(num1));
				}
				num="";
				System.out.println(num1);
			}
			operator = "+";
		}
		//"-"
		else if(e.getSource()==buttonmi) {
			if(num!="" ) {
				if(num1==0) {
					num1=Double.parseDouble(num);
				}
				else {
					num2 = Double.parseDouble(num);
					num1=operation(num1, num2,operator);
					label.setText(format(num1));
				}
				num="";
				System.out.println(num1);
			}
			operator = "-";
		}
		//"."
		else if(e.getSource()==buttondec && num.indexOf('.')==-1) {
			num=num+".";
			label.setText(num);
		}
		//"AC"
		else if(e.getSource()==buttonac) {
			num="";
			num1=0;
			num2=0;
			label.setText("0");
		}
		//"x"
		else if(e.getSource()==buttonmul) {
			if (num!="" ){//
				if(operator=="+" || operator =="-") {
					tempnum1=num1;
					num1=Double.parseDouble(num);
					tempoperator=operator;
				}
				else {
					if(num1==0) {
						num1=Double.parseDouble(num);
					}
					else {
						num2 = Double.parseDouble(num);
						num1=operation(num1, num2,operator);
					}
				}
				num="";
				operator = "x";
				System.out.println(num1);
			}
		}
		//"/"
		else if(e.getSource()==buttondiv) {
			if (num!="" ){
				if(operator=="+" || operator =="-") {
					tempnum1=num1;
					num1=Double.parseDouble(num);
					tempoperator=operator;
				}
				else {
					if(num1==0) {
						num1=Double.parseDouble(num);
					}
					else {
						num2 = Double.parseDouble(num);
						num1=operation(num1, num2,operator);
						label.setText(format(num1));
					}
				}
				num="";
				operator = "/";
				System.out.println(num1);
			}
		}
		else if(e.getSource()==buttonsign) {
			num=String.valueOf(-Double.parseDouble(num));
			label.setText(num);
		}
		else if (e.getSource()==buttonDelete) {
			num=num.substring(0,num.length()-1);
			label.setText(num);
		}
		else if(e.getSource()==buttonper) {
			num=String.valueOf(0.01*Double.parseDouble(num));
			label.setText(num);
		}
	}

	private String format(double num1) {
		String roundOff = String.format("%.6f", num1);
		return roundOff;
	}
}


