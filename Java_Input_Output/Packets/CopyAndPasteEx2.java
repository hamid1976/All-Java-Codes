import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.applet.*;
import java.net.*;
import java.io.*;

class CopyAndPasteEx2 extends JFrame implements ActionListener{
	public static void main(String[] args) {
		CopyAndPasteEx2 v = new CopyAndPasteEx2();
	}
	MenuBar bar = new MenuBar();
	Menu file = new Menu("File");
	Menu help = new Menu("Help");
	MenuItem ope = new MenuItem("Open");
	MenuItem s = new MenuItem("Save");
	MenuItem et = new MenuItem("Exit");
	MenuItem ab = new MenuItem("About");
	JProgressBar pBar = new JProgressBar();
	CopyAndPasteEx2(){
		this.setMenuBar(bar);
		bar.add(file);
		bar.add(help);
		file.add(ope);
		file.add(s);
		file.add(et);
		help.add(ab);
		this.add(pBar);
			
		this.setLayout(null);
		this.setBounds(0,0, 1050,750);
			pBar.setBounds(100,600,400,30);

		ope.addActionListener(this);
		s.addActionListener(this);
		et.addActionListener(this);
		ab.addActionListener(this);

		this.show();
	}
	public void openFile(){
		
		// FileDialog f = new FileDialog(this,"Open",FileDialog.LOAD);
		// f.show();
		// String filename=f.getFile();
		// String dir=f.getDirectory();
		// String path=dir+filename;
		// try{
		// 	FileInputStream file = new FileInputStream(path);
		// 	FileOutputStream fn = new FileOutputStream(file);
		// 	CopyAndPasteEx2 tg=null;
		// 	this.hide();
		// 	int code;
		// 	// while ((code=file.write())!=-1) {
		// 		tg = (CopyAndPasteEx2)fn.read();
		// 	// }
		// 	// fout.close();
		// 	tg.show();
		// 	System.out.println("Run Oject");
		// }catch (Exception e) {
  //           e.printStackTrace();
  //       }
	}
	public void saveFile(){
		FileDialog l = new FileDialog(this,"Open",FileDialog.LOAD);
		FileDialog d = new FileDialog(this,"Save",FileDialog.SAVE);
		l.show();
		d.show();

		String fin =l.getFile();
		String dr = l.getDirectory();
		String pth = dr+fin;

		String filename=d.getFile();
		String dir=d.getDirectory();
		String path=dir+filename;
		try{
			FileInputStream fIn = new FileInputStream(pth);
			FileOutputStream fOut = new FileOutputStream(path);
			
			int size= fIn.available();
			int packetSize=1000;
			int totalPackets = size/packetSize;
			int lastPacketSize = size%packetSize;
			byte data[] = new byte[packetSize];
			pBar.setMaximum(packetSize);
			pBar.setMinimum(0);
			for (int p=1; p<=totalPackets; p++) {
				fIn.read(data, 0, packetSize);
				fOut.write(data, 0, packetSize);
				pBar.setValue(totalPackets);
			}
			fIn.read(data, 0, lastPacketSize);
			fOut.write(data, 0, lastPacketSize);
			
			fOut.close();
			System.out.println("Packet Transition Success fully");

		}catch (Exception e) {
			e.printStackTrace();
		}

	}
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
			JOptionPane.showMessageDialog(null,"I'm Copy and Paste");
		}
	}
}