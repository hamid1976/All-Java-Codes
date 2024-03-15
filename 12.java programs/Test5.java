import java.awt.*;
import java.util.Vector;
import javax.swing.event.*;
import java.awt.event.*;
import javax.swing.*;



class Test5 implements ListSelectionListener{
	
	Frame win=new Frame();
	JList list=new JList();
	
	Vector v=new Vector();
	
	Test5(){
		
		win.setLayout(null);
		list.setBounds(100,100,100,250);
		
		win.add(list);
		
		win.setBounds(0,0,500,500);
		
		//	Vector v=new Vector();
		
		v.addElement("red");
		v.addElement("green");
		v.addElement("blue");
		
		
		list.setListData(v);
		list.addListSelectionListener(this);
		
		win.show();
		
	}
	
	public void valueChanged(ListSelectionEvent e){
		
		String colorName=(String)list.getSelectedValue();
		
	        if(colorName.equals("red"))
			win.setBackground(Color.red);
		
			if(colorName.equals("green"))
				win.setBackground(Color.green);
			
			if(colorName.equals("blue")){
				win.setBackground(Color.blue);
			
			}
	}
	public static void main(String arg[]){
		
		Test5 as=new Test5();
		
	}
}
		
