package frametest;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import lib.Calculation_lib;

public class Frame_view extends Frame implements ActionListener,WindowListener{

	private TextField text1 = new TextField("",10);
	private TextField text2 = new TextField("",10);
	private Button button1 = new Button("‘«‚µŽZ");
	private TextField text3 = new TextField("",10);
	private Button button2 = new Button("ˆø‚«ŽZ");
	private TextField text4 = new TextField("",10);
	private Button button3 = new Button("Š|‚¯ŽZ");
	private TextField text5 = new TextField("",10);
	private Button button4 = new Button("Š„‚èŽZ");
	private TextField text6 = new TextField("",10);
	
	public  Frame_view() {
		addWindowListener(this);
		setTitle("FrameTest");
		setLayout(new FlowLayout(FlowLayout.CENTER));
		add(text1);
		add(text2);
		add(button1);
		button1.addActionListener(this);
		add(text3);
		add(button2);
		button2.addActionListener(this);
		add(text4);
		add(button3);
		button3.addActionListener(this);
		add(text5);
		add(button4);
		button4.addActionListener(this);
		add(text6);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int val1 = Integer.parseInt(text1.getText());
		int val2 = Integer.parseInt(text2.getText());
		//text3.setText(String.valueOf(val1 + val2));
		Calculation_lib clib = new Calculation_lib(val1,val2);
		if(e.getSource() == button1) {
			text3.setText(String.valueOf(clib.getPlus()));
		}else if(e.getSource() == button2) {
			text4.setText(String.valueOf(clib.getMinus()));
		}else if(e.getSource() == button3) {
			text5.setText(String.valueOf(clib.getTime()));
		}else if(e.getSource() == button4) {
			text6.setText(String.valueOf(clib.getDivide()));
		}
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
