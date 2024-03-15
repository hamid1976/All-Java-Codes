import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.applet.*;
import java.net.*;
import java.io.*;
class TicTacToe extends Frame implements ActionListener,Serializable{
	Frame win = new Frame("Game Tic Tac Teo");
	MenuBar bar = new MenuBar();
	Menu file = new Menu("File");
	Menu help = new Menu("Help");
	MenuItem open = new MenuItem("Open");
	MenuItem save = new MenuItem("Save");
	MenuItem exit = new MenuItem("Exit");
	MenuItem about = new MenuItem("About");
	
	Button b1=new Button();
	Button b2=new Button();
	Button b3=new Button();
	Button b4=new Button();
	Button b5=new Button();
	Button b6=new Button();
	Button b7=new Button();
	Button b8=new Button();
	Button b9=new Button();
	Button restart=new Button("Restart");
	
	
	
	TicTacToe(){
		// win.setBounds(0, 0, 700, 700);
		// win.setLayout(null);
		
		
		win.setLayout(null);
		win.setBounds(0,0, 950,750);
		b1.setBounds(10,30,215,215);
		b2.setBounds(215,30,215,215);
		b3.setBounds(430,30,215,215);
		b4.setBounds(10,245,215,215);
		b5.setBounds(215,245,215,215);
		b6.setBounds(430,245,215,215);
		b7.setBounds(10,460,215,215);
		b8.setBounds(215,460,215,215);
		b9.setBounds(430,460,215,215);
		restart.setBounds(100,680,400,40);
		restart.setBackground(Color.green);

        win.add(b1);
        win.add(b2);
        win.add(b3);
        win.add(b4);
        win.add(b5);
        win.add(b6);
        win.add(b7);
        win.add(b8);
        win.add(b9);
		win.add(restart);
		
		win.setMenuBar(bar);
		bar.add(file);
		bar.add(help);
		file.add(open);
		file.add(save);
		file.add(exit);
		help.add(about);
		
		
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
		restart.addActionListener(this);
		
		open.addActionListener(this);
		save.addActionListener(this);
		exit.addActionListener(this);
		about.addActionListener(this);

        win.setVisible(true);
	}//end TicTacToe Constructor
	
	public void saveFile(){
		FileDialog d = new FileDialog(win,"Save",FileDialog.SAVE);
		d.setVisible(true);
		
		String filename = d.getFile();
		String folder = d.getDirectory();
		String path = folder + filename;
		
		try{
			FileOutputStream file = new FileOutputStream(path);
			ObjectOutputStream obj = new ObjectOutputStream(file);
			
			this.hide();//Hide The Frame
			obj.writeObject(win);//Then writeObject(current);
			file.close();//close file
			System.exit(0);//Exit The Program
			
			System.out.println("Saved Object");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}//end saveFile
	
	public void openFile() {
		FileDialog f = new FileDialog(this, "Open", FileDialog.LOAD);
		f.setVisible(true);

		String filename = f.getFile();
		String folder = f.getDirectory();
		String path = folder + filename;

		try{
			FileInputStream file = new FileInputStream(path);
			 ObjectInputStream obj = new ObjectInputStream(file);

			win.dispose();
			Frame win1 = (Frame) obj.readObject();
			win1.setVisible(true); // Use setVisible(true) instead of show()

			System.out.println("Run Object");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}//end openFile
	
	
	int counter=0;
	boolean b;
	public void setSymbol(Button clicked){
		b=!b;
		if(b){
			clicked.setLabel("X");
			clicked.setBackground(Color.orange);
			win();
			gameOver();

		}else{
			clicked.setLabel("0");
			clicked.setBackground(Color.blue);
			win();
			gameOver();

		}
		// gameOver();
		// counter++;
		 // if (counter >= 5) { // Minimum moves required to check for a win
				// win();
         // }else if (counter == 9) {
                // gameOver();
         // }
        
		System.out.println(counter);
	}//end setSymbol method
	
	public void win(){
		if(b1.getLabel().equals("X")&&b2.getLabel().equals("X")&&b3.getLabel().equals("X")||
		   b4.getLabel().equals("X")&&b5.getLabel().equals("X")&&b6.getLabel().equals("X")||
		   b7.getLabel().equals("X")&&b8.getLabel().equals("X")&&b9.getLabel().equals("X")||
		   b1.getLabel().equals("X")&&b4.getLabel().equals("X")&&b7.getLabel().equals("X")||
		   b2.getLabel().equals("X")&&b5.getLabel().equals("X")&&b8.getLabel().equals("X")||
		   b3.getLabel().equals("X")&&b6.getLabel().equals("X")&&b9.getLabel().equals("X")||
		   b1.getLabel().equals("X")&&b5.getLabel().equals("X")&&b9.getLabel().equals("X")||
		   b3.getLabel().equals("X")&&b5.getLabel().equals("X")&&b7.getLabel().equals("X")){
			JOptionPane.showMessageDialog(null,"Player X wins");
		}
		
		if(b1.getLabel().equals("0")&&b2.getLabel().equals("0")&&b3.getLabel().equals("0")||
		   b4.getLabel().equals("0")&&b5.getLabel().equals("0")&&b6.getLabel().equals("0")||
		   b7.getLabel().equals("0")&&b8.getLabel().equals("0")&&b9.getLabel().equals("0")||
		   b1.getLabel().equals("0")&&b4.getLabel().equals("0")&&b7.getLabel().equals("0")||
		   b2.getLabel().equals("0")&&b5.getLabel().equals("0")&&b8.getLabel().equals("0")||
		   b3.getLabel().equals("0")&&b6.getLabel().equals("0")&&b9.getLabel().equals("0")||
		   b1.getLabel().equals("0")&&b5.getLabel().equals("0")&&b9.getLabel().equals("0")||
		   b3.getLabel().equals("0")&&b5.getLabel().equals("0")&&b7.getLabel().equals("0")){
			JOptionPane.showMessageDialog(null,"Player 0 wins");
		   }
	}//end win
	public void gameOver(){
		if (!b1.getLabel().equals("") && !b2.getLabel().equals("") && !b3.getLabel().equals("") &&
			!b4.getLabel().equals("") && !b5.getLabel().equals("") && !b6.getLabel().equals("") &&
			!b7.getLabel().equals("") && !b8.getLabel().equals("") && !b9.getLabel().equals("")){
		
			JOptionPane.showMessageDialog(null,"Game Tied");
			restart();
		}
	}
	public void restart(){
			b1.setLabel("");
			b2.setLabel("");
			b3.setLabel("");
			b4.setLabel("");
			b5.setLabel("");
			b6.setLabel("");
			b7.setLabel("");
			b8.setLabel("");
			b9.setLabel("");
			b1.setBackground(Color.white);
			b2.setBackground(Color.white);
			b3.setBackground(Color.white);
			b4.setBackground(Color.white);
			b5.setBackground(Color.white);
			b6.setBackground(Color.white);
			b7.setBackground(Color.white);
			b8.setBackground(Color.white);
			b9.setBackground(Color.white);
			
			counter=0;
	}//end restart

    public void actionPerformed(ActionEvent e) {
		if(exit==e.getSource()){
			System.exit(0);
		}
		if(save==e.getSource()){
			saveFile();
		}
		if(open==e.getSource()){
			openFile();
		}
		if(b1==e.getSource()){
			setSymbol(b1);
		}else if(b2==e.getSource()){
			setSymbol(b2);
		}else if(b3==e.getSource()){
			setSymbol(b3);
		}else if(b4==e.getSource()){
			 setSymbol(b4);
		}else if(b5==e.getSource()){
			 setSymbol(b5);
		}else if(b6==e.getSource()){
			 setSymbol(b6);
		}else if(b7==e.getSource()){
			 setSymbol(b7);
		}else if(b8==e.getSource()){
			 setSymbol(b8);
		}else if(b9==e.getSource()){
			 setSymbol(b9);
		}else if(restart==e.getSource()){
			  restart();
		}
    }//end actionPerformed
	public static void main(String arg[]) {
        TicTacToe ob = new TicTacToe();
    }
}