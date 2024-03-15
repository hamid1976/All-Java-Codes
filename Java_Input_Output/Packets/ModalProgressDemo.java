import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoundedRangeModel;
import javax.swing.DefaultBoundedRangeModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;

public class ModalProgressDemo extends JPanel {

	private static final long serialVersionUID = 1L;

	public ModalProgressDemo(final Frame owner) {
		JButton button = new JButton("Go");
		add(button);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final JDialog dialog = new JDialog(owner, "Working...", true);
				BoundedRangeModel model = new DefaultBoundedRangeModel();
				JProgressBar progressBar = new JProgressBar(model);
				dialog.add(progressBar);
				dialog.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
				dialog.setResizable(false);
				dialog.pack();
				dialog.setLocationRelativeTo(owner);
				Task task = new Task(model);
				task.go(new Runnable() {
					public void run() {
						dialog.setVisible(false);
					}
				});
				System.out.println("Showing dialog...");
				dialog.setVisible(true);
				System.out.println("setVisible(boolean) call returned");
			}
		});
	}
	
	private static class Task {
		
		private final BoundedRangeModel model;
		
		public Task(BoundedRangeModel model) {
			this.model = model;
		}
		
		public void go(final Runnable doneCallback) {
			Thread bg = new Thread(new Runnable() {
				public void run() {
					int progress = 0;
					while (progress < 100) {
						System.out.println(progress);
						progress++;
						model.setValue(progress);
						try {
							Thread.sleep(100);
						} catch (InterruptedException e) {
							e.printStackTrace(System.err);
						}
					}
					SwingUtilities.invokeLater(doneCallback);
				}
			});
			bg.start();
		}
		
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new JFrame("Progress Demo");
				frame.setContentPane(new ModalProgressDemo(frame));
				frame.pack();
				frame.setLocationRelativeTo(null);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
	}
	
}