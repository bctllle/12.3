package TanChiShe;

import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Demo13 extends JFrame{
public Demo13() {
	setBounds(100,100,100,100);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	Container c=getContentPane();
	JTextArea area=new JTextArea();
	area.setText("�ı���");
	area.setRows(5);
	area.setColumns(20);
	area.append("�������");
	area.insert("����",2);//�ڵڶ����ַ���������
	area.setFont(new Font("����",Font.PLAIN,10));
	JScrollPane js=new JScrollPane(area);
	c.add(js);
	setVisible(true);
}
public static void main(String[] args) {
	new Demo13();
}
}
