import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.applet.*;
import java.net.*;
import java.io.*;
public class TicTacToeSaveGame extends Frame implements ActionListener, Serializable{
	public static void main(String[] args) {
		TicTacToeSaveGame t = new TicTacToeSaveGame();
	}
	Frame win = new Frame("Game Tic Tac Teo");
	MenuBar bar = new MenuBar();
	Menu file = new Menu("File");
	Menu help = new Menu("Help");
	MenuItem ope = new MenuItem("Open");
	MenuItem s = new MenuItem("Save");
	MenuItem et = new MenuItem("Exit");
	MenuItem ab = new MenuItem("About");

	Button btn1 = new Button();
	Button btn2 = new Button();
	Button btn3 = new Button();
	Button btn4 = new Button();
	Button btn5 = new Button();
	Button btn6 = new Button();
	Button btn7 = new Button();
	Button btn8 = new Button();
	Button btn9 = new Button();
	Button xP = new Button("New Game");
	Button oP = new Button("New Game");
	Button btn10 = new Button("New Game");
	Button btn11 = new Button("Game Exit");
	int x=0; int o=0;
	Label xLabel = new Label("X Win is  "+x);
	Label oLabel = new Label("O Win is  :"+o);
	Font f =new Font("Arial",Font.BOLD,150);
	TicTacToeSaveGame(){
		win.setMenuBar(bar);
		bar.add(file);
		bar.add(help);
		file.add(ope);
		file.add(s);
		file.add(et);
		help.add(ab);
				  //w(x) l(y)
		win.setLayout(null);
		win.setBounds(0,0, 950,750);
		btn1.setBounds(10,30,215,215);
		btn2.setBounds(215,30,215,215);
		btn3.setBounds(430,30,215,215);
		btn4.setBounds(10,245,215,215);
		btn5.setBounds(215,245,215,215);
		btn6.setBounds(430,245,215,215);
		btn7.setBounds(10,460,215,215);
		btn8.setBounds(215,460,215,215);
		btn9.setBounds(430,460,215,215);
		btn10.setBounds(220,695,100,25);
		btn11.setBounds(330,695,100,25);
		xLabel.setBounds(680,400,100,25);
		xP.setBounds(680,450,100,25);
		oLabel.setBounds(680,300,100,25);
		oP.setBounds(680,350,100,25);

		win.add(btn1);
		win.add(btn2);
		win.add(btn3);
		win.add(btn4);
		win.add(btn5);
		win.add(btn6);
		win.add(btn7);
		win.add(btn8);
		win.add(btn9);
		win.add(btn10);
		win.add(btn11);
		win.add(xLabel);
		win.add(xP);
		win.add(oLabel);
		win.add(oP);

		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		btn6.addActionListener(this);
		btn7.addActionListener(this);
		btn8.addActionListener(this);
		btn9.addActionListener(this);
		btn10.addActionListener(this);
		btn11.addActionListener(this);
		xP.addActionListener(this);
		oP.addActionListener(this);
		
		ope.addActionListener(this);
		s.addActionListener(this);
		et.addActionListener(this);
		ab.addActionListener(this);

		btn1.setFont(f);
		btn2.setFont(f);
		btn3.setFont(f);
		btn4.setFont(f);
		btn5.setFont(f);
		btn6.setFont(f);
		btn7.setFont(f);
		btn8.setFont(f);
		btn9.setFont(f);
		Font f1 =new Font("Arial",Font.BOLD,15);
		xLabel.setFont(f1);
		xP.setFont(f1);
		oLabel.setFont(f1);
		oP.setFont(f1);
		btn10.setFont(f1);
		btn11.setFont(f1);
		win.show();
	}
	// 
	public void openFile(){
		// TicTacToeSaveGame tg =null;
		FileDialog f = new FileDialog(win,"Open",FileDialog.LOAD);
		f.show();
		String filename=f.getFile();
		String dir=f.getDirectory();
		String path=dir+filename;
		try{
			FileInputStream fin = new FileInputStream(path);
			ObjectInputStream obj = new ObjectInputStream(fin);
			//TicTacToeSaveGame tg = (TicTacToeSaveGame)obj.readObject();
			win.dispose();
			Frame win1 =(Frame)obj.readObject();
			//tg.setObject(tg);
			win1.show();
			fin.close();
			System.out.println("Run Oject");
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
		FileDialog d = new FileDialog(win,"Save",FileDialog.SAVE);
		d.show();
		String filename=d.getFile();
		String dir=d.getDirectory();
		String path=dir+filename;
		try{
			FileOutputStream fout = new FileOutputStream(path);
			ObjectOutputStream obj = new ObjectOutputStream(fout);
			obj.writeObject(win);
			fout.close();
			System.out.println("Saved Object");
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
		// if (et==e.getSource()) {
		// 	System.exit(0);
		// }
		if (ab==e.getSource()) {
			JOptionPane.showMessageDialog(null,"2 Player Tic Tac Toe Game");
		}

	//	---------------------------------------------
		b=!b;
		if(btn1==e.getSource()){
			if(b){
				btn1.setBackground(Color.red);
				btn1.setLabel("X");
			}else{
				btn1.setLabel("O");
				btn1.setBackground(Color.blue);
			}
			btn1.setEnabled(false);
		}

		else if(btn2==e.getSource()){
			if(b){
				btn2.setBackground(Color.red);
				btn2.setLabel("X");
			}else{
				btn2.setBackground(Color.blue);
				btn2.setLabel("O");	
			}
			btn2.setEnabled(false);
		}

		else if(btn3==e.getSource()){
			if(b){
				btn3.setBackground(Color.red);
				btn3.setLabel("X");
			}else{
				btn3.setBackground(Color.blue);
				btn3.setLabel("O");
			}
			btn3.setEnabled(false);
		}

		else if(btn4==e.getSource()){
			if(b){
				btn4.setBackground(Color.red);
				btn4.setLabel("X");
			}else{
				btn4.setBackground(Color.blue);
				btn4.setLabel("O");
			}
			btn4.setEnabled(false);
		}

		else if(btn5==e.getSource()){
			if(b){
				btn5.setBackground(Color.red);
				btn5.setLabel("X");
			}else{
				btn5.setBackground(Color.blue);
				btn5.setLabel("O");
			}
			btn5.setEnabled(false);
		}

		else if(btn6==e.getSource()){
			if(b){
				btn6.setBackground(Color.red);
				btn6.setLabel("X");
			}else{
				btn6.setBackground(Color.blue);
				btn6.setLabel("O");
			}
			btn6.setEnabled(false);
				
		}

		else if(btn7==e.getSource()){
			if(b){
				btn7.setBackground(Color.red);
				btn7.setLabel("X");
			}else{
				btn7.setBackground(Color.blue);
				btn7.setLabel("O");
			}
			btn7.setEnabled(false);
		}

		else if(btn8==e.getSource()){
			if(b){
				btn8.setBackground(Color.red);
				btn8.setLabel("X");
			}else{
				btn8.setBackground(Color.blue);
				btn8.setLabel("O");
			}
			btn8.setEnabled(false);
			
		}

		else if(btn9==e.getSource()){
			if(b){
				btn9.setBackground(Color.red);
				btn9.setLabel("X");
			}else{
				btn9.setBackground(Color.blue);
				btn9.setLabel("O");	
			}
			btn9.setEnabled(false);
		}
		else if(btn10==e.getSource()){
			xLabel.setText("X Win is  :"+(0)); 
			oLabel.setText("O Win is  :"+(0)); 
			result();
		}
		else if(btn11==e.getSource()){
			System.exit(0);
		}
		else if(oP==e.getSource()){
			xLabel.setText("X Win is  :"+(x++)); 
			result();
		}
		else if(xP==e.getSource()){
			oLabel.setText("O Win is  :"+(o++)); 
			result();
		}
		if(btn1.getLabel().equals("X") && btn2.getLabel().equals("X") && btn3.getLabel().equals("X") ||
			btn4.getLabel().equals("X") && btn5.getLabel().equals("X") && btn6.getLabel().equals("X") ||
			btn7.getLabel().equals("X") && btn8.getLabel().equals("X") && btn9.getLabel().equals("X") ||
			btn1.getLabel().equals("X") && btn5.getLabel().equals("X") && btn9.getLabel().equals("X") ||
			btn3.getLabel().equals("X") && btn5.getLabel().equals("X") && btn7.getLabel().equals("X") ||	
			btn1.getLabel().equals("X") && btn4.getLabel().equals("X") && btn7.getLabel().equals("X") ||
			btn2.getLabel().equals("X") && btn5.getLabel().equals("X") && btn8.getLabel().equals("X") ||
			btn3.getLabel().equals("X") && btn6.getLabel().equals("X") && btn9.getLabel().equals("X")){

			JOptionPane.showMessageDialog(null,"The X Wins Game");
			x++;
			xLabel.setText("X Win is  :"+(x)); 
			result();
		}
		if(btn1.getLabel().equals("O") && btn2.getLabel().equals("O") && btn3.getLabel().equals("O") ||
			btn4.getLabel().equals("O") && btn5.getLabel().equals("O") && btn6.getLabel().equals("O") ||
			btn7.getLabel().equals("O") && btn8.getLabel().equals("O") && btn9.getLabel().equals("O") ||
			btn1.getLabel().equals("O") && btn5.getLabel().equals("O") && btn9.getLabel().equals("O") ||
			btn3.getLabel().equals("O") && btn5.getLabel().equals("O") && btn7.getLabel().equals("O") ||	
			btn1.getLabel().equals("O") && btn4.getLabel().equals("O") && btn7.getLabel().equals("O") ||
			btn2.getLabel().equals("O") && btn5.getLabel().equals("O") && btn8.getLabel().equals("O") ||
			btn3.getLabel().equals("O") && btn6.getLabel().equals("O") && btn9.getLabel().equals("O")){
			JOptionPane.showMessageDialog(null,"You are Blue Game Win");
			o++;
			oLabel.setText("O Win is  :"+(o)); 
			result();
		}
		if(!btn1.getLabel().equals("") && !btn2.getLabel().equals("") && !btn3.getLabel().equals("") &&
			!btn4.getLabel().equals("") && !btn5.getLabel().equals("") && !btn6.getLabel().equals("") &&
			!btn7.getLabel().equals("") && !btn8.getLabel().equals("") && !btn9.getLabel().equals("")){
			JOptionPane.showMessageDialog(null,"Game Over");
			result();
		}
	}
	void result(){
		btn1.setBackground(Color.white);
		btn1.setEnabled(true);
		btn1.setLabel("");

		btn2.setBackground(Color.white);
		btn2.setEnabled(true);
		btn2.setLabel("");

		btn3.setBackground(Color.white);
		btn3.setEnabled(true);
		btn3.setLabel("");

		btn4.setBackground(Color.white);
		btn4.setEnabled(true);
		btn4.setLabel("");

		btn5.setBackground(Color.white);
		btn5.setEnabled(true);
		btn5.setLabel("");

		btn6.setBackground(Color.white);
		btn6.setEnabled(true);
		btn6.setLabel("");

		btn7.setBackground(Color.white);
		btn7.setEnabled(true);
		btn7.setLabel("");

		btn8.setBackground(Color.white);
		btn8.setEnabled(true);
		btn8.setLabel("");

		btn9.setBackground(Color.white);
		btn9.setEnabled(true);
		btn9.setLabel("");
	}
}