import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.applet.*;
import java.net.*;
import java.io.*;
public class extends Frame implements ActionListener, Serializable{
	public static void main(String[] args) {
		Syrealizationpuzzlegame t = new Syrealizationpuzzlegame();
	}
	MenuBar bar = new MenuBar();
	Menu file = new Menu("File");
	Menu help = new Menu("Help");
	MenuItem ope = new MenuItem("Open");
	MenuItem s = new MenuItem("Save");
	MenuItem et = new MenuItem("Exit");
	MenuItem ab = new MenuItem("About");

	Button button1=new Button();
	Button button2=new Button();
	Button button3=new Button();
	Button button4=new Button();
	Button button5=new Button();
	Button button6=new Button();
	Button button7=new Button();
	Button button8=new Button();
	Button button9=new Button();
	Button button10=new Button();
	Button button11=new Button();
	Button button12=new Button();
	Button button13=new Button();
	Button button14=new Button();
	Button button15=new Button();
	Button button16=new Button();
	Button Sequence=new Button("Sequence");
	
	Syrealizationpuzzlegame(){
		this.setMenuBar(bar);
		bar.add(file);
		bar.add(help);
		file.add(ope);
		file.add(s);
		file.add(et);
		help.add(ab);
				  //w(x) l(y)
		this.setLayout(null);
		this.setBounds(500,50,440,500);
		
		button1.setBounds(20,40,100,100);
		button2.setBounds(120,40,100,100);
		button3.setBounds(220,40,100,100);
		button4.setBounds(320,40,100,100);
		
		button5.setBounds(20,140,100,100);
		button6.setBounds(120,140,100,100);
		button7.setBounds(220,140,100,100);
		button8.setBounds(320,140,100,100);
		
		button9.setBounds(20,240,100,100);
		button10.setBounds(120,240,100,100);
		button11.setBounds(220,240,100,100);
		button12.setBounds(320,240,100,100);
		
		button13.setBounds(20,340,100,100);
		button14.setBounds(120,340,100,100);
		button15.setBounds(220,340,100,100);
		button16.setBounds(320,340,100,100);
		
		Sequence.setBounds(170,450,100,30);
		
		this.add(button1);
		this.add(button2);
		this.add(button3);
		this.add(button4);
		this.add(button5);
		this.add(button6);
	    this.add(button7);
		this.add(button8);
		this.add(button9);
		this.add(button10);
		this.add(button11);
		this.add(button12);
		this.add(button13);
		this.add(button14);
		this.add(button15);
		this.add(button16);
		this.add(Sequence);
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);
		button8.addActionListener(this);
		button9.addActionListener(this);
		button10.addActionListener(this);
		button11.addActionListener(this);
		button12.addActionListener(this);
		button13.addActionListener(this);
		button14.addActionListener(this);
		button15.addActionListener(this);
		button16.addActionListener(this);
		Sequence.addActionListener(this);
		
		ope.addActionListener(this);
		s.addActionListener(this);
		et.addActionListener(this);
		ab.addActionListener(this);
		
		button1.setLabel("6");
		button2.setLabel(" ");
		button3.setLabel("5");
		button4.setLabel("7");
		button5.setLabel("4");
		button6.setLabel("15");
		button7.setLabel("8");
		button8.setLabel("3");
		button9.setLabel("14");
		button10.setLabel("9");
		button11.setLabel("2");
		button12.setLabel("10");
		button13.setLabel("11");
		button14.setLabel("1");
		button15.setLabel("12");
		button16.setLabel("13");
		
		
		
		
		this.show();
	}
	public void openFile(){
		
		FileDialog f = new FileDialog(this,"Open",FileDialog.LOAD);
		f.show();
		String filename=f.getFile();
		String dir=f.getDirectory();
		String path=dir+filename;
		try{
			FileInputStream fin = new FileInputStream(path);
			ObjectInputStream obj = new ObjectInputStream(fin);
			

			Syrealizationpuzzlegame tg = (Syrealizationpuzzlegame)obj.readObject();
			
			tg.show();
			System.out.println("Run Oject");
			this.hide();

		}catch (ClassNotFoundException e) {
            System.out.println("Class not found\n");
            e.printStackTrace();
        } catch(FileNotFoundException e) {
            System.out.println("File not found\n");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
			// obj.close();
			// fin.close();
        } 
	}
	public void saveFile(){
		FileDialog d = new FileDialog(this,"Save",FileDialog.SAVE);
		d.show();
		String filename=d.getFile();
		String dir=d.getDirectory();
		String path=dir+filename;
		try{
			FileOutputStream fout = new FileOutputStream(path);
			ObjectOutputStream obj = new ObjectOutputStream(fout);
			this.hide();

			obj.writeObject(this);
			

			fout.close();
			System.out.println("Saved Object");
			this.show();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	boolean b;
	public void actionPerformed(ActionEvent e){
		if (s==e.getSource()) {
			saveFile();
		}
		if (ope==e.getSource()) {
			System.out.println("open");
			openFile();
		}
		if (et==e.getSource()) {
			System.exit(0);
		}
		if (ab==e.getSource()) {
			JOptionPane.showMessageDialog(null,"2 Player Tic Tac Toe Game");
		}

	//	---------------------------------------------
		if(button1==e.getSource()){// start Button 1
			
			if(button2.getLabel().equals(" ")){
				button2.setLabel(button1.getLabel());
				button1.setLabel(" ");
				
			}else{
				if(button5.getLabel().equals(" ")){
					button5.setLabel(button1.getLabel());
					button1.setLabel(" ");
				}	
			}
		}// End Button 1
		
		if(button2==e.getSource()){//start Button 2
			
			if(button1.getLabel().equals(" ")){
				button1.setLabel(button2.getLabel());
				button2.setLabel(" ");
			}else{
				if(button3.getLabel().equals(" ")){
					button3.setLabel(button2.getLabel());
					button2.setLabel(" ");
				}else{
					
					if(button6.getLabel().equals(" ")){
						button6.setLabel(button2.getLabel());
						button2.setLabel(" ");
					}
				}	
			}
		}//End Button 2
		
		if(button3==e.getSource()){//start Button 3
			
			if(button2.getLabel().equals(" ")){
				button2.setLabel(button3.getLabel());
				button3.setLabel(" ");
			}else{
				if(button4.getLabel().equals(" ")){
					button4.setLabel(button3.getLabel());
					button3.setLabel(" ");
				}else{
					
					if(button7.getLabel().equals(" ")){
						button7.setLabel(button3.getLabel());
						button3.setLabel(" ");
					}
				}	
			}
		}//End Button 3
		
		if(button4==e.getSource()){//start Button 4
			
			if(button3.getLabel().equals(" ")){
				button3.setLabel(button4.getLabel());
				button4.setLabel(" ");
			}else{
				if(button8.getLabel().equals(" ")){
					button8.setLabel(button4.getLabel());
					button4.setLabel(" ");
				}
			}
		}//End Button 4
		
		if(button5==e.getSource()){//start Button 5
			
			if(button1.getLabel().equals(" ")){
				button1.setLabel(button5.getLabel());
				button5.setLabel(" ");
			}else{
				if(button9.getLabel().equals(" ")){
					button9.setLabel(button5.getLabel());
					button5.setLabel(" ");
				}else{
					
					if(button6.getLabel().equals(" ")){
						button6.setLabel(button5.getLabel());
						button5.setLabel(" ");
					}
				}	
			}
		}//End Button 5
		
		if(button6==e.getSource()){//start Button 6
			
			if(button5.getLabel().equals(" ")){
				button5.setLabel(button6.getLabel());
				button6.setLabel(" ");
			}else{
				if(button7.getLabel().equals(" ")){
					button7.setLabel(button6.getLabel());
					button6.setLabel(" ");
				}else{
					if(button2.getLabel().equals(" ")){
						button2.setLabel(button6.getLabel());
						button6.setLabel(" ");
					}else{
						if(button10.getLabel().equals(" ")){
							button10.setLabel(button6.getLabel());
							button6.setLabel(" ");
						}
					
					}
				}	
			}
		}//End Button 6
		
		if(button7==e.getSource()){//start Button 7
			
			if(button6.getLabel().equals(" ")){
				button6.setLabel(button7.getLabel());
				button7.setLabel(" ");
			}else{
				if(button8.getLabel().equals(" ")){
					button8.setLabel(button7.getLabel());
					button7.setLabel(" ");
				}else{
					
					if(button3.getLabel().equals(" ")){
						button3.setLabel(button7.getLabel());
						button7.setLabel(" ");
					}else{
						if(button11.getLabel().equals(" ")){
							button11.setLabel(button7.getLabel());
							button7.setLabel(" ");
						}
					
					}
				}	
			}
		}//End Button 7
		
		if(button8==e.getSource()){//start Button 8
			
			if(button4.getLabel().equals(" ")){
				button4.setLabel(button8.getLabel());
				button8.setLabel(" ");
			}else{
				if(button7.getLabel().equals(" ")){
					button7.setLabel(button8.getLabel());
					button8.setLabel(" ");
				}else{
					if(button12.getLabel().equals(" ")){
						button12.setLabel(button8.getLabel());
						button8.setLabel(" ");
					}	
				}	
			}
		}//End Button 8
		
		if(button9==e.getSource()){//start Button 9
			
			if(button5.getLabel().equals(" ")){
				button5.setLabel(button9.getLabel());
				button9.setLabel(" ");
			}else{
				if(button10.getLabel().equals(" ")){
					button10.setLabel(button9.getLabel());
					button9.setLabel(" ");
				}else{
					
					if(button13.getLabel().equals(" ")){
						button13.setLabel(button9.getLabel());
						button9.setLabel(" ");
					}
				}	
			}
		}//End Button 9
		
		if(button10==e.getSource()){//start Button 10
			
			if(button6.getLabel().equals(" ")){
				button6.setLabel(button10.getLabel());
				button10.setLabel(" ");
			}else{
				if(button14.getLabel().equals(" ")){
					button14.setLabel(button10.getLabel());
					button10.setLabel(" ");
				}else{
					
					if(button9.getLabel().equals(" ")){
						button9.setLabel(button10.getLabel());
						button10.setLabel(" ");
					}else{
						if(button11.getLabel().equals(" ")){
							button11.setLabel(button10.getLabel());
							button10.setLabel(" ");
						}
					
					}
				}	
			}
		}//End Button 10
		
		if(button11==e.getSource()){//start Button 11
			
			if(button10.getLabel().equals(" ")){
				button10.setLabel(button11.getLabel());
				button11.setLabel(" ");
			}else{
				if(button12.getLabel().equals(" ")){
					button12.setLabel(button11.getLabel());
					button11.setLabel(" ");
				}else{
					
					if(button7.getLabel().equals(" ")){
						button7.setLabel(button11.getLabel());
						button11.setLabel(" ");
					}else{
						if(button15.getLabel().equals(" ")){
							button15.setLabel(button11.getLabel());
							button11.setLabel(" ");
						}
					
					}
				}	
			}
		}//End Button 11
		
		if(button12==e.getSource()){//start Button 12
			
			if(button11.getLabel().equals(" ")){
				button11.setLabel(button12.getLabel());
				button12.setLabel(" ");
			}else{
				if(button8.getLabel().equals(" ")){
					button8.setLabel(button12.getLabel());
					button12.setLabel(" ");
				}else{
					if(button16.getLabel().equals(" ")){
						button16.setLabel(button12.getLabel());
						button12.setLabel(" ");
					}
				}	
			}
		}//End Button 12
		
		if(button13==e.getSource()){//start Button 13
			
			if(button9.getLabel().equals(" ")){
				button9.setLabel(button13.getLabel());
				button13.setLabel(" ");
			}else{
				if(button14.getLabel().equals(" ")){
					button14.setLabel(button13.getLabel());
					button13.setLabel(" ");
				}
			}
		}//End Button 13
		
		if(button14==e.getSource()){//start Button 14
			
			if(button13.getLabel().equals(" ")){
				button13.setLabel(button14.getLabel());
				button14.setLabel(" ");
			}else{
				if(button10.getLabel().equals(" ")){
					button10.setLabel(button14.getLabel());
					button14.setLabel(" ");
				}else{
					
					if(button15.getLabel().equals(" ")){
						button15.setLabel(button14.getLabel());
						button14.setLabel(" ");
					}
				}	
			}
		}//End Button 14
	
		if(button15==e.getSource()){//start Button 15
			
			if(button14.getLabel().equals(" ")){
				button14.setLabel(button15.getLabel());
				button15.setLabel(" ");
			}else{
				if(button11.getLabel().equals(" ")){
					button11.setLabel(button15.getLabel());
					button15.setLabel(" ");
				}else{
					
					if(button16.getLabel().equals(" ")){
						button16.setLabel(button15.getLabel());
						button15.setLabel(" ");
					}
				}	
			}
		}//End Button 15
		
		if(button16==e.getSource()){//start Button 16
			
			if(button15.getLabel().equals(" ")){
				button15.setLabel(button16.getLabel());
				button16.setLabel(" ");
			}else{
				if(button12.getLabel().equals(" ")){
					button12.setLabel(button16.getLabel());
					button16.setLabel(" ");
				}
			}
		}//End Button 16
		
		if(Sequence==e.getSource()){
			
			
			button1.setLabel("1");
			button2.setLabel("2");
			button3.setLabel("3");
			button4.setLabel("4");
			button5.setLabel("5");
			button6.setLabel("6");
			button7.setLabel("7");
			button8.setLabel("8");
			button9.setLabel("9");
			button10.setLabel("10");
			button11.setLabel("11");
			button12.setLabel("12");
			button13.setLabel("13");
			button14.setLabel("14");
			button15.setLabel("15");
			button16.setLabel(" ");
		}
	}
	}