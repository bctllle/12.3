package TanChiShe;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Demo12 extends JFrame{
public Demo12() {
	setBounds(100,100,100,100);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	Container c=getContentPane();
	c.setLayout(new FlowLayout());
	JTextField jt=new JTextField("aaa");
	
	jt.setColumns(20);//�����ı��򳤶�
	jt.setText("s");
	jt.setFont(new Font("����",Font.PLAIN,20));
	c.add(jt);
	JButton btn=new JButton("ȷ��");
	btn.addActionListener(new ActionListener(){
		
		

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("�ı����е�����Ϊ:"+jt.getText());
			   jt.setText("");
			   jt.requestFocus();

		}

		
	});
	c.add(btn);
        setVisible(true);
}
public static void main(String[] args) {
	new Demo12();
}
}