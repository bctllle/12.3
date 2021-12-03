package TanChiShe;

import java.awt.Container;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class Demo10 extends JFrame {
public Demo10() {
	setBounds(100,100,200,200);//设置窗口坐标，大小
	setDefaultCloseOperation(EXIT_ON_CLOSE);//设置窗体关闭规则，关闭窗口时关闭程序
	
	Container c=getContentPane();
	c.setLayout(null);
	
	String items[] = {"a","b","c","d","e","f","g","0"};
	//JList<String>j11=new JList<>(items);
	//j11.setBounds(100, 100, 100, 100);
	//c.add(j11);
	//JScrollPane js =new JScrollPane(j11);
	
	DefaultListModel<String>model=new DefaultListModel<>();
	for(String tmp:items) {
		model.addElement(tmp);
	
	}
	JList<String> j111 =new JList<>(items);
	model.addElement("添加");
      j111.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);;
	//j11.setBounds(10,10,10,10);
      j111.setModel(model);
	JScrollPane js=new JScrollPane(j111);

	js.setBounds(90,10,100,100);
	//setVisible(true);
c.add(j111);
}
   public static void main(String[] args) {
	new Demo10();
}
}
