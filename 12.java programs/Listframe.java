import java.awt.*;
import java.util.Vector;
import javax.swing.event.*;
import java.awt.event.*;
import javax.swing.*;

class Listframe implements ListSelectionListener{
	
	
	Frame win=new Frame();
	List list=new List();
    Vector v=new Vector();
	
	Listframe(){
		
		win.setLayout(null);
		list.setBounds(100,100,100,250);
		win.add(list);
		win.setBounds(0,0,500,300);
		
		win.show();
		
	//	Vector v=new Vector();
		
		v.addElement("red");
		v.addElement("green");
		v.addElement("blue");
		
		list.setListData(v);
		list.addListSelectionListener(this);
		
	}
	
	public void valueChanged(ListSelectionEvent e){
		
		String colorname=(String)list.getSelected Value();
		
		if(colorname.equals("red"))
			win.setBackground(Color.red);
		
		if(colorname.equals("green"))
			win.setBackground(Color.green);
		
		if(colorname.equals("blue"))
			win.setBackground(Color.blue);
	}
	
	public static void main(String argp[]){
		
		Listframe as=new Listframe();
		
	}
}
		