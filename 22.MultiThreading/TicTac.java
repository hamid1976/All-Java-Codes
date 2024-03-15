import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TicTac implements ActionListener {
    Frame win = new Frame();

	Label l=new Label("TicTac Teo");
    Button b1 = new Button();
    Button b2 = new Button();
    Button b3 = new Button();
    Button b4 = new Button();
    Button b5 = new Button();
    Button b6 = new Button();
    Button b7 = new Button();
    Button b8 = new Button();
    Button b9 = new Button();
	
	Button restart=new  Button("Restart");
    TicTac() {
        win.setBounds(0, 0, 700, 700);
		win.setLayout(null);
		win.setBackground(Color.pink);
		l.setBounds (100,0,100,100);
        b1.setBounds(100, 100, 150, 150);
        b2.setBounds(260, 100, 150, 150);
        b3.setBounds(420, 100, 150, 150);
        b4.setBounds(100, 260, 150, 150);
        b5.setBounds(260, 260, 150, 150);
        b6.setBounds(420, 260, 150, 150);
        b7.setBounds(100, 420, 150, 150);
        b8.setBounds(260, 420, 150, 150);
        b9.setBounds(420, 420, 150, 150);
		restart.setBounds(100,600,470,50);
			
			l.setBackground(Color.red);
			restart.setBackground(Color.red);
			b1.setBackground(Color.white);
			b2.setBackground(Color.white);
			b3.setBackground(Color.white);
			b4.setBackground(Color.white);
			b5.setBackground(Color.white);
			b6.setBackground(Color.white);
			b7.setBackground(Color.white);
			b8.setBackground(Color.white);
			b9.setBackground(Color.white);
		
		
		
		//win.add(l);
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
		
        win.setVisible(true);
        // win.show(); // Note: This method is deprecated and should not be used.
     }
	boolean b;
	public void setSymbol(Button clicked){
		b=!b;
		if(b){
			clicked.setLabel("X");
			clicked.setBackground(Color.orange);
			win();
		}else{
			clicked.setLabel("0");
			clicked.setBackground(Color.blue);
			win();
		}
	}
	
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
			
	}
	
    public void actionPerformed(ActionEvent e) {
		
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
    }

    public static void main(String arg[]) {
        TicTac ob = new TicTac();
    }
}