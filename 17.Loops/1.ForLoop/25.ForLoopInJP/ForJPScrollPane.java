import javax.swing.*;
class ForJPScrollPane{
      public static void main(String arg[]){
	  JTextArea area=new JTextArea();
      JScrollPane scroll=new JScrollPane(area);
      for(int i=1; i<=500; i++){
           area.append(i+"\n");
      }
      JOptionPane.showMessageDialog(null,scroll);
	  } 
}	  