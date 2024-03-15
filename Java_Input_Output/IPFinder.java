import java.swing.*;
import java.awt.event.ActionListener;
import java.net.InetAddress;
import java.net.UnknownHostException;
class IPFinder{
	public static void main(String arg[]){
		
		Frame frame=new Frame("IP Finder Program");
		frame.setBounds(100,100,1000,100);
		frame.setVisible(true); 
		
		
		Label label=new Label("Enter URL:");
		label.setBounds(50,70,150,20);
		
		TextField textField=new TextField();
		textField.setBounds(50,100,200,20);
		
		Button button=new Button("Find Ip");
		button.setBounds(50,150,80,30);
		
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String url=textField.getText();
				try{
					InetAddress ia=InetAddress.getByName(url);
					String ip=ia.getHostAddress();
					JOptionPane.showMessageDialog(frame,ip);
					
				}catch(UnKnownHostException unKnownHostException){
					unKnownHostException.printStackTrace();
				}
	       }
      });
         frame.add(label);
		 frame.add(button);
		 frame.add(textField);
		 frame.setLayout(new GridLayout());
		 
	}
}