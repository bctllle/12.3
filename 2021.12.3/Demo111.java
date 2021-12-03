package TanChiShe;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Demo111 extends JFrame{
public Demo111() {
	setBounds(100,200,200,200);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	Container c=getContentPane();
	c.setLayout(new FlowLayout());
	JPasswordField jp=new JPasswordField();
	jp.setColumns(20);
	jp.setFont(new Font("Arial",Font.BOLD,10));
	jp.setEchoChar('#');
	jp.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			char ch[]=jp.getPassword();
			String str=new String(ch);
			System.out.println("str");
			
		}
		
	});
	c.add(jp);
	setVisible(true);
}
  public static void main(String[] args) {
	new Demo111();
}
}
