import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.applet.*;
import java.net.*;
import java.io.*;
public class TicTacToeSaveGame extends Frame implements ActionListener,Serializable{
	Frame win       = new Frame("Game Tic Tac Teo");
	MenuBar bar     = new MenuBar();
	Menu file       = new Menu("File");
	Menu help       = new Menu("Help");
	MenuItem open   = new MenuItem("Open");
	MenuItem save   = new MenuItem("Save");
	MenuItem exit   = new MenuItem("Exit");
	MenuItem about = new MenuItem("About");

	Button b1 = new Button();
	Button b2 = new Button();
	Button b3 = new Button();
	Button b4 = new Button();
	Button b5 = new Button();
	Button b6 = new Button();
	Button b7 = new Button();
	Button b8 = new Button();
	Button b9 = new Button();
	
	Button xP = new Button("New Game");
	Button oP = new Button("New Game");
	Button b10 = new Button("New Game");
	Button b11 = new Button("Game Exit");
	int x=0; int o=0;
	Label xLabel = new Label("X Win is  "+x);
	Label oLabel = new Label("O Win is  :"+o);
	Font f =new Font("Arial",Font.BOLD,150);
	
	
	TicTacToeSaveGame(){
		
		win.setMenuBar(bar);
		bar.add(file);
		bar.add(help);
		file.add(open);
		file.add(save);
		file.add(exit);
		help.add(about);
		
				  
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
		b10.setBounds(220,695,100,25);
		b11.setBounds(330,695,100,25);
		xLabel.setBounds(680,400,100,25);
		xP.setBounds(680,450,100,25);
		oLabel.setBounds(680,300,100,25);
		oP.setBounds(680,350,100,25);

		win.add(b1);
		win.add(b2);
		win.add(b3);
		win.add(b4);
		win.add(b5);
		win.add(b6);
		win.add(b7);
		win.add(b8);
		win.add(b9);
		win.add(b10);
		win.add(b11);
		win.add(xLabel);
		win.add(xP);
		win.add(oLabel);
		win.add(oP);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
		xP.addActionListener(this);
		oP.addActionListener(this);
		
		open.addActionListener(this);
		save.addActionListener(this);
		exit.addActionListener(this);
		about.addActionListener(this);

		b1.setFont(f);
		b2.setFont(f);
		b3.setFont(f);
		b4.setFont(f);
		b5.setFont(f);
		b6.setFont(f);
		b7.setFont(f);
		b8.setFont(f);
		b9.setFont(f);
		Font f1 =new Font("Arial",Font.BOLD,15);
		xLabel.setFont(f1);
		xP.setFont(f1);
		oLabel.setFont(f1);
		oP.setFont(f1);
		b10.setFont(f1);
		b11.setFont(f1);
		
		win.setVisible(true);
	}
	
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
			win1.setVisible(true); 
			System.out.println("Run Object");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}//end openFile
	
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
	}//end setSymbol method
	
	public void win(){
		if (b1.getLabel().equals("X") && b2.getLabel().equals("X") && b3.getLabel().equals("X") ||
			b4.getLabel().equals("X") && b5.getLabel().equals("X") && b6.getLabel().equals("X") ||
			b7.getLabel().equals("X") && b8.getLabel().equals("X") && b9.getLabel().equals("X") ||
			b1.getLabel().equals("X") && b5.getLabel().equals("X") && b9.getLabel().equals("X") ||
			b3.getLabel().equals("X") && b5.getLabel().equals("X") && b7.getLabel().equals("X") ||	
			b1.getLabel().equals("X") && b4.getLabel().equals("X") && b7.getLabel().equals("X") ||
			b2.getLabel().equals("X") && b5.getLabel().equals("X") && b8.getLabel().equals("X") ||
			b3.getLabel().equals("X") && b6.getLabel().equals("X") && b9.getLabel().equals("X")){

			JOptionPane.showMessageDialog(null,"The X Wins Game");
			x++;
			xLabel.setText("X Win is  :"+(x)); 
			result();
		}
		if (b1.getLabel().equals("O") && b2.getLabel().equals("O") && b3.getLabel().equals("O") ||
			b4.getLabel().equals("O") && b5.getLabel().equals("O") && b6.getLabel().equals("O") ||
			b7.getLabel().equals("O") && b8.getLabel().equals("O") && b9.getLabel().equals("O") ||
			b1.getLabel().equals("O") && b5.getLabel().equals("O") && b9.getLabel().equals("O") ||
			b3.getLabel().equals("O") && b5.getLabel().equals("O") && b7.getLabel().equals("O") ||	
			b1.getLabel().equals("O") && b4.getLabel().equals("O") && b7.getLabel().equals("O") ||
			b2.getLabel().equals("O") && b5.getLabel().equals("O") && b8.getLabel().equals("O") ||
			b3.getLabel().equals("O") && b6.getLabel().equals("O") && b9.getLabel().equals("O")){
			JOptionPane.showMessageDialog(null,"The 0 Wins Game");
			o++;
			oLabel.setText("O Win is  :"+(o)); 
			result();
		}
	}//end win
	
	public void gameOver(){
		if (!b1.getLabel().equals("") && !b2.getLabel().equals("") && !b3.getLabel().equals("") &&
			!b4.getLabel().equals("") && !b5.getLabel().equals("") && !b6.getLabel().equals("") &&
			!b7.getLabel().equals("") && !b8.getLabel().equals("") && !b9.getLabel().equals("")){
			JOptionPane.showMessageDialog(null,"Game Tied");
			result();
		}
	}
	
	void result(){
		b1.setBackground(Color.white);
		b1.setEnabled(true);
		b1.setLabel("");

		b2.setBackground(Color.white);
		b2.setEnabled(true);
		b2.setLabel("");

		b3.setBackground(Color.white);
		b3.setEnabled(true);
		b3.setLabel("");

		b4.setBackground(Color.white);
		b4.setEnabled(true);
		b4.setLabel("");

		b5.setBackground(Color.white);
		b5.setEnabled(true);
		b5.setLabel("");

		b6.setBackground(Color.white);
		b6.setEnabled(true);
		b6.setLabel("");

		b7.setBackground(Color.white);
		b7.setEnabled(true);
		b7.setLabel("");

		b8.setBackground(Color.white);
		b8.setEnabled(true);
		b8.setLabel("");

		b9.setBackground(Color.white);
		b9.setEnabled(true);
		b9.setLabel("");
	}//end restart
	
	public void actionPerformed(ActionEvent e){
		if (save==e.getSource()) {
			saveFile();
		}
		if (open==e.getSource()) {
			System.out.println("open");
			openFile();
		}
		if (exit==e.getSource()) {
		 	System.exit(0);
		}
		if (about==e.getSource()) {
			JOptionPane.showMessageDialog(null,"2 Player Tic Tac Toe Game");
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
		}else if(b10==e.getSource()){
			xLabel.setText("X Win is  :"+(0)); 
			oLabel.setText("O Win is  :"+(0)); 
			result();
		}else if(b11==e.getSource()){
			System.exit(0);
		}else if(oP==e.getSource()){
			xLabel.setText("X Win is  :"+(x++)); 
			result();
		}else if(xP==e.getSource()){
			oLabel.setText("O Win is  :"+(o++)); 
			result();
		}
	}//and actionPerformed
	
	public static void main(String[] args) {
		TicTacToeSaveGame t = new TicTacToeSaveGame();
	}
}