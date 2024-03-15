import java.awt.*;
import java.awt.event.*; 
import java.net.*;
import java.applet.*; 
import javax.swing.*;
import java.io.*;
class ButtonEro_Moved2 extends Frame implements KeyListener,ActionListener,Serializable{
	
	MenuBar bar=new MenuBar();
	
	Menu fileMenu=new Menu("File");
	
	MenuItem saveItem=new MenuItem("Save");
	MenuItem openItem=new MenuItem("Open");
	MenuItem startItem=new MenuItem("Start");
	MenuItem stopItem=new MenuItem("Stop");
	MenuItem suspendItem=new MenuItem("Suspend");
	MenuItem resumeItem=new MenuItem("Resume");
	
		Button but=new Button();
		Label but2=new Label();
		Label but3=new Label();
		Label but4=new Label();
		Label but5=new Label();
		Label but6=new Label();
		Label but7=new Label();
		Label but8=new Label();
		Label but9=new Label();
		Label but10=new Label();
		Label but11=new Label();  
		  
		Button b=new Button();
		Button b2=new Button();
		Button b3=new Button();
		Button b4=new Button();  
  
		ButtonEro_Moved2(){
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
		
			but.setBackground(Color.red);
	
			this.setBounds(120, 80, 600,500 );
			b.setBounds(50, 110, 60, 30);
			b2.setBounds(50, 190, 60, 30);
			b3.setBounds(50, 260, 60, 30);
			b4.setBounds(50,340, 60, 30);
			
	
			but.setBounds(10, 40, 60, 30);
			but2.setBounds(7, 75, 300, 30);
			but3.setBounds(393, 75, 200, 30);
			but4.setBounds(10, 225, 180, 30);	
			but5.setBounds(340, 150, 255, 30);	
			but6.setBounds(80, 150, 180, 30);	
			but7.setBounds(270, 225, 240, 30);	
			but8.setBounds(80, 300, 180, 30);	
			but9.setBounds(335, 300, 255, 30);	
			but10.setBounds(10, 380, 180, 30);	
			but11.setBounds(265, 380, 250, 30);
	
			but.addKeyListener(this);
 
			this.add(but);
			this.add(but2);
			this.add(but3);
			this.add(but4);
			this.add(but5);
			this.add(but6);
			this.add(but7);
			this.add(but8);
			this.add(but9);
			this.add(but10);
			this.add(but11);

			this.add(b);
			this.add(b2);
			this.add(b3);
			this.add(b4);
			
			saveItem.addActionListener(this);
		    openItem.addActionListener(this);
		    startItem.addActionListener(this);
		    stopItem.addActionListener(this);
		    suspendItem.addActionListener(this);
		    resumeItem.addActionListener(this);
			this.setLayout (null); 
			this.show();

			this.setBackground(Color.cyan);
			b.setBackground(Color.blue);
			b2.setBackground(Color.blue);
			b3.setBackground(Color.blue);
			b4.setBackground(Color.blue);
			
			but2.setBackground(Color.blue);
			but3.setBackground(Color.red);	
			but4.setBackground(Color.blue);
			but5.setBackground(Color.orange);
			but6.setBackground(Color.black);
			but7.setBackground(Color.red);
			but8.setBackground(Color.black);
			but9.setBackground(Color.orange);
			but10.setBackground(Color.blue);
			but11.setBackground(Color.red); 
  		public void star(){
			MyThrwad t=new MyThrwad();
				//t.resume();
			Thrwad t1=new Thrwad();
				//t1.resume();
			Thrwad3 t2=new Thrwad3();
				//t2.resume();
			Thrwad4 t3=new Thrwad4();
				//t3.resume();
		}
		} 
		int z=0;
		int x=10;
		int y=40;
		void RightKey(){
				if((y==40||y==110||y==190||y==260||y==340||y>=420)&&(x>=10&&x<=520)){
				but.setLocation(x+=10,y);
				this.setTitle("X="+x+" Y="+y);
			}
			
			
		}
	
		void LaftKey(){
			//int x=but.getX();
			//int y=but.getY();
			if((y==40||y==110||y==190||y==260||y==340||y>=420)&&(x>10 && x<=530)){
				but.setLocation(x-=10,y);
				this.setTitle("X="+x+" Y="+y);   
			}
		}
	   
		void UpKey(){
			//int x=but.getX();
			//int y=but.getY(); 
			if((x==320&&(y>40&&y<=110))||((x==270||x==10)&&(y>110&&y<=190))||((x==200||x==530)&&(y>190&&y<=260))||
			((x==10||x==270)&&(y>260&&y<=340))||(x==200||x==530)&&(y>340&&y<=420)){
				but.setLocation(x,y-=10);
				this.setTitle("X="+x+" Y="+y);	
			}
			
		}

		void downKey(){
			//int x=but.getX();
			//int y=but.getY();
		 if((x==320&&(y>=30&&y<=100))||((x==270||x==10)&&(y>=110&&y<=180))||((x==200||x==530)&&(y>=190&&y<=250))||
			((x==10||x==270)&&(y>=260&&y<=330))||(x==200||x==530)&&(y>=340&&y<=410)){
				but.setLocation(x,y+=10);
				this.setTitle("X="+x+" Y="+y);
			}
			if(y==420){
				JOptionPane.showMessageDialog(this,"You Win The Game");
				restart();
			}
			
		}
		void dead(){
			JOptionPane.showMessageDialog(this,"You Are Died"); 
			restart();
		}   
		void restart(){
			int i=JOptionPane.showConfirmDialog(this,"Do you Run again","King Shoban Ali",JOptionPane.YES_NO_OPTION);
			if(i==0){
				x=10;y=40;
				but.setLocation(x,y);
			}
			else
				System.exit(0);
		}
   
	public void keyPressed (KeyEvent e) {    
		if(e.getKeyCode()==39){RightKey();}
		if(e.getKeyCode()==37){LaftKey();}
		if(e.getKeyCode()==38){UpKey(); }
		if(e.getKeyCode()==40){downKey();}
	}
	public void keyReleased (KeyEvent e) {}    
	public void keyTyped (KeyEvent e) {}
    public void actionPerformed(ActionEvent e){
		
		   
		    // MyThrwad t =new MyThrwad();
	        // Thrwad   t1=new Thrwad();
			// Thrwad3  t2=new Thrwad3();
			// Thrwad4  t3=new Thrwad4();
		  
		 if(startItem==e.getSource()){
			 MyThrwad t=new MyThrwad();
				t.start();
			Thrwad t1=new Thrwad();
				t1.start();
			Thrwad3 t2=new Thrwad3();
				t2.start();
			Thrwad4 t3=new Thrwad4();
				t3.start();
					 
		 }
		 if(suspendItem==e.getSource()){
		    MyThrwad t=new MyThrwad();
				t.suspend();
			Thrwad t1=new Thrwad();
				t1.suspend();
			Thrwad3 t2=new Thrwad3();
				t2.suspend();
			Thrwad4 t3=new Thrwad4();
				t3.suspend();
		 }
		 if(resumeItem==e.getSource()){
			t2.sesume	
		 }
		 
		 // if(stopItem==e.getSource()){
			 // t3.stop();	
		 // }
		if(saveItem==e.getSource()){
			SaveFile();	
		}
		if(openItem==e.getSource()){
			this.hide();	
			OpenFile();
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
		
		FileDialog dd=new FileDialog(this," Open ",FileDialog.LOAD);
		
		dd.show();
		
		String filename2=dd.getFile();
		String folder2=dd.getDirectory();
		
		String path2=folder2+filename2;
		
		try{
			FileInputStream file2=new FileInputStream(path2);
			ObjectInputStream obj2=new ObjectInputStream(file2);
			
			ButtonEro_Moved2 frame=(ButtonEro_Moved2)obj2.readObject();
			
			frame.show();
		
			file2.close();		
		}catch(Exception e){e.printStackTrace();}
		
		
	}
    
		class MyThrwad extends Thread{
			public void run(){
				do{
					try{
						for(int i=5; i<=530; i+=5){
							//int a=but.getX();
							Thread.sleep(20);
							b.setLocation(i,112);
							if(i+60==x&&(y>=90&&y<=140))
								dead();
						}
						for(int i=530; i>=5; i-=5){
							Thread.sleep(20);
							b.setLocation(i,112);
							if(i-60==x&&(y>=90&&y<=140))
								dead();
						}
					}catch(Exception s1){}
			     }while(true);
			}
			
		}
		class Thrwad extends Thread{
		public void run(){	
	            do{
					try{
						for(int i=5; i<=530; i+=5){
							Thread.sleep(25);
							b2.setLocation(i,190);
							if(i+60==x&&(y>=160&&y<=210))
								dead();
						}
						for(int i=530; i>=5; i-=5){
							Thread.sleep(25);
							b2.setLocation(i,190);
							if(i-60==x&&(y>=160&&y<=210))
								dead();
						}
					    }catch(Exception s1){}
			      }while(true);
		}
	}
	class Thrwad3 extends Thread{
		public void run(){	
		      do{
				   try{
						for(int i=5; i<=530; i+=5){
							Thread.sleep(22);
							b3.setLocation(i,265);
							if(i+60==x&&(y>=240&&y<=290))
								dead();
						}
						for(int i=530; i>=5; i-=5){
							Thread.sleep(22);
							b3.setLocation(i,265);
							if(i-60==x&&(y>=240&&y<=290))
								dead();
						}
					}catch(Exception s1){}		
				}while(true);
		}
	}
	class Thrwad4  extends Thread{
			public void run(){
				do{
					try{
						for(int i=5; i<=530; i+=5){
							Thread.sleep(18);
							b4.setLocation(i,345);
							if(i+60==x&&(y>=320&&y<=370))
								dead();
						}
						for(int i=530; i>=5; i-=5){
							Thread.sleep(18);
							b4.setLocation(i,345);
							if(i-60==x&&(y>=320&&y<=370))
								dead();
						}
						}catch(Exception s1){}
		             }while(true);
			}
		}
	public static void main(String arg[]){
		ButtonEro_Moved2 ob=new ButtonEro_Moved2();
	}   
}