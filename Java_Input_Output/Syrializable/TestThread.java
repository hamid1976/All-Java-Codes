import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;


class TestThread extends Frame implements ActionListener,Serializable{
	

	MenuBar bar=new MenuBar();
	
	Menu fileMenu=new Menu("File");
	
	MenuItem saveItem=new MenuItem("Save");
	MenuItem openItem=new MenuItem("Open");
	MenuItem startItem=new MenuItem("Start");
	MenuItem stopItem=new MenuItem("Stop");
	MenuItem suspendItem=new MenuItem("Suspend");
	MenuItem resumeItem=new MenuItem("Resume");
	
	
	Label label1=new Label();
	Label label2=new Label();
	Label label3=new Label();
	Label label4=new Label();
	Label label5=new Label();
	Label label6=new Label();
	Label label7=new Label();
	Label label8=new Label();
	Label label9=new Label();
	Label label10=new Label();
	
	Label label11=new Label();
	Label label12=new Label();
	Label label13=new Label();
	Label label14=new Label();
	
	Button button1=new Button("UP");
	Button button2=new Button("Down");
	Button button3=new Button("Left");
	Button button4=new Button("Right");

	
	
	TestThread(){
			this.setTitle(" Game with threading ");
		
		this.setLayout(null);
		this.setBounds(500,150,600,600);
		this.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e){System.exit(0);}});
		
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		}
		);
		
		this.setMenuBar(bar);
		
		bar.add(fileMenu);
		
		fileMenu.add(saveItem);
		fileMenu.add(openItem);
		fileMenu.add(startItem);
		fileMenu.add(stopItem);
		fileMenu.add(suspendItem);
		fileMenu.add(resumeItem);
		
		
		label1.setBounds(00,80,400,30);
		label2.setBounds(450,80,145,30);
		label3.setBounds(300,150,295,30);
		label4.setBounds(50,150,200,30);
		label5.setBounds(00,220,150,30);
		label6.setBounds(190,220,300,30);
		label7.setBounds(50,290,220,30);
		label8.setBounds(310,290,285,30);
		label9.setBounds(00,360,150,30);
	
		label10.setBounds(190,360,300,30);
		
		label11.setBounds(100,40,30,30);
		
		label12.setBounds(10,115,30,30);
		label13.setBounds(10,185,30,30);
		label14.setBounds(10,255,30,30);
		
		
		button1.setBounds(100,400,50,50);
		button2.setBounds(100,500,50,50);
		button3.setBounds(50,450,50,50);
		button4.setBounds(150,450,50,50);
		
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		saveItem.addActionListener(this);
		openItem.addActionListener(this);
		startItem.addActionListener(this);
		stopItem.addActionListener(this);
		suspendItem.addActionListener(this);
		resumeItem.addActionListener(this);
		
		
		
		label1.setBackground(Color.black);
		label2.setBackground(Color.black);
		label3.setBackground(Color.black);
		label4.setBackground(Color.black);
		label5.setBackground(Color.black);
		label6.setBackground(Color.black);
		label7.setBackground(Color.black);
		label8.setBackground(Color.black);
		label9.setBackground(Color.black);
		label10.setBackground(Color.black);
		
		label11.setBackground(Color.red);
		
		label12.setBackground(Color.blue);
		label13.setBackground(Color.blue);
		label14.setBackground(Color.blue);
		
		
		
		
		
		
		this.add(label1);
		this.add(label2);
		this.add(label3);
		this.add(label4);
		this.add(label5);
		this.add(label6);
		this.add(label7);
		this.add(label8);
		this.add(label9);
		this.add(label10);
		this.add(label11);
		this.add(button1);
		this.add(button2);
		this.add(button3);
		this.add(button4);
		
		this.add(label12);
		this.add(label13);
		this.add(label14);
		
		this.show();
		
		A s=new A();
		s.start();
	}
	
	class A extends Thread{
		
		public void run(){
			
			do{
				
				for(int i=10; i<=570; i++){
					
					label12.setLocation(i,115);
					label13.setLocation(i,185);
					label14.setLocation(i,255);
					try{
						Thread.sleep(10);
					}
					catch(InterruptedException e){}
				}
				
				for(int i=570; i>=10; i--){
					
					label12.setLocation(i,115);
					label13.setLocation(i,185);
					label14.setLocation(i,255);
					try{
						Thread.sleep(10);
					}
					catch(InterruptedException q){}
				}
				
				
			}while(true);
			
			
		}
	}
	
		
	public void SaveFile(){
		
		FileDialog d=new FileDialog(this,"Save",FileDialog.SAVE);
		
		d.show();
		
		String filename=d.getFile();
		String folder=d.getDirectory();
		
		String path=folder+filename;
		
		try{
			
			FileOutputStream file=new FileOutputStream(path);
			ObjectOutputStream obj=new ObjectOutputStream(file);
			
			obj.writeObject(this);
			file.close();
		}catch(Exception e){e.printStackTrace();}
		
	}
	
	public void OpenFile(){
			A d=new A();
			d.start();
		
		FileDialog dd=new FileDialog(this," Open ",FileDialog.LOAD);
		
		dd.show();
		
		String filename2=dd.getFile();
		String folder2=dd.getDirectory();
		
		String path2=folder2+filename2;
		
		try{
			FileInputStream file2=new FileInputStream(path2);
			ObjectInputStream obj2=new ObjectInputStream(file2);
			
			TestThread frame=(TestThread)obj2.readObject();
			
			frame.show();
		
			file2.close();		
		}catch(Exception e){e.printStackTrace();}
		
		
	}
	
	
		
		
	public void actionPerformed(ActionEvent e){
		
		if(startItem==e.getSource()){
			
			A f=new A();
			
			f.start();
			
		}
		
		
		if(saveItem==e.getSource()){
			
			SaveFile();
			
		}
		
		if(openItem==e.getSource()){
			this.hide();
			
			OpenFile();
		}
		
	
	
		
		if(button1==e.getSource()){
			label11.setLocation(label11.getX(),label11.getY()-10);
		}
		if(button2==e.getSource()){
			label11.setLocation(label11.getX(),label11.getY()+10);
		}
		if(button3==e.getSource()){
			label11.setLocation(label11.getX()-10,label11.getY());
		}
		if(button4==e.getSource()){
			
			label11.setLocation(label11.getX()+10,label11.getY());
			
			
			

		}
		
		
		
	}
	

	
	
	
	
	
	
	
	public static void main(String arg[]){
		
		TestThread ob=new TestThread();
		

	
		
	
	
	
	
	}
}









