import javax.swing.*;
import acm.graphics.*;
import acm.program.*;
import java.awt.event.*;

public class MyFirstTimer extends GraphicsProgram implements ActionListener {
	public static final int PROGRAM_HEIGHT = 600;
	public static final int PROGRAM_WIDTH = 800;
	public static final int MAX_STEPS = 20;
	private GLabel myLabel;
	private int numTimes = 0;
	
	public void init() {
		setSize(PROGRAM_WIDTH, PROGRAM_HEIGHT);
		requestFocus();
	}
	
	public void run() {
		myLabel = new GLabel("# of times called?", 0, 100);
		add(myLabel);
		Timer someTimerVar = new Timer(1000, this);
		someTimerVar.start();
	}
	
	public void actionPerformed(ActionEvent e) {
		numTimes += 1;
		myLabel.move(5, 0);
		myLabel.setLabel("times called? " + numTimes);
	}
	
	
	public static void main(String[] args) {
		new MyFirstTimer().start();
	}
}