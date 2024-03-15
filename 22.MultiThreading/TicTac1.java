import java.awt.*;
import java.awt.event.*;

public class TicTac1 implements ActionListener {
    Frame win = new Frame();

    Button b1 = new Button();
    Button b2 = new Button();
    Button b3 = new Button();
    Button b4 = new Button();
    Button b5 = new Button();
    Button b6 = new Button();
    Button b7 = new Button();
    Button b8 = new Button();
    Button b9 = new Button();

    TicTac1() {
        win.setBounds(0, 0, 600, 600);
		win.setLayout(null);
        b1.setBounds(100, 100, 150, 150);
        b2.setBounds(260, 100, 150, 150);
        b3.setBounds(420, 100, 150, 150);
        b4.setBounds(100, 260, 150, 150);
        b5.setBounds(260, 260, 150, 150);
        b6.setBounds(420, 260, 150, 150);
        b7.setBounds(100, 420, 150, 150);
        b8.setBounds(260, 420, 150, 150);
        b9.setBounds(420, 420, 150, 150);

		
		
        win.add(b1);
        win.add(b2);
        win.add(b3);
        win.add(b4);
        win.add(b5);
        win.add(b6);
        win.add(b7);
        win.add(b8);
        win.add(b9);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);

        win.setVisible(true);
        // win.show(); // Note: This method is deprecated and should not be used.
     }
	// int a=1;
		// void mark(int n){
			
			
			// if(n==3){
				// a=-1;
				// b3.setLabel("X");
			// }else{
				// b3.setLabel("0");
			// }
			// if(n==4){
				// b4.setLabel("X");
			// }else{
				// b4.setLabel("0");
			// }
			// if(n==5){
				// b5.setLabel("X");
			// }else{
				// b5.setLabel("0");
			// }
			// if(n==6){
				// b6.setLabel("X");
			// }else{
				// b6.setLabel("0");
			// }
			// if(n==7){
				// b7.setLabel("X");
			// }else{
				// b7.setLabel("0");
			// }
			// if(n==8){
				// b8.setLabel("X");
			// }else{
				// b8.setLabel("0");
			// }
			// if(n==9){
				// b9.setLabel("X");
			// }else{
				// b9.setLabel("0");
			// }
		// }
	boolean b;
    public void actionPerformed(ActionEvent e) {
		b=!b;
		if(b1==e.getSource()){
			if(b){
				b1.setLabel("X");
			}else{
				b1.setLabel("0");
			}
		}else if(b2==e.getSource()){
			if(b){
				
				b2.setLabel("X");
				
			}else{
				b2.setLabel("0");
			}
		}else if(b3==e.getSource()){
			 if(b){
				
				b3.setLabel("X");
				
			}else{
				b3.setLabel("0");
			}
		}else if(b4==e.getSource()){
			 if(b){
				
				b4.setLabel("X");
				
			}else{
				b4.setLabel("0");
			}
		}else if(b5==e.getSource()){
			 if(b){
				
				b5.setLabel("X");
				
			}else{
				b5.setLabel("0");
			}
		}else if(b6==e.getSource()){
			 if(b){
				
				b6.setLabel("X");
				
			}else{
				b6.setLabel("0");
			}
		}else if(b7==e.getSource()){
			 if(b){
				
				b7.setLabel("X");
				
			}else{
				b7.setLabel("0");
			}
		}else if(b8==e.getSource()){
			if(b){
				
				b8.setLabel("X");
				
			}else{
				b8.setLabel("0");
			}
		}else if(b9==e.getSource()){
			if(b){
				
				b9.setLabel("X");
				
			}else{
				b9.setLabel("0");
			}
		}
    }

    public static void main(String arg[]) {
        TicTac1 ob = new TicTac1();
    }
}