package ui;

import java.awt.FlowLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class SimpleForm extends JFrame implements ActionListener{
	
	JButton button;
	JTextField text,text1;
	
	public SimpleForm()
	{
		text=new JTextField(20);
		text1= new JTextField(20);
		button = new JButton("Register");
		
		add(text);
		add(text1);
		add(button);
		
		button.addActionListener(this);
		
		setSize(400,300);
		setVisible(true);
		setLayout(new FlowLayout());
	}
	public static void main(String args[])
	{
		new SimpleForm();
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null,"Welcome to Swing");
		
	}

}
