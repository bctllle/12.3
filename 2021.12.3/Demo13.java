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
	area.setText("文本域");
	area.setRows(5);
	area.setColumns(20);
	area.append("添加内容");
	area.insert("插入",2);//在第二个字符插入内容
	area.setFont(new Font("楷体",Font.PLAIN,10));
	JScrollPane js=new JScrollPane(area);
	c.add(js);
	setVisible(true);
}
public static void main(String[] args) {
	new Demo13();
}
}
